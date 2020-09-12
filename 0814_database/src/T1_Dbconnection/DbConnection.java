package T1_Dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
  public static void main(String[] args) {
    Connection conn = null;
    try {
      Class.forName("com.mysql.jdbc.Driver");
      System.out.println("드라이버 검색 완료");
      conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb", "root", "1234"); //Connection.java.sql임. DriverManager.getConnection(url, user, password).
      System.out.println("database 연결성공!!!");
    } catch (ClassNotFoundException e) {
      // e.printStackTrace(); <-이걸로 검색하면 에러나옴.
      System.out.println("드라이버 검색 실패...."+ e.getMessage()); //결과 : 드라이버 검색완료.
    } catch (Exception e) {
      System.out.println("database 연결실패.....");
      //e.printStackTrace();
    } finally {
      try {
        conn.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }
}
