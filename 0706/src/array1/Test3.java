package array1;
//bubble Sort (오름차순)
public class Test3 {
  public static void main(String[] args) {
    int[] su= {6,2,8,5,4,7};
    int temp;
    
    System.out.println("정렬 전 자료!");
    for(int i=0;i<su.length; i++) {
      System.out.print("su["+i+"] ="  + su[i] + " ");
    }
      System.out.println();
      System.out.println("---------------------------");
    // bubble Sort 오름차순
      for(int i=1; i<=5; i++) { //'i<=5'의 5는 최대 회전 횟수. 5는 배열 6개 빼기 1.
        for(int j=1; j<=6-i; j++) {
          if(su[j-1]>su[j]) { // '>' 만 '<'로 바꾸면 내림차순이 됨. 현재는 오름차순
            temp = su[j-1];
            su[j-1] = su[j];
            su[j] = temp;
          }
        }
      }
    
    //출력
      System.out.println("정렬 후 자료!");
      for(int i=0; i<su.length; i++) {
        System.out.print("su["+i+"] ="  + su[i] + " ");
    }
  }
}
