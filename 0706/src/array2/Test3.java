package array2;
// 2차원 고정배열
public class Test3 {
  public static void main(String[] args) {
    int[][] su = {
        /*{{100,90},{90,80},{70,60}}; //3행 2열*/
        {100,90,80},
        {90,80,70},
        {70,60,50}
    };
    
    for(int i=0; i<su.length; i++) {
      for(int j=0; j<su[0].length; j++) { //su[0].length 은 0번행의 길이
        System.out.println("su["+i+"]["+j+"]=" +su[i][j]);
      }
    }
  }
}
