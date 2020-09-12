package array2;
// 2차원 고정배열
public class Test2 {
  public static void main(String[] args) {
    int[][] su = {
        /*{{100,90},{90,80},{70,60}}; //3행 2열*/
        {100,90,80},
        {90,80,70},
        {70,60,50}
    };
    
    System.out.println("su[0][0]=" + su[0][0]);
    System.out.println("su[0][1]=" + su[0][1]);
    System.out.println("su[0][2]=" + su[0][2]);
    System.out.println("su[1][0]=" + su[1][0]);
    System.out.println("su[1][1]=" + su[1][1]);
    System.out.println("su[1][2]=" + su[1][2]);
    System.out.println("su[2][0]=" + su[2][0]);
    System.out.println("su[2][1]=" + su[2][1]);
    System.out.println("su[2][2]=" + su[2][2]);
    System.out.println();
    
    for(int i=0; i<3; i++) {
      for(int j=0; j<3; j++) {
        System.out.println("su["+i+"]["+j+"]=" +su[i][j]);
      }
    }
  }
}
