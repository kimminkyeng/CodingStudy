package t1_Array;

/*
 * 배열 : 동질성(같은 성격과 길이)의 자료의 집합 - 배열은 참조형(메모리가 heap 영역에 저장된다.)
 * 선언 : 
 * 선언 1번 방법 String[] names = nu11;
 *  names = new String[크기];
 * 선언 2번 방법
 * String[] names = null;
 * names = new String[] {"값1","값2"
"값3","값4","값5"} 
   선언 3번 방법
   String[] names = new String[5];
   선언 4번 방법
   names1 = new String[] {"값1","값2"
"값3","값4","값5"};
*/

public class Test1 {
  public static void main(String[] args) {
    // names1과 names3은 초기값이 null로 크기가 5개인 String형 배열이다.
    String[] names1 = null;
    names1 = new String[5];
    
    String[] names3 = new String[5];
 // names2과 names4은 초기값을 사용자가 지정한 것으로, 값의 갯수가 5개 이므로, 크기가 5개인 String형 배열이다.
    String[] names2 = null;
    names2 = new String[] {"홍길동","홍길순","홍길자","홍길만","홍길수"
    };
    String[] names4 = {"홍길동","홍길순","홍길자","홍길만","홍길수"
    };
    
    //배열에 들어있는 값을 출력해 보자...
    System.out.println("names1배열의 크기?" + names1.length);
    System.out.println("names1[0]=" + names1[0]);
    System.out.println("names1[1]=" + names1[1]);
    System.out.println("names1[2]=" + names1[2]);
    System.out.println("names1[3]=" + names1[3]);
    System.out.println("names1[4]=" + names1[4]);
    System.out.println("=============================");
    
    //names3 배열의 크기와 값을 출력
    System.out.println("names3배열의 크기"+ names3.length);
    for(int i=0; i<names3.length; i++)
      System.out.println("names3["+i+"]=" + names3[i]);
    System.out.println("=============================");
    
    //names2 배열의 크기와 값을 출력
    System.out.println("names2배열의 크기"+ names2.length);
    for(int i=0; i<names2.length; i++)
      System.out.println("names2["+i+"]=" + names2[i]);
  
     System.out.println("names4배열의 크기"+ names4.length);
     for(int i=0; i<names4.length; i++)
     System.out.println("names4["+i+"]=" + names4[i]);
  }
}


