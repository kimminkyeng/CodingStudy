package enum2;

import java.util.Calendar;

public class Test1 {
  public static void main(String[] args) {
    Calendar now = Calendar.getInstance(); // getInstance() 는 메소드.(메소드란, C언어에서는 함수 를 의미)
    
    int year = now.get(Calendar.YEAR); // get은 ()안에 있는것을 읽어 들이는 것.
    int month = now.get(Calendar.MONTH);
    int day = now.get(Calendar.DAY_OF_WEEK);
    int hour = now.get(Calendar.HOUR);
    int minute = now.get(Calendar.MINUTE);
    int second = now.get(Calendar.SECOND);
    
    System.out.println("오늘은? " + year + "년 "+ (month+1) + "월 " + (day+4) +"일 "+ hour +"시 " + minute +"분 " + second + "초 입니다. ");
  }
}
