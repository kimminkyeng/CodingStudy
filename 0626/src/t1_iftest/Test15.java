package t1_iftest;

public class Test15 {
  public static void main(String[] args) {
    /* 두개의 한문자를 입력받아서 큰 문자와 문자코드값의 차(int)를 출력하시오*/
//    char A, B
    char a = 'A';
    int i=1;
    
    char result=(char)(a+i);
    int intresult = a + i;
    
    System.out.println(result);
    System.out.println(intresult);
    
    char b = 'B';
    int j=1;
    
    char Result=(char)(b+j);
    int intResult = b + j;
    
    System.out.println(Result);
    System.out.println(intResult);
    
    System.out.println(Result-result);
    System.out.println(intResult-intresult);
  }
}
