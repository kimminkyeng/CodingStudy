package array1;

import java.util.Scanner;

//Bubble Sort (오름차순) - 자료 입력처리 (입력자료는 100개 이하)
public class Test4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // 자료 입력받으려면 넣어야 한다.
    
    int[] su= new int[100] ; //배열의 단점은 크기를 고정 시킬 수 밖에 없다.(입력자료 = 배열의 크기)
    int temp, cnt=0;
    
    // 자료 입력루틴
    while(true) {
      System.out.print("정렬할 원본 자료를 입력하세요.(종료시는 999) ");
      su[cnt] = sc.nextInt();
      
      if(su[cnt] == 999) break; // 숫자이기때문에 '.equals' 가 아닌 '==' 이 들어감.
      
      cnt++;
    }
    System.out.println("정렬 전 자료!");
    for(int i=0;i<cnt; i++) { // 숫자 세고있는것은 'cnt' 이기 때문에 'i<cnt' 로 입력해야됨.
      System.out.print("su["+i+"] ="  + su[i] + " ");
    }
      System.out.println();
      System.out.println("---------------------------");
      
    // Bubbles Sort 오름차순
      for(int i=1; i<=cnt-1; i++) { //'i<=cnt-1'의 cnt는 최대 회전 횟수. 5는 배열 6개 빼기 1.
        for(int j=1; j<=cnt-i; j++) {
          if(su[j-1]>su[j]) { // '>' 만 '<'로 바꾸면 내림차순이 됨. 현재는 오름차순
            temp = su[j-1];
            su[j-1] = su[j];
            su[j] = temp;
          }
        }
      }
    
    //출력
      System.out.println("정렬 후 자료!");
      for(int i=0; i<cnt; i++) {
        System.out.print("su["+i+"] ="  + su[i] + " ");
    }
      sc.close();
  } //순위 구하는 알고리즘은 정렬과 비슷함.
}
