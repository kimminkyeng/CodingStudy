package Homework;

import java.util.Scanner;

public class Test3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[][] word = {
        {"hello","안녕하세요"},
        {"java","자바"},
        {"bye","안녕히가세요"}};
        
    String str;
    System.out.println("영어 입력하면 한글로 번역하는 프로그램(종료시 z 입력)");
    
    while(true) {
      System.out.print("입력해주세요: ");
      str = sc.next();
      if(str.equals("z")) break;
      for(int i=0; i<word.length; i++) {
        if((word[i][0]).equals(str)) {
          System.out.println("번역해주세요: " + word[i][1]);
         }
        }
       }
    System.out.println("======================");
    System.out.println("수고하셨습니다!");
    sc.close();
  }
}
