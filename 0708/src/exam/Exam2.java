package exam;

public class Exam2 {
  public static void main(String[] args) { // void는 return Type!!
    int[] su = {3,6,9,13,16,19,23,26,29,30,31,32,33,34,35,36,37,38,39,43,46,49,53,56,59,60,61,62,63,64,65,66,67,68,69,73,76,79,83,86,89,90,91,92,93,94,95,96,97,98,99};
    char str;
    
    for(int i=1; i<100; i++) {
      for(int j=0; j<su.length; j++) {
        if(i == su[j]) { // 안쪽 for문 길이 많큼 가야해서 i가 su[j]랑 비교해야 함.
          if(i == 3) System.out.println(i + " : 짝"); //3, 6, 9에 박수치기
          else if(i == 6) System.out.println(i + " : 짝짝");
          else if(i == 9) System.out.println(i + " : 짝짝짝");
          else {
          str = Integer.toString(su[j]).charAt(1); // Integer.parseInt(). su[j]를 문자로 바꿔서 str에 넣었다.
         
          if(str == '3') System.out.println(i + " : 짝");
          else if(str == '6') System.out.println(i + " : 짝짝");
          else if(str == '9') System.out.println(i + " : 짝짝짝");
          }
        }
      }
    }
  }
}
