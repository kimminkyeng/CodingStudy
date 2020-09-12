package t3_operation;

public class Test5 {
  public static void main(String[] args) {
    /* 1.두수를 입력받아서 그중에서 큰수를 출력하시오*/
    int x, y, res;
    x=10;
    y=15;
    res= x>y ? x : y;
    System.out.println("res="+res);
    
    
    /* 2.두수를 입력받아서 큰수를 출력하되 두수의 결과가 같을 경우는 첫번째 수를 출력
     *하시오.(삼항연산자를 두번 사용한다)
     */
    int a, b, z;
    a=10;
    b=20;
    z= a>b ? a : b;
    System.out.println("z="+z);
    
    a=10;
    b=10;
    z= a>b ? a : b;
    System.out.println("z="+z);
  }
}
