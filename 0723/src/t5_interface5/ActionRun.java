package t5_interface5;

public class ActionRun {
  public static void main(String[] args) {
    PoliceMan policeman = new PoliceMan();
    FireMan fireman = new FireMan();
    ChefMan chefman = new ChefMan();
    
    policeman.titmsg();
    policeman.catching();
    policeman.search();
    System.out.println();
    
    fireman.titmsg();
    fireman.fire();
    fireman.save();
    System.out.println();
    
    chefman.titmsg();
    chefman.pizzaCooking();
    chefman.spagettiCooking();
    System.out.println();
  }
}
