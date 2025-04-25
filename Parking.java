public class Parking
{
  public static void main(String[] args){
    Vehicle Car = new Vehicle("AB-B-333","Car",9);
    Vehicle Motercycle = new Vehicle("WE-R-124","Motercycle",10);
    Motercycle.park();
    Motercycle.getDetails();
    Motercycle.exit(15);
        
    Car.park();
    Car.getDetails();
    Car.exit(13);
  }
}
