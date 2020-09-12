package T2_DbTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DbTest {
  private Connection conn;
  public DbTest() {
    try {
      //드라이버 검색.
      Class.forName("com.mysql.jdbc.Driver");
      //데이터베이스 연결.
      String url = "jdbc:mysql://localhost:3306/javadb";
      String user = "root";
      String password = "1234";
      conn = DriverManager.getConnection(url, user, password);
    } catch (ClassNotFoundException e) {
      System.out.println("드라이버 검색실패...." + e.getMessage());
    } catch (Exception e) {
      System.out.println("DB연결 실패...." + e.getMessage());
    }
  }
  
  public void Dbclose() {
    try {
      conn.close();
    } catch (SQLException e) {}
  }
  public void searchTest() {
    Statement stmt = null;  
    ResultSet rs = null;
    String sql = "";
    
    try {
      stmt = conn.createStatement();
      sql = "select * from test1 where seq=2;";
      rs = stmt.executeQuery(sql);
     // System.out.println("SQL 성공");
      
      if(rs.next()) {
        int seq = rs.getInt("seq");
        String name = rs.getString("name");
        String email = rs.getString("email");
        String gender = rs.getString("gender");
        String addr = rs.getString("addr");
        
        System.out.println("고유번호 : " + seq);
        System.out.println("성명 : " + name);
        System.out.println("이메일 : " + email);
        System.out.println("성별 : " + gender);
        System.out.println("주소 : " + addr);
      }
      else {
        System.out.println("검색된 자료가 없습니다.");
      }
    } catch (SQLException e) {
      System.out.println("SQL에러....." + e.getMessage());
    } finally {
      if(rs != null)
        try {
          rs.close();
          if(stmt != null) stmt.close();
        } catch (SQLException e) {}
    }
  }
}
