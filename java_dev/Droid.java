public class Droid {
  /* This is a droid program developed by Jake Pierce */
  int batteryLevel = 100;
  
  public Droid(){
    
  }
  
  public void activate(){
    System.out.println("Activated. How can I help you?");
    batteryLevel = batteryLevel - 5;
    System.out.println("Battery level is " + batteryLevel + " Percent!");
  }
  
  public void chargeBattery(int hours){
    System.out.println("...");
    System.out.println("...");
    System.out.println("Droid charging...");
    batteryLevel = batteryLevel + hours;
    if(batteryLevel >= 100){
      System.out.println("Battery level is fully charged!");
    }
    else{
      System.out.println("Battery level is " + batteryLevel + " Percent!");
    }
  }
  
  public int checkBatteryLevel(){
    System.out.println(batteryLevel+ "%");
    return batteryLevel;
  }
  
  public void hover(int feet){
    if(feet > 2){
      System.out.println("...");
      System.out.println("...");
      System.out.println("Error! I cannot hover above 2 feet!");
    }
    else{
      System.out.println("...");
      System.out.println("...");
      System.out.println("...");
      System.out.println("Hovering...");
      batteryLevel = batteryLevel - 20;
      System.out.println("...");
      System.out.println("...");
      System.out.println("...");
      System.out.println("Your battery level is now " + batteryLevel +"%. Consider re-charging before next deployment.");
    }
  }
  
  public static void main(String [] args) {
    Droid JDroid = new Droid();
    JDroid.activate();
    JDroid.chargeBattery(5);
    JDroid.hover(2);
    
    
  }
}