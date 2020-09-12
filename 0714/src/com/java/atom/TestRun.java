package com.java.atom;

import com.java.atom.seoul.Test2;
import com.java.atom.seoul.Test3;

//import com.java.atom.seoul.*; // Window-Preference-java-code style-organize import-number of import 그 두개부분 1로 변경.

//import com.java.atom.seoul.Test2;
//import com.java.atom.seoul.Test3; // 7번줄 다 입력 후, ctrl+shift+알파벳 'o' 동시에 누르면 됨.


public class TestRun {
  public static void main(String[] args) {
    Test3 t3 = new Test3();
    t3.seoulT3();
    
    Test2 t2 = new Test2();
    t2.seoulT2();
  }
}
