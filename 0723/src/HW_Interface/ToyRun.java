package HW_Interface;

public class ToyRun {
  public static void main(String[] args) {
    Toy bear = new Bear();
    Toy mazingga = new Mazingga();
    Toy airplane = new Airplane();
    
    Toy[] toys = {bear, mazingga,airplane};
    
    for(int i=0;i<toys.length;i++) {
      toys[i].titmsg();
      if(toys[i].name() == 'b') {
        toys[i].missile();
        toys[i].light();
        toys[i].move();
        toys[i].age();
      }
      else if(toys[i].name() == 'm') {
        toys[i].missile();
        toys[i].light();
        toys[i].move();
        toys[i].age();
      }
      else if(toys[i].name() == 'a') {
        toys[i].missile();
        toys[i].light();
        toys[i].move();
        toys[i].age();
      }
      System.out.println();
    }
  }
}
