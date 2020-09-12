package array1;

// 원본 배열의 내용중 짝수번째 자료만 목적배열에 복사하시오.
public class Test7 {
  public static void main(String[] args) {
    int[] source = {5, 3, 1, 6, 4};
    int[] target = new int[source.length];
    
    for(int i=0; i<source.length; i+=2) {
      target[i] = source[i];
    }
    
    //source자료 출력
    System.out.println("원본자료 출력");
    for(int i=0; i<source.length; i++) {
      System.out.println("source["+i+"]=" + source[i] + " / ");
    }
    System.out.println();
    
    System.out.println("복사자료 출력");
    for(int i=0; i<source.length; i++) {
      System.out.println("target["+i+"]=" + target[i] + " / ");
   }
  } // target에 [2]번쨰, [4]번째만 0으로 나옴.
}
