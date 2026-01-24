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

  
  
}
