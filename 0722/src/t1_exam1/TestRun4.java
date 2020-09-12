package t1_exam1;

public class TestRun4 {
  public static void main(String[] args) {
    JumsuVo vo1 = new JumsuVo("홍길동", 100, 80);
    JumsuVo vo2 = new JumsuVo("놀부", 90, 70);
    JumsuVo vo3 = new JumsuVo("흥부", 60, 70);
    JumsuVo vo4 = new JumsuVo("제비", 50, 90);
    
    JumsuService js = new JumsuService();
    
    //JumsuVo[] vo = {}; //vo1~vo4 객체명이 {}에 들어감.
    JumsuVo[] vo = {vo1,vo2,vo3,vo4};
    //JumsuVo[] vo = {"vo1","vo2","vo3","vo4"}; 이렇게쓰면 vo1~vo4가 String 처리됨. 사용하면 안됨. 
    
   for(int i=0; i<vo.length; i++) {
    JumsuVo item = vo[i]; //item 을 JumsuVo 타입으로 사용!
     
    js.onTotal(item); 
    js.onAvg(item);
    js.display(item);
    System.out.println();
   }
  }
}
