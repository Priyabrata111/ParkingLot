package main;


import domain.Vehicle;
import domain.Vehicle.VehicleType;
import domain.Slot;
import domain.Floor;

public class ParkingLot {
  public static void main(String[] args) {
        System.out.println("Staring the Simulation of parkingLot");

        Vehicle v1 = new Vehicle("wb123456789", VehicleType.BIKE);

        Slot s1 = new Slot(VehicleType.BIKE,12);

        System.out.println(v1.toString());
        System.out.println(s1.toString());
        s1.setOccupied();
        System.out.println(s1.toString());

        Floor f1 = new Floor(12);
         System.out.println(f1.toString());
         f1.addSlot(s1);
         f1.addSlot(new Slot(VehicleType.BIKE,12));
         System.out.println(f1.toString());
         System.out.println(f1.getAvaialbleSlotCount(Vehicle.VehicleType.BIKE));

    }
    
}

