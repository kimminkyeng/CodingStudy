package CourierService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JOptionPane;

public class CourierDao {
  private static final String DRIVER = "com.mysql.jdbc.Driver";
  private static final String url = "jdbc:mysql://localhost:3306/javadb";
  private static final String uid = "root";
  private static final String pwd = "1234";

  Connection conn = null;
  PreparedStatement pstmt = null;
  ResultSet rs = null;
  String sql = "";
  
  Vector vData;

  public CourierDao() {}
  
  //DB연결 메소드
  public Connection getConn() {
    try {
      Class.forName(DRIVER);
      conn = DriverManager.getConnection(url, uid, pwd);
    } catch (ClassNotFoundException e) {
      System.out.println("드라이버 로드 오류...");
    } catch (SQLException e) {
      System.out.println("데이터베이스 연결오류...");
    }
    return conn;
  }
  
  //DB Close메소드
  public void connClose() {
    try {
      conn.close();
    } catch (SQLException e) {}
  }

  public void courierInput(CourierVo vo) {
    try {
      conn = getConn();
      // 보관함의 비어있는곳 번호 가져오기
      sql = "select idx from courier_save where state = '비었음' order by idx";
      pstmt = conn.prepareStatement(sql);
      rs = pstmt.executeQuery();
      if(rs.next()) {
        int save_idx = rs.getInt("idx");  // 비어있는 보관함 번호
        rs.close();
        pstmt.close();
        
        // 택배물품 정보 저장하기
        sql = "insert into courier values (default,?,?,?,?,?,?,?,?)";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, vo.getPart());
        pstmt.setString(2, vo.getArrival());
        pstmt.setString(3, vo.getProduct());
        pstmt.setString(4, vo.getReceive());
        pstmt.setString(5, vo.getSend());
        pstmt.setInt(6, vo.getCost());
        pstmt.setInt(7, save_idx);
        pstmt.setString(8, vo.getBigo());
        pstmt.executeUpdate();
        
        // 보관함에 택배정보 저장하기(먼저 courier테이블에서 고유번호를 가져와서 courier_save테이블에 저장한다.)
        pstmt.close();
        sql = "select max(idx) from courier";
        pstmt = conn.prepareStatement(sql);
        rs = pstmt.executeQuery();
        rs.next();
        int customer_idx = rs.getInt(1) + 1;
        rs.close();
        pstmt.close();
        
        // 비어있던 보관함에 택배 정보를 갱신해 준다.
        sql = "update courier_save set state='보관중',customer_idx=?,customer_name=? where idx=?";
        pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, customer_idx);
        pstmt.setString(2, vo.getReceive());
        pstmt.setInt(3, save_idx);
        pstmt.executeUpdate();
      }
      else {
        JOptionPane.showMessageDialog(null, "비어있는 보관함이 없습니다.");
        rs.close();
      }
    } catch (SQLException e) {
      System.out.println("SQL에러: "+sql+"\n");
      e.printStackTrace();
    } finally {
      try {
        if(pstmt != null || !pstmt.isClosed()) pstmt.close();
        connClose();
      } catch (SQLException e) {}
    }
  }

  // 전체자료 조회
  public Vector courierList() {
    vData = new Vector();
    try {
      conn = getConn();
      sql = "select * from courier order by idx desc";
      pstmt = conn.prepareStatement(sql);
      rs = pstmt.executeQuery();
      
      while(rs.next()) {
        Vector vo = new Vector();
        String arrival = rs.getString("arrival").substring(0, 10);
        int cost = rs.getInt("cost");
        String strCost = String.format("%,d", cost);
        
        vo.add(rs.getInt("idx"));
        vo.add(rs.getString("part"));
        vo.add(arrival);
        vo.add(rs.getString("product"));
        vo.add(rs.getString("receive"));
        vo.add(rs.getString("send"));
        vo.add(strCost);
        vo.add(rs.getInt("save_idx"));
        vo.add(rs.getString("bigo"));
        
        vData.add(vo);
        //System.out.println("vData=====" + vData);
      }
    } catch (SQLException e) {
      System.out.println("SQL 오류 : " + e.getMessage());
    } finally {
        try {
          if(rs != null || !rs.isClosed()) rs.close();
          if(pstmt != null || !pstmt.isClosed()) pstmt.close();
          if(conn != null || !conn.isClosed()) conn.close();
        } catch (SQLException e) {}
    }
    
    return vData;
  }
  
  // 조건자료 검색('택배도착일자'와 '분류' 검색도 포함 - if문 두번째와 세번째) 
  public Vector courierSearch(String gubun, String word) {
    vData = new Vector();
    try {
      conn = getConn();
      if(gubun.equals("idx")) {
        sql = "select * from courier where idx = ? order by idx desc";
        pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, Integer.parseInt(word));
      }
      else if(gubun.equals("arrival")) {
        sql = "select * from courier where arrival = ? order by idx desc";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, word);
      }
      else if(gubun.equals("part")) {
        sql = "select * from courier where part = ? order by idx desc";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, word);
      }
      else {
        sql = "select * from courier where "+gubun+" like '%"+word+"%' order by idx desc";
        pstmt = conn.prepareStatement(sql);
        //pstmt.setString(1, "'%"+word+"%'");
      }
      rs = pstmt.executeQuery();
      while(rs.next()) {
        String arrival = rs.getString("arrival").substring(0, 10);
        int cost = rs.getInt("cost");
        String strCost = String.format("%,d", cost);
        
        Vector vo = new Vector();
        vo.add(rs.getInt("idx"));
        vo.add(rs.getString("part"));
        vo.add(arrival);
        vo.add(rs.getString("product"));
        vo.add(rs.getString("receive"));
        vo.add(rs.getString("send"));
        vo.add(strCost);
        vo.add(rs.getString("save_idx"));
        vo.add(rs.getString("bigo"));
        
        vData.add(vo);
        //System.out.println(vData);
      }
    } catch (SQLException e) {
      System.out.println("SQL에러: "+sql+"\n");
      e.printStackTrace();
    } finally {
      try {
        rs.close();
        pstmt.close();
        connClose();
      } catch (SQLException e) {}
    }
    return vData;
  }

  public ArrayList<String> getArrival() {
    ArrayList<String> naljaVos = new ArrayList<>();
    
    try {
      conn = getConn();
      sql = "select arrival from courier group by arrival order by arrival desc";
      pstmt = conn.prepareStatement(sql);
      rs = pstmt.executeQuery();
      while(rs.next()) {
        naljaVos.add(rs.getString("arrival").substring(0,10));
      }
    } catch (SQLException e) {
      System.out.println("SQL에러: "+sql+"\n");
      e.printStackTrace();
    } finally {
      try {
        rs.close();
        pstmt.close();
        connClose();
      } catch (SQLException e) {}
    }
    return naljaVos;
  }

  public ArrayList<String> getPart() {
    ArrayList<String> partVos = new ArrayList<>();
    
    try {
      conn = getConn();
      sql = "select part from courier group by part";
      pstmt = conn.prepareStatement(sql);
      rs = pstmt.executeQuery();
      while(rs.next()) {
        partVos.add(rs.getString("part"));
      }
    } catch (SQLException e) {
      System.out.println("SQL에러: "+sql+"\n");
      e.printStackTrace();
    } finally {
      try {
        rs.close();
        pstmt.close();
        connClose();
      } catch (SQLException e) {}
    }
    return partVos;
  }
 //택배함에 저장되어있던 목록 가져오기
  public ArrayList<CourierSaveVo> courierSaveList() {
    ArrayList<CourierSaveVo> vos = new ArrayList<>();
    try {
      conn = getConn();
      sql = "select * from courier_save order by idx";
      pstmt = conn.prepareStatement(sql);
      rs = pstmt.executeQuery();
      while(rs.next()) {
        CourierSaveVo vo = new CourierSaveVo();
        
        vo.setIdx(rs.getInt("idx"));
        vo.setState(rs.getString("state"));
        vo.setCustomer_idx(rs.getInt("customer_idx"));
        vo.setCustomer_name(rs.getString("customer_name"));
        
        vos.add(vo);
      }
    } catch (SQLException e) {
      System.out.println("SQL에러: "+sql+"\n");
      e.printStackTrace();
    } finally {
      try {
        rs.close();
        pstmt.close();
        connClose();
      } catch (SQLException e) {}
    }
    return vos;
  }
  // 택배함에 저장되어 있는 상태 조회('보관중/비었음')
  public int courierSaveState() {
    try {
      conn = getConn();
      sql = "select count(idx) from courier_save where state='보관중'";
      pstmt = conn.prepareStatement(sql);
      rs = pstmt.executeQuery();
      if(rs.next()) return rs.getInt(1);
    } catch (SQLException e) {
      System.out.println("SQL에러: "+sql+"\n");
      e.printStackTrace();
    } finally {
      try {
        rs.close();
        pstmt.close();
        connClose();
      } catch (SQLException e) {}
    }
    return 0;
  }

}
