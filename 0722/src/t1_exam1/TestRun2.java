package t1_exam1;

public class TestRun2 {
  public static void main(String[] args) {
    JumsuVo vo1 = new JumsuVo("홍길동", 100, 80);
    JumsuVo vo2 = new JumsuVo("놀부", 90, 70);
    JumsuVo vo3 = new JumsuVo("흥부", 60, 70);
    JumsuVo vo4 = new JumsuVo("제비", 50, 90);
    
    JumsuService js = new JumsuService();
    
    js.onTotal(vo1);
    js.onAvg(vo1);
    js.display(vo1);
    System.out.println();
    
    js.onTotal(vo2);
    js.onAvg(vo2);
    js.display(vo2);
    System.out.println();
    
    js.onTotal(vo3);
    js.onAvg(vo3);
    js.display(vo3);
    System.out.println();
    
    js.onTotal(vo4);
    js.onAvg(vo4);
    js.display(vo4);
    System.out.println();
  }
}
