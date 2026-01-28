package repository;

import domain.Slot;
import domain.Vehicle;
import domain.Vehicle.VehicleType;
import java.util.concurrent.ConcurrentHashMap;
import java.util.UUID;
import java.util.Map;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class SlotRepository {
  private Map<UUID,Slot>slots = new ConcurrentHashMap<>();

  public Slot saveSlot(Slot slot){
    slots.put(slot.getId(),slot);
    return slot;
  }
  public Optional<Slot> findById(UUID slotId){
    return Optional.ofNullable(slots.get(slotId));
  }
  public List<Slot> findAvailableSlots(Vehicle.VehicleType vehicleType){
    return slots.values().stream()
    .filter(slot->slot.getSlotType()==vehicleType && !slot.getOccupied())
    .collect(Collectors.toList());
  }
  public Optional<Slot>allocateSlot(Vehicle.VehicleType vehicleType){
    return slots.values().stream()
    .filter(slot->slot.getSlotType()==vehicleType && !slot.getOccupied())
    .findFirst()
    .map(slot->{
      slot.setOccupied(true);
      return slot;
    });
  }
  public void releaseSlot(UUID slotId){
    slots.computeIfPresent(slotId, (id,slot)->{
      slot.setOccupied(false);
      return slot;
    });
  }
  public void clear(){
    slots.clear();
  }
  public Map<Vehicle.VehicleType,Long>getSlotStatistics(){
    return slots.values().stream()
    .collect(Collectors.groupingBy(
      Slot::getSlotType,
      Collectors.counting()
    ));
  }


  
}
