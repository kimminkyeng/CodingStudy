package Pre0626;

public class Test2 {
  public static void main(String[] args) {
    int x=10, y=20, tmp = 0;
    System.out.println("x:" + x +"y:" + y);
    
    tmp=x;
    x=y;
    y=tmp;
    
    System.out.println("x:" + x +"y:" + y);
  }
}
