package T2_DbTest;

public class DbTestRun {
  public static void main(String[] args) {
    //DB 연결
    DbTest dbTest = new DbTest(); //결과 : Fri Aug 14 19:43:20 KST 2020 WARN: Establishing SSL connection without server's identity verification is not recommended. According to MySQL 5.5.45+, 5.6.26+ and 5.7.6+ requirements SSL connection must be established by default if explicit option isn't set. For compliance with existing applications not using SSL the verifyServerCertificate property is set to 'false'. You need either to explicitly disable SSL by setting useSSL=false, or set useSSL=true and provide truststore for server certificate verification.
  
    //DB 작업(1건의 자료 검색)
    dbTest.searchTest();
    
    // DB 클로우즈
    dbTest.Dbclose();
  }
}
