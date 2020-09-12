package t2;

import java.util.Scanner;

public class Test4 {
  public static void main(String[] args) {
    /* a는 학생, b는 회사원, c는 공무원, d는 군인*/
    /* 1은 국가고시, 2는 자격시험, 3은 입사시험*/
    /* a가(학생이) 입력되면 '국가고시와 자격시험을 볼 수 있습니다.' 라고 처리하고 */
    /* b가(회사원이) 입력되면 '국가고시와 입사시험을 볼 수 있습니다.' 라고 처리하고*/
    /* c가(공무원이) 입력되면 '자격시험을 볼 수 있습니다.' 라고 처리하고*/
    /* d가(군인이) 입력되면 '모든시험을 볼 수 있습니다.' 라고 처리할것*/
    /* 단, a/b/c/d 대신에 '학생/회사원/공무원/군인' 으로 입력할 수도 있다. */
    /*그동안 배웠던 if나 스위치케이스 기법등 배웠던것에 한해서 사용해볼것*/
    Scanner sc = new Scanner(System.in);
    
//    String job;
//    System.out.println("당신의 직업을 입력하세요.");
//    job = sc.nextLine();
//    
//    switch(job.charAt(0)) {
//      case 'a':
//        System.out.println("국가고시 응시가능");
//        System.out.println("자격시험 응시가능");
//      break;
//      
//      case 'b':
//        System.out.println("국가고시 응시가능");
//        System.out.println("입사시험 응시가능");
//      break;
//      
//      case 'c':
//        System.out.println("자격시험 응시가능");
//      break;
//      
//      case 'd':
//        System.out.println("모든시험 응시가능");
//      break;
//      
//      default :
//        System.out.println("작업끝!!!");
//    }
    
      String job;
      boolean res=true;
      
      while(res) {
        System.out.println("당신의 직업은 무엇입니까?");
        job = sc.nextLine();
        
        if(job.equals("a")||job.equals("학생")) {
          System.out.println("국가고시와 자격시험 응시가능");
        break;
        }
        else if(job.equals("b")||job.equals("회사원")) {
          System.out.println("국가고시와 입사시험 응시가능");
        break;}
        
        else if(job.equals("c")||job.equals("공무원")) {
          System.out.println("자격시험 응시가능");
        break;}
        
        else if(job.equals("d")||job.equals("군인")) {
          System.out.println("모든시험 응시가능");
        break;}
      }        
      System.out.println("작업끝!!");
      
      sc.close();
 }
}

