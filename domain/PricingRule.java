package domain;
import java.util.UUID;

public class PricingRule {
  private UUID id;
  private Vehicle.VehicleType vehicleType;
  private double hourlyRate;
  private double flatRate;

  public PricingRule(Vehicle.VehicleType vehicleType,double hourlyRate,double flatRate){
    this.id = UUID.randomUUID();
    this.vehicleType = vehicleType;
    this.hourlyRate = hourlyRate;
    this.flatRate = flatRate;
  }
  public void updateRates(double hourlyRate,double flatRate){
    this.hourlyRate = hourlyRate;
    this.flatRate = flatRate;
  }
  public void updateHourlyRate(double hourlyRate){
    this.hourlyRate = hourlyRate;
  }
  public void updateFlatRate(double flatRate){
    this.flatRate = flatRate;
  }
  public UUID getId(){
    return this.id;
  }
  public Vehicle.VehicleType getVehicleType(){
    return vehicleType;
  }
  public double getHourlyRate(){
    return hourlyRate;
  }
  public double getFlatRate(){
    return flatRate;
  }
  public String toString(){
    return "PricingRule { id = +"+id+" ,VehicleType = "+vehicleType+" ,HourlyRate = "+hourlyRate+" ,flatRate = "+flatRate+" } ";
  }
  
}
