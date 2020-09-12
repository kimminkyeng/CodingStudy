package HomeWork2;

public class TestRun {
  public static void main(String[] args) {
    Actor actor = new Actor();
    actor.actorRun();
    
    Firefighter firefighter = (Firefighter) actor;
    firefighter.firefighterRun();
    
    Doctor doctor = (Doctor) firefighter;
    doctor.doctorRun();
    
    TaxiDriver taxiDriver = (TaxiDriver) doctor;
    taxiDriver.taxiDriverRun();
    
    Chef chef = (Chef) taxiDriver;
    chef.chefRun();
    
    Actor actor1 = (Actor) chef;
    actor1.actorRun();
  }
}
