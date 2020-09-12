package t2;

import java.io.IOException;

public class Test2 {
  public static void main(String[] args) throws IOException {
    int keyCode;
    
    while(true) {
      keyCode = System.in.read();
      System.out.println("keyCode = " + keyCode);
    }
  }
}
