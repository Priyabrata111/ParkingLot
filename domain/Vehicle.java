package domain;

import java.util.UUID;

public class Vehicle {
 

  private UUID id;
  private String numberPlate;
  private VehicleType vehicleType;

   public enum VehicleType{
    BIKE, CAR, TRUCK, EV
  }

  public Vehicle(String numberPlate, VehicleType vehicleType){
    this.id = UUID.randomUUID();
    this.numberPlate = numberPlate;
    this.vehicleType = vehicleType;
  }

  public UUID getId(){
    return id;
  }
  public String getNumberPlate(){
    return numberPlate;
  }
  public VehicleType getVehicleType(){
    return vehicleType;
  }

  public String toString(){
    return "Vehicle{" +
                "id=" + id +
                ", numberPlate='" + numberPlate + '\'' +
                ", vehicleType=" + vehicleType +
                '}';
  }

}
