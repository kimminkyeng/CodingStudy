package t5_interface5;

public class ActionRun2 {
  public static void main(String[] args) {
    Action policeMan = new PoliceMan();
    Action fireMan = new FireMan();
    Action chefMan = new ChefMan();
    
    Action[] actions = {policeMan, fireMan, chefMan};
    
    for(int i=0;i<actions.length;i++) {
      actions[i].titmsg();
      if(actions[i].gubun() == 'p') {
        actions[i].catching();
        actions[i].search();
      }
      else if(actions[i].gubun() == 'f') {
        actions[i].fire();
        actions[i].save();
      }
      else if(actions[i].gubun() == 'c') {
        actions[i].pizzaCooking();
        actions[i].spagettiCooking();
      }
      System.out.println();
    }
    
//    PoliceMan policeman = new PoliceMan();
//    FireMan fireman = new FireMan();
//    ChefMan chefman = new ChefMan();
    
//    policeman.titmsg();
//    policeman.catching();
//    policeman.search();
//    System.out.println();
//    
//    fireman.titmsg();
//    fireman.fire();
//    fireman.save();
//    System.out.println();
//    
//    chefman.titmsg();
//    chefman.pizzaCooking();
//    chefman.spagettiCooking();
//    System.out.println();
  }
}
