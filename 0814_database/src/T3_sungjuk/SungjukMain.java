package T3_sungjuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungjukMain {
  static Scanner sc = new Scanner(System.in);
  static SungjukVo vo = new SungjukVo();
  static SungjukDao dao = new SungjukDao();
  
  public static void main(String[] args) {
    boolean flag = true;
    int no;
    
    while(flag) {
      System.out.println();
      System.out.println("## 작업할 번호를 입력하세요 ##");
      System.out.print("1.점수입력  2.전체자료조회  3.개별자료조회 4.자료수정 5.삭제 6.종료 ");
      no = sc.nextInt();
      
      switch(no) {
        case 1:
          sungjukInput();  // 성적입력
          break;
        case 2:
          sungjukList(); // 전체자료조회
          break;
        case 3:
          sungjukSearch(); // 개별자료 조회
          break;
        case 4:
          sungjukUpdate(); //자료수정
          break;
        case 5:
          sungjukDelete(); // 개별자료삭제
          break;
        default:
          dao.dbClose();
          System.out.println(">>> 작업 종료...<<<");
          flag = false;
      }
    }
  }
  
  //4. 자료수정
  private static void sungjukUpdate() {
   System.out.print("수정할 학번을 입력하세요. ");
    int hakbun = sc.nextInt();
    
    vo = dao.getSungjukSearch(hakbun);
    if(vo == null) {
      System.out.println("수정할 학번이 없습니다.");
    }
    else {
      //아래로 자료가 있을경우에 수정처리하는 부분
      String[] title = {"성명","국어점수","영어점수","수학점수"};
      int[] value = new int[4];
      
      System.out.println("수정할 항목을 선택하세요.(1:성명, 2:점수) ");
      int no = sc.nextInt();
      
      if(no == 1) {
        System.out.println("수정할 " + title[0] +" 을 입력하세요.");
        vo.setName(sc.next());
      } 
      else {
        for(int i=1; i<title.length; i++) {
          System.out.println("수정할 " + title[i] +" 을 입력하세요.");
          value[i] = sc.nextInt();
        }
        vo.setKor(value[1]);
        vo.setEng(value[2]);
        vo.setMat(value[3]);
      }
      vo.setHakbun(hakbun);
      dao.sungjukUpdate(vo, no);
    }
  }
  //5. 삭제
  private static void sungjukDelete() {
    System.out.print("삭제할 학번을 입력하세요. ");
    int hakbun = sc.nextInt();
    
    dao.SungjukDelete(hakbun);
  }

  //2.전체 자료 조회
  private static void sungjukList() {
    ArrayList<SungjukVo> vos = dao.getSungjukList();
    // 전체 자료 출력부분
    System.out.println("==============================================================================");
    System.out.println("번호\t학번\t성명\t국어\t영어\t수학\t총점\t평균\t학점\t날짜");
    System.out.println("------------------------------------------------------------------------------");
    
    for(int i=0; i<vos.size(); i++) {
      vo = vos.get(i);
      System.out.println(vo.getIdx()+"\t"+vo.getHakbun()+"\t"+vo.getName()+"\t"+vo.getKor()+"\t"+vo.getEng()+"\t"+vo.getMat()+"\t"+vo.getTot()+"\t"+vo.getAvg()+"\t"+vo.getGrade()+"\t"+vo.getWdate().toString().substring(0, 10));
    }
    System.out.println();
  }

  //3.개별 자료 조회
  private static void sungjukSearch() {
    System.out.print("검색할 학번을 입력하세요. ");
    int hakbun = sc.nextInt();
    
    vo = dao.getSungjukSearch(hakbun);
    
    if(vo != null) {
      System.out.println("========================================");
      System.out.println("번호\t학번\t성명\t국어\t영어\t수학\t총점\t평균\t학점\t날짜");
      System.out.println("----------------------------------------");
      System.out.println(vo.getIdx()+"\t"+vo.getHakbun()+"\t"+vo.getName()+"\t"+vo.getKor()+"\t"+vo.getEng()+"\t"+vo.getMat()+"\t"+vo.getTot()+"\t"+vo.getAvg()+"\t"+vo.getGrade()+"\t"+vo.getWdate().toString().substring(0, 10));
    }
    else {
      System.out.println("검색한 학번이 없습니다.");
    }
  }
  //성적 자료 입력
  private static void sungjukInput() {
    String[] title = {"학번","성명","국어점수","영어점수","수학점수"};
    String[] value = new String[5];
    
    for(int i=0;i<title.length;i++) {
      System.out.print(title[i] + "을[를] 입력하세요. ");
      value[i] = sc.next();
    }
    
    vo.setHakbun(Integer.parseInt(value[0]));
    vo.setName(value[1]);
    vo.setKor(Integer.parseInt(value[2]));
    vo.setEng(Integer.parseInt(value[3]));
    vo.setMat(Integer.parseInt(value[4]));
    
    dao.sungjukInput(vo);
    
  }
}
