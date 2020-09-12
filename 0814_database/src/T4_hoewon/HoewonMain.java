package T4_hoewon;

import java.util.ArrayList;
import java.util.Scanner;

public class HoewonMain {
  static Scanner sc = new Scanner(System.in);
  static HoewonVo vo = new HoewonVo();
  static HoewonDao dao = new HoewonDao();
  
  public static void main(String[] args) {
    boolean flag = true;
    int no;
    
    while(flag) {
      System.out.println();
      System.out.println("## 작업할 번호를 입력하세요 ##");
      System.out.print("1.회원가입  2.전체회원조회  3.회원정보수정 4.회원탈퇴 5.종료 ");
      no = sc.nextInt();
      
      switch(no) {
        case 1:
          hoewonInput();  // 회원가입
          break;
        case 2:
          hoewonList(); // 전체회원조회
          break;
        case 3:
         hoewonUpdate(); // 회원정보수정
          break;
        case 4:
          hoewonDelete(); //회원탈퇴
          break;
        default:
          dao.dbClose();
          System.out.println(">>> 작업 종료...<<<");
          flag = false;
      }
    }
    
  }
  //회원정보수정
  private static void hoewonUpdate() {
    System.out.print("수정할 아이디를 입력하세요. ");
    String hid = sc.next();
    
    // 회원 아이디 검색
    int idCheck = dao.hoewonIdCheck(hid);
    if(idCheck != 1) {
      System.out.println("수정할 회원 아이디("+hid+")가 없습니다.");
    }
    else {
      System.out.print("수정할 항목을 선택하세요.(1.비밀번호 2.성명 3.성별(남/여) 4.직업 5.주소 => ");
      int no = sc.nextInt();
      System.out.println("수정할 내용을 입력하세요. ");
      String content = sc.next();
      String str;
      
      switch(no) {
        case 1:
          str = "pwd"; //pwd 정보를 str로 넘기기
          break;
        case 2:
          str = "name"; //name 정보를 str로 넘기기
          break;
        case 3:
          str = "gender"; //gender 정보를 str로 넘기기
          break;
        case 4:
          str = "job"; //job 정보를 str로 넘기기
          break;
          default:
          str = "address"; //address 정보를 str로 넘기기
      }
      dao.hoewonUpdate(hid, str, content);
    }
  }
  // 회원 탈퇴 메소드
  private static void hoewonDelete() {
    System.out.print("탈퇴할 아이디를 입력하세요. ");
    String hid = sc.next();
    
    // 회원 아이디 검색
    int idCheck = dao.hoewonIdCheck(hid);
    if(idCheck == 1) {
      dao.hoewonDelete(hid);
      System.out.println(hid + " 회원님 탈퇴 완료되었습니다.");
    }
    else {
      System.out.println("탈퇴할 회원 아이디("+hid+")가 탈퇴 되지않았습니다.");
    }
  }

  private static void hoewonList() {
    ArrayList<HoewonVo> vos = dao.getHoewonList();
    // 회원전체 자료 출력부분
    System.out.println("==============================================================================");
    System.out.println("번호\t아이디\t비밀번호\t성명\t성별\t직업\t주소\t가입일");
    System.out.println("------------------------------------------------------------------------------");
    
    for(int i=0; i<vos.size(); i++) {
      vo = vos.get(i);
      System.out.println(vo.getIdx()+"\t"+vo.getHid()+"\t"+vo.getPwd()+"\t"+vo.getName()+"\t"+vo.getGender()+"\t"+vo.getJob()+"\t"+vo.getAddress()+"\t"+vo.getJoinday().toString().substring(0, 10));
    }
    System.out.println();
  }

  private static void hoewonInput() {
    String[] title = {"아이디","비밀번호","성명","성별(남자/여자)","직업","주소"};
    String[] value = new String[6];
    
   /* 회원가입(아이디 중복체크 하지않음)
    * for(int i=0;i<title.length;i++) {
      System.out.print(title[i] + "을[를] 입력하세요. ");
      value[i] = sc.next();
    }*/
    
    /* 회원가입(아이디 중복체크 함) */
    int idCheck = 1; //중복아이디 체크를 위한 변수.
    
    for(int i=0;i<title.length;i++) {
      System.out.print(title[i] + "을[를] 입력하세요. ");
      value[i] = sc.next();
      
      // 아래로 아이디 중복체크 추가부분
      if(idCheck == 1) {
        idCheck = dao.hoewonIdCheck(value[0]);
        if(idCheck == 1) {
          System.out.println("아이디가 중복되었습니다. 새로운 아이디를 입력하세요.");
          i--; // 'i--' 작성 안하고, continue; 입력하면 비밀번호 작성으로 넘어감. 중복아이디 체크 탈출부분.
          continue;
        }
      }
    }
    
    vo.setHid((value[0]));
    vo.setPwd(value[1]);
    vo.setName((value[2]));
    vo.setGender((value[3]));
    vo.setJob((value[4]));
    vo.setAddress((value[5]));
    
    dao.hoewonInput(vo);
    
  }
}
