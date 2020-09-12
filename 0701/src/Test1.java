
public class Test1 {
  public static void main(String[] args) {
    
//    while(true) {
//    int su1 = (int)(Math.random()*6)+1;
//    int su2 = (int)(Math.random()*6)+1;
//    
//    System.out.print("주사위의 합은?");
//    System.out.println("("+su1+","+su2+")");
//    if(su1+su2 == 5) break;
//    }
    
    int cnt = 0;
    
    while(true) {
      cnt++;
      int su1 = (int)(Math.random()*6)+1;
      int su2 = (int)(Math.random()*6)+1;
      System.out.println(cnt+"=("+su1+","+su2+")");
      if(su1+su2 == 5) break;
    }
    System.out.println("두 주사위의 눈금합이 5일때까지 던진 횟수는? " + cnt + "회");
  }
}
