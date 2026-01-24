package main;


import domain.Vehicle;
import domain.Vehicle.VehicleType;

public class ParkingLot {
  public static void main(String[] args) {
        System.out.println("Staring the Simulation of parkingLot");

        Vehicle v1 = new Vehicle("wb123456789", VehicleType.BIKE);

        System.out.println(v1.toString());
    }
    
}

