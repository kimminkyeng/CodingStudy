package HW_Interface2;

import java.util.Scanner;

public class PlaylandRun2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int horse = 3000;
    int viking = 5000;
    int wheel = 3000;
    int car = 3000;
    int roller = 5000;
    int drop = 5000;
    int playM;
    int price;
    
    PlaylandM yonginland = new Yonginland();
    PlaylandM seoulland = new Seoulland();
    PlaylandM inchunland = new Inchunland();
    
    PlaylandM[] lands = {yonginland, seoulland, inchunland};
    
    System.out.println("놀이동산의 놀이기구 운영현황");
    System.out.println("==========================");
    for(int i=0; i<lands.length; i++) {
      lands[i].titmsg();
      lands[i].horse();
      lands[i].car();
      lands[i].viking();
      lands[i].roller();
      lands[i].drop();
      lands[i].wheel();
      lands[i].TallLimit();
      System.out.println();
    }
    System.out.println("---------------------------");
    
    boolean flag = true;
    while(flag) {
      System.out.print("두가지 놀이기구를 선택하세요. (0. 종료| 1.회전목마와 범퍼카 |2. 바이킹과 롤러코스터 |3. 자이로드롭과 대관람차 ) : ");
      playM=sc.nextInt();
      if(playM == 0) {
        flag=false;
        System.out.println("종료합니다");
      }
      else if(playM == 1) {
        System.out.println("회전목마와 범퍼카 입니다.");
        System.out.print("놀이동산의 요금을 확인하세요.(1.용인 |2.서울 |3.인천) : ");
        price = sc.nextInt();
        switch (price) {
          case 0:
            flag=false;
            break;
          case 1:
            System.out.println("용인랜드의 요금은 : "+ (horse+car) + "입니다.");
            break;
          case 2:
            System.out.println("서울랜드의 요금은 : "+ (horse+car) + "입니다.");
            break;
          case 3:
            System.out.println("인천랜드의 요금은 : "+ (horse) + "입니다.");
            System.out.println("인천랜드는 범퍼카가 없습니다.");
            break;
          default:
            break;
            
        }
      }
       else if(playM == 2) {
        System.out.println("바이킹과 롤러코스터 입니다.");
        System.out.print("놀이동산의 요금을 확인하세요.(1.용인 |2.서울 |3.인천) : ");
        price = sc.nextInt();
        switch (price) {
          case 0:
            flag=false;
            break;
          case 1:
            System.out.println("용인랜드의 요금은 : "+ (viking+roller) + "입니다.");
            break;
          case 2:
            System.out.println("서울랜드의 요금은 : "+ (viking+roller) + "입니다.");
            break;
          case 3:
            System.out.println("인천랜드의 요금은 : "+ viking + "입니다.");
            System.out.println("인천랜드는 롤러코스터가 없습니다.");
            break;
          default:
            break;
          }
        }
       else if(playM == 3) {
         System.out.println("자이로드롭과 대관람차 입니다.");
         System.out.print("놀이동산의 요금을 확인하세요.(1.용인 |2.서울 |3.인천) : ");
         price = sc.nextInt();
         switch (price) {
           case 0:
             flag=false;
             break;
           case 1:
             System.out.println("용인랜드의 요금은 : "+ (drop+wheel) + "입니다.");
             break;
           case 2:
             System.out.println("서울랜드의 요금은 : "+ wheel + "입니다.");
             System.out.println("서울랜드는 자이로드롭이 없습니다.");
             break;
           case 3:
             System.out.println("인천랜드의 요금은 : "+ (drop+wheel) + "입니다.");
             break;
           default:
             break;
           }
         }
       else {
         System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
       }
      }
    System.out.println("즐거운 시간 되세요!");
    sc.close();
  }
}