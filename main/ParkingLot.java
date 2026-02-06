package main;


import domain.Floor;
import domain.Payment;
import domain.Payment.PaymentGateWay;
import domain.PricingRule;
import domain.Receipt;
import domain.Slot;
import domain.Ticket;
import domain.Vehicle;
import domain.Vehicle.VehicleType;
import repository.SlotRepository;
import repository.TicketRepository;
import service.SlotService;

public class ParkingLot {
  public static void main(String[] args) {
        System.out.println("Staring the Simulation of parkingLot");

        Vehicle v1 = new Vehicle("wb123456789", VehicleType.BIKE);

        Slot s1 = new Slot(VehicleType.BIKE,12);

        System.out.println(v1.toString());
        System.out.println(s1.toString());
        s1.setOccupied(true);
        System.out.println(s1.toString());

        Floor f1 = new Floor(12);
         System.out.println(f1.toString());
         f1.addSlot(s1);
         f1.addSlot(new Slot(VehicleType.BIKE,12));
         System.out.println(f1.toString());
         System.out.println(f1.getAvaialbleSlotCount(Vehicle.VehicleType.BIKE));

      Ticket t1 = new Ticket(v1.getId(),s1.getId());
       System.out.println(t1.toString());

      PricingRule pr1 = new PricingRule(VehicleType.BIKE, 10, 5);
      System.out.println(pr1.toString());

      Payment p1 = new Payment(t1.getId(), 200, PaymentGateWay.PAYPAL);
      System.out.println(p1.toString());
      p1.makePaymentSuccess();
      System.out.println(p1.toString());

      Receipt r1 = new Receipt(t1.getId(), 200);
      System.out.println(r1.toString());
      r1.makePaymentSuccess();
      System.out.println(r1.toString());

      Vehicle v2 = new Vehicle("wb987654321", VehicleType.CAR);

        Slot s2 = new Slot(VehicleType.CAR,11);

        System.out.println(v2.toString());
        System.out.println(s2.toString());
        System.out.println(s2.toString());

        Floor f2 = new Floor(11);
         System.out.println(f2.toString());
         f2.addSlot(s2);
         f2.addSlot(new Slot(VehicleType.BIKE,11));
         System.out.println(f2.toString());
         System.out.println(f2.getAvaialbleSlotCount(Vehicle.VehicleType.BIKE));

     TicketRepository tRepo1 = new TicketRepository();
     System.out.println("Ticket size = "+tRepo1.getSize());
     tRepo1.save(t1);
     tRepo1.save(new Ticket(v1.getId(),s1.getId()));
     System.out.println("Ticket size = "+tRepo1.getSize());

     System.out.println("========== ACCESSING SERVICE LAYER ==============");
     SlotService slotService = new SlotService(new SlotRepository());
     slotService.createSlot(VehicleType.BIKE, 4);
      

    }
    
}

