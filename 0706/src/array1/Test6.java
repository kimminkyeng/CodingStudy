package array1;

// 배열 복사
public class Test6 {
  public static void main(String[] args) {
    int[] source = {5, 3, 1, 6, 4};
    int[] target = new int[source.length];
    
    for(int i=0; i<source.length; i++) {
      target[i] = source[i];
    }
    
    //source자료 출력
    System.out.println("원본자료 출력");
//    for(int i=0; i<source.length; i++) {
//      System.out.print("source["+i+"]=" + source[i] + " / ");
//    }
    // 향상된 for문 형식 : for(타입 변수 : 배열명) { }
    int cnt=0;
    for(int i : source) {
      System.out.print("source["+cnt+"]=" + i + " / ");
      cnt++;
    }
    System.out.println();
    
    System.out.println("복사자료 출력");
//    for(int i=0; i<source.length; i++) {
//    System.out.print("target["+i+"]=" + target[i] + " / ");
//   }
    cnt=0; // 'int cnt=0;' 로 선언할 수 없는 이유는 19번줄에 선언했기 때문에 같은 변수로 선언할 수 없다. 그래서 'cnt=0;' 로 작성하는것.
    for(int i : target) {
      System.out.print("target["+cnt+"]=" + i + " / ");
      cnt++;
    }
  }
}
