
public class Vehicle
{  
  public String LicensePlate;
  public String VehicleType;
  public int EntryTime;
     public Vehicle (String LicensePlate,String VehicleType,int EntryTime){
         this.LicensePlate=LicensePlate;
         this.VehicleType=VehicleType;
         this.EntryTime=EntryTime;
     }
     public void park(){
         System.out.println("Vehicle"+ VehicleType +"Parked at"+ EntryTime + ":00");
     }
     public void exit(int ExitTime){
         System.out.println("Vehicle"+ LicensePlate +"Exited at"+ExitTime + ":00");
         int fee =CalculateFee(ExitTime);
         System.out.println("Parked fee:$"+fee);
     }
     public int CalculateFee(int ExitTime){
         int duration=ExitTime - EntryTime;
         int feePerHour=5;
         return duration*feePerHour;
     }
     public void getDetails(){
         System.out.println("License Plate:"+ LicensePlate);
         System.out.println("Vehicle Type:"+ VehicleType);
         System.out.println("Entry Time:"+ EntryTime +":00");
     }
}
