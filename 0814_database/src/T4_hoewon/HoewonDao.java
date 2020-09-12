package T4_hoewon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class HoewonDao {
  private Connection conn = null;
  private PreparedStatement pstmt= null;
  private ResultSet rs = null;
  
  String sql = "";
  
  private String url = "jdbc:mysql://localhost:3306/javadb";
  private String user = "root";
  private String password = "1234";
  
  public HoewonDao() {
    try {
      Class.forName("com.mysql.jdbc.Driver");
      conn = DriverManager.getConnection(url, user, password);
    } catch (ClassNotFoundException e) {
      System.out.println("driver 검색 실패.....");
    } catch (Exception e) {
      System.out.println("DB 연결오류.....");
    }
  }
  
  public void dbClose() {
    try {
      conn.close();
    } catch (SQLException e) {}
  }

  public void hoewonInput(HoewonVo vo) {
    try {
      sql = "insert into hoewon values (default,?,?,?,?,?,?,default);"; // ? 하는 이유는 PreparedStatement 선언했기 때문에(아이디부터 주소까지 못봄)
      pstmt = conn.prepareStatement(sql);
      pstmt.setString(1, vo.getHid()); //pstmt.setString(1, vo.getHid()); 에서 숫자는 '?' 순서다. 즉, 첫번째물음표.
      pstmt.setString(2, vo.getPwd());
      pstmt.setString(3, vo.getName());
      pstmt.setString(4, vo.getGender());
      pstmt.setString(5, vo.getJob());
      pstmt.setString(6, vo.getAddress());
      pstmt.executeUpdate();
      System.out.println("회원가입이 성공적으로 되었습니다.");
    } catch (SQLException e) {
      System.out.println("SQL오류 : " + e.getMessage());
    }finally {
      try {
       if(pstmt !=null || pstmt.isClosed()) pstmt.close(); //굳이 else 처리 안해도 됨.(if안에서 '||' 선택문을 했기 때문에, 에러 날리가 없어서) 
      } catch (SQLException e) {}
    }
  }

  //(중복)아이디 체크 메소드
  public int hoewonIdCheck(String hid) {
    try {
      sql = "select hid from hoewon where hid=?";
      pstmt = conn.prepareStatement(sql);
      pstmt.setString(1, hid);
     rs = pstmt.executeQuery(); //Query는 받는것이 있어야 한다. 
     if(rs.next()) return 1;
   } catch (SQLException e) {
     System.out.println("SQL 에러 : " + e.getMessage());  
   } finally {
      try {
      if(rs != null || !rs.isClosed()) rs.close();
      if(pstmt != null || !pstmt.isClosed()) pstmt.close();
    } catch(SQLException e) {}
   }
    return 0;
  }
  
  //2. 전체회원조회
  public ArrayList<HoewonVo> getHoewonList() {
    ArrayList<HoewonVo> vos = new ArrayList<HoewonVo>();
    
    try {
      sql = "select * from Hoewon order by idx desc;";
      pstmt = conn.prepareStatement(sql);
      rs = pstmt.executeQuery(sql);
      
      while(rs.next()) {
        HoewonVo vo = new HoewonVo();
        
        vo.setIdx(rs.getInt("idx"));
        vo.setHid(rs.getString("hid"));
        vo.setPwd(rs.getString("pwd"));
        vo.setName(rs.getString("name"));
        vo.setGender(rs.getString("gender"));
        vo.setJob(rs.getString("job"));
        vo.setAddress(rs.getString("address"));
        vo.setJoinday(rs.getString("joinday"));
        vos.add(vo);
      }
      
    } catch (SQLException e) {
      System.out.println("SQL 에러 : " + e.getMessage());
    }
    finally {
      try {
        rs.close();
        pstmt.close();
      } catch (SQLException e) {}
    }
    return vos;
  }

  public void hoewonDelete(String hid) {
    try {
        sql = "delete from hoewon where hid=?";
        pstmt= conn.prepareStatement(sql);
        pstmt.setString(1, hid);
        pstmt.executeUpdate();
        System.out.println(hid + " 자료가 삭제 되었습니다.");
    } catch (SQLException e) {
      System.out.println("SQL오류" + e.getMessage());
    } finally {
      try {
        if(pstmt != null || !pstmt.isClosed()) pstmt.close();
      } catch (SQLException e) {}
    }
  }

  public void hoewonUpdate(String hid, String str, String content) {
    try {
      sql = "update hoewon set "+str+"=? where hid=?";
      pstmt = conn.prepareStatement(sql);
      pstmt.setString(1,content);
      pstmt.setString(2, hid);
      pstmt.executeUpdate();
      System.out.println("회원정보가 수정되었습니다.");
    } catch (SQLException e) {
      System.out.println("회원정보가 수정되지 않았습니다.(SQL 에러) : " + e.getMessage());
    } finally {
      try {
        if(pstmt != null || !pstmt.isClosed()) pstmt.close();
      } catch (SQLException e) {}
    }
  }
}
