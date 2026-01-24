package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Floor {
private UUID id;
private int floorNumber;
private List<Slot> parkingSlots;

public Floor(int floorNumber){
  this.id = UUID.randomUUID();
  this.floorNumber = floorNumber;
  this.parkingSlots = new ArrayList<>();
}

public void addSlot(Slot slot){
  parkingSlots.add(slot);
}

public List<Slot> getSlots(){
  return parkingSlots;
}

public List<Slot> getAvaialbleSlot(Vehicle.VehicleType slotType){
  List<Slot>availableSlots = new ArrayList<>();

  for(Slot it:parkingSlots){
    if(it.getSlotType()==slotType && it.getOccupied()==true){
      availableSlots.add(it);
    }
  }
  return availableSlots;
}

public UUID getId(){
  return id;
}
public int getFloorNumber(){
  return floorNumber;
}

public int getTotalSlots(){
  return parkingSlots.size();
}

public int getAvaialbleSlotCount(Vehicle.VehicleType vehicleType){
  return getAvaialbleSlot(vehicleType).size();

}
public String toString(){
  return "Floor{" +
                "id=" + id +
                ", floorNumber=" + floorNumber +
                ", totalSlots=" + parkingSlots.size() +
                '}';
}
}
