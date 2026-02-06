package service;
import domain.Slot;
import domain.Vehicle;
import domain.Vehicle.VehicleType;
import repository.SlotRepository;
import java.util.UUID;
import java.util.Optional;

public class SlotService {
  private SlotRepository slotRepository;

  public SlotService(SlotRepository slotRepository){
    this.slotRepository = slotRepository;
  }

  public Optional<Slot> allocateSlot(Vehicle.VehicleType vehicleType){

    System.out.println("[SERVICE] : Allocating Slot for "+vehicleType);
    Optional<Slot> slot = slotRepository.allocateSlot(vehicleType);
    if(slot.isPresent()){
      System.out.println("[SERVICE] : Slot allocated successfully with slotId = "+slot.get().getId());
    }else{
      System.out.println("[SERVICE] : No Slot available for "+vehicleType);
    }
    return slot;

  }

  
}
