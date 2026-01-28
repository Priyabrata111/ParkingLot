package domain;
import java.util.UUID;
public class Slot {

  private UUID id;
  private Vehicle.VehicleType slotType;
  private int floorNumber;
  private boolean isOccupied;

  public Slot(Vehicle.VehicleType slotType,int floorNumber){
    this.id = UUID.randomUUID();
    this.isOccupied = false;
    this.slotType = slotType;
    this.floorNumber = floorNumber;
  }
  public UUID getId(){
    return id;
  }
  public Vehicle.VehicleType getSlotType(){
    return slotType;
  }
  public int getFloorNumber(){
    return floorNumber;
  }
  public boolean getOccupied(){
    return isOccupied;
  }
  public void setOccupied(boolean occupied){
    this.isOccupied = occupied;
  }
  public String toString(){
    return "Slot { id = "+id+" slotType = "+slotType+" Floor Number = "+floorNumber+" is avaialble = "+isOccupied+" }";
  }
  
}
