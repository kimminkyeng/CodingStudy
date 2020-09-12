package array2;
// 2차원 고정배열
public class Test4 {
  public static void main(String[] args) {
    int[][] su = {
        /*{{100,90},{90,80},{70,60}}; //3행 2열*/
        {100,90,80},
        {90,80,70},
        {70,60}
    };
    
      for(int i=0; i<su[0].length; i++) { //su[0].length 은 0번행의 길이(=크기)
        System.out.println("su[0]["+i+"]=" + su[0][i]); // 여기까지 하면 0번행의 길이만 나온다.
      }
      System.out.println();
      
      for(int i=0; i<su[1].length; i++) { //su[1].length 은 1번행의 길이(=크기)
        System.out.println("su[1]["+i+"]=" + su[1][i]); // 여기까지 하면 1번행의 길이만 나온다.
      }
      System.out.println();
      
      for(int i=0; i<su[2].length; i++) { //su[2].length 은 2번행의 길이(=크기)
        System.out.println("su[2]["+i+"]=" + su[2][i]); // 여기까지 하면 2번행의 길이만 나온다.
      }
  }
}
