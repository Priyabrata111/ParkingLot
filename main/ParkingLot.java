package main;


import domain.Floor;
import domain.Slot;
import domain.Ticket;
import domain.Vehicle;
import domain.Vehicle.VehicleType;

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

      Ticket t1 = new Ticket(v1.getId(),s1.getId());
       System.out.println(t1.toString());

    }
    
}

