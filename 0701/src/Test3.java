import java.util.Scanner;

public class Test3 {
  public static void main(String[] args) {
    /*1개의 주사위를 던져서 나오는 값을 알아맞추는 게임(최종적으로 맞춘 횟수를 출력) */
    Scanner sc = new Scanner(System.in);
    
    int su1, cnt=0;
    int res = (int)(Math.random()*6)+1;
    System.out.println("주사위가 표시될 숫자를 입력하세요");
    
    while(true) {
      cnt++;
      System.out.print("주사위값은 얼마인가요?");
      su1 = sc.nextInt(); 
      
    if(su1 <= 0 || su1 > 6) {
      System.out.println("1에서 6까지의 값만 입력하세요");
      continue;
      }
    if(res != su1) {
      System.out.println("아깝습니다. 다시 입력하세요!");
      continue;
      }
    else break; 
    }
    System.out.println("정답입니다. 맞추신 횟수는 "+ cnt +"번 이군요!" );
    sc.close();
  }
}
