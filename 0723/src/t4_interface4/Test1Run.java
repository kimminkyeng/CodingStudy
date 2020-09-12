package t4_interface4;

import java.util.Scanner;

public class Test1Run {
  public static void main(String[] args) {
    Actor fireMan = new FireMan();
    Actor policeMan = new PoliceMan();
    Actor chefMan = new ChefMan();
    
    Actor[] actor = {fireMan,policeMan,chefMan};
    
    for(int i=0; i<actor.length;i++) {
      System.out.println("**배우가 연기하는 역할과 그 역할의 하는일**");
      actor[i].job();
      actor[i].doing1();
      actor[i].doing2();
      System.out.println("=============================");
    }
  }
}
