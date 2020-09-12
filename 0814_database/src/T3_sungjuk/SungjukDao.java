package T3_sungjuk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SungjukDao {
  private Connection conn = null;
  private Statement stmt = null;
  private ResultSet rs = null;
  
  String sql = "";
  
  private String url = "jdbc:mysql://localhost:3306/javadb";
  private String user = "root";
  private String password = "1234";
  
  public SungjukDao() {
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

  public void sungjukInput(SungjukVo vo) {
    int tot = onTotal(vo.getKor(), vo.getEng(), vo.getMat());
    double avg = onAvg(tot);
//    char grade = onGrade(avg);
    vo.setGrade(onGrade(avg));
    
    try {
      stmt = conn.createStatement();
      sql = "insert into sungjuk values (default,"+vo.getHakbun()+",'";
      sql += vo.getName()+"',";
      sql += vo.getKor()+",";
      sql += vo.getEng()+",";
      sql += vo.getMat()+",";
      sql += tot+",";
      sql += avg+",'";
      sql += vo.getGrade()+"',default);";
      //System.out.println("vo=" + vo);
      stmt.executeUpdate(sql);
      System.out.println(vo.getName() + "님의 자료가 입력되었습니다.");
    } catch (SQLException e) {
      System.out.println("SQL 에러" + e.getMessage());
    } finally {
      if(stmt != null)
        try {
          stmt.close();
        } catch (SQLException e) {}
    }
  }

  private String onGrade(double avg) {
    String grade;
    int intAvg = (int)(avg / 10);
    switch(intAvg) {
      case 10: case 9:
        grade = "A";
        break;
      case 8:
        grade = "B";
        break;
      case 7:
        grade = "C";
        break;
      case 6:
        grade = "D";
        break;
      default:
        grade = "F";
    }
    return grade;
  }

  private double onAvg(int tot) {
    double avg = tot/3.0;
    return avg;
  }
  
  private int onTotal(int kor, int eng, int mat) {
    int tot = kor + eng + mat;
    return tot;
  }
  //dao를 이용해서 학번 데이터베이스 검색 (개별자료 검색메소드)
  public SungjukVo getSungjukSearch(int hakbun) {
    SungjukVo vo = new SungjukVo(); //여기 위 필드에 vo가 없으니까 생성.
    try {
      stmt = conn.createStatement();
      sql = "select * from sungjuk where hakbun="+hakbun; //필드에 숫자로 지정되어있으니 '+hakbun;' 이렇게 작성하면됨. 
      rs = stmt.executeQuery(sql);
      
      if(rs.next()) {
        vo.setIdx(rs.getInt("idx"));
        vo.setHakbun(rs.getInt("hakbun"));
        vo.setName(rs.getString("name"));
        vo.setKor(rs.getInt("kor"));
        vo.setEng(rs.getInt("eng"));
        vo.setMat(rs.getInt("mat"));
        vo.setTot(rs.getInt("tot"));
        vo.setAvg(rs.getDouble("avg"));
        vo.setGrade(rs.getString("grade"));
        vo.setWdate(rs.getTimestamp("wdate"));
      }
      else {
        vo = null;
        //System.out.println("검색한 학번이 없습니다.");
      }
    } catch (SQLException e) {
      System.out.println("SQL오류" + e.getMessage());
    }
    return vo;
  }

  public ArrayList<SungjukVo> getSungjukList() {
    ArrayList<SungjukVo> vos = new ArrayList<SungjukVo>();
    
    try {
      stmt = conn.createStatement();
      sql = "select * from sungjuk order by idx desc;";
      rs = stmt.executeQuery(sql);
      
      while(rs.next()) {
        SungjukVo vo = new SungjukVo();
        
        vo.setIdx(rs.getInt("idx"));
        vo.setHakbun(rs.getInt("hakbun"));
        vo.setName(rs.getString("name"));
        vo.setKor(rs.getInt("kor"));
        vo.setEng(rs.getInt("eng"));
        vo.setMat(rs.getInt("mat"));
        vo.setTot(rs.getInt("tot"));
        vo.setAvg(rs.getDouble("avg"));
        vo.setGrade(rs.getString("grade"));
        vo.setWdate(rs.getTimestamp("wdate"));
        
        vos.add(vo);
      }
      
    } catch (SQLException e) {
      System.out.println("SQL 에러 : " + e.getMessage());
    }
    finally {
      try {
        rs.close();
        stmt.close();
      } catch (SQLException e) {}
    }
    return vos;
  }
  
  //성적 DAO의 delete 메소드
  public void SungjukDelete(int hakbun) {
    try {
      stmt = conn.createStatement();
      sql = "select * from sungjuk where hakbun="+hakbun; //필드에 숫자로 지정되어있으니 '+hakbun;' 이렇게 작성하면됨. 
      rs = stmt.executeQuery(sql);
      
      if(rs.next()) {
        rs.close();
        sql = "delete from sungjuk where hakbun=" + hakbun;
        stmt.executeUpdate(sql);
        System.out.println(hakbun + " 자료가 삭제 되었습니다.");
      }
      else {
        System.out.println("검색한 학번이 없습니다.");
      }
    } catch (SQLException e) {
      System.out.println("SQL오류" + e.getMessage());
    } finally {
      try {
        stmt.close();
      } catch (SQLException e) {}
    }
  }

  public void sungjukUpdate(SungjukVo vo, int no) {
    try {
      stmt = conn.createStatement();
      if(no == 1) {
        sql = "update sungjuk set name='" + vo.getName()+ "' where hakbun=" + vo.getHakbun();
        vo.getHakbun();
      }
      else {
        int tot = onTotal(vo.getKor(), vo.getEng(), vo.getMat());
        double avg = onAvg(tot);
        vo.setGrade(onGrade(avg));
        sql = "update sungjuk set kor=" + vo.getKor()+ ", eng=" + vo.getEng()+ ", mat=" + vo.getMat()+ ", tot=" + tot + ", avg=" + avg+ ", grade='" + vo.getGrade()+ "' where hakbun=" + vo.getHakbun();
      }
      stmt.executeUpdate(sql);
      System.out.println("자료가 수정 되었습니다.");
    } catch (SQLException e) {
      System.out.println("SQL 에러 : " + e.getMessage());
    }
  }
}
