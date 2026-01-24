package main;


import domain.Vehicle;
import domain.Vehicle.VehicleType;
import domain.Slot;

public class ParkingLot {
  public static void main(String[] args) {
        System.out.println("Staring the Simulation of parkingLot");

        Vehicle v1 = new Vehicle("wb123456789", VehicleType.BIKE);

        Slot s1 = new Slot(VehicleType.BIKE,12);

        System.out.println(v1.toString());
        System.out.println(s1.toString());
        s1.setOccupied();
        System.out.println(s1.toString());

    }
    
}

