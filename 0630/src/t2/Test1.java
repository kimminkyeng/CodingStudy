package t2;

import java.io.IOException;

public class Test1 {
  public static void main(String[] args) throws IOException {
    // keyCode 대문자 Q나 소문자 q로 치면 작업 끝내는 방법
    int keyCode;
    
    while(true) {
      keyCode = System.in.read();
      System.out.println("keyCode = " + keyCode);
      if(keyCode==81 || keyCode==113) break;
    }
    System.out.println("작업끝!!!");
  }
}
