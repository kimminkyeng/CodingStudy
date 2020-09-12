package com.java.mbc;

//import com.java.atom.seoul.Test3; //14번줄 new Test3() 입력 후, ctrl+space bar 치면 나옴.
//import com.java.atom.seoul.Test1;
import com.java.atom.seoul.*; // seoul 패키지 밑에 있는 모든 클래스를 참고하겠다는 의미.

//import com.java.atom.seoul.Test1;
//import com.java.atom.Test1; // 같은 이름의 Test1 클래스를 동시에 '호출 불가'.

public class TestRun {
  public static void main(String[] args) {
   // com.java.atom.seoul.Test1 st = new com.java.atom.seoul.Test1();
   // com.java.atom.Test1 at new com.java.atom.Test1();
    
    com.java.mbc.Test1 st = new com.java.mbc.Test1();
    // new Test3();
    st.mbcT1();
    
    Test3 t3 = new Test3();
    t3.seoulT3();
    
    Test1 st1 = new Test1();
    // st1.seoulT1();
  }
}
