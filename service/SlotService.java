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

  public void releaseSlot(UUID slotId){
    System.out.println("[SERVICE] : Relaesing Slot for "+slotId);
    slotRepository.releaseSlot(slotId);
    System.out.println("[SERVICE] : Slot Released Successfully for "+slotId);

  }

  public Slot createSlot(Vehicle.VehicleType slotType,int floorNumber){
    System.out.println("[SERVICE] : creating slot for "+slotType+" @ floor = "+floorNumber);
    Slot slot = new Slot(slotType,floorNumber);
    slotRepository.saveSlot(slot);
    System.out.println("[SERVICE] : slot created & saved successfully for "+slotType+" @ floor = "+floorNumber);
    return slot;
  }

  public long getAvailableSlotCount(Vehicle.VehicleType vehicleType){
    return slotRepository.findAvailableSlots(vehicleType).size();
  }
}

