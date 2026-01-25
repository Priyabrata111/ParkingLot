package domain;
import java.time.LocalDateTime;
import java.util.UUID;

public class Ticket {
  private UUID id;
  private UUID vehicleId;
  private UUID slotId;
  private LocalDateTime entryTime;
  private boolean isActive;

  public Ticket(UUID vehicleId,UUID slotId){
    id = UUID.randomUUID();
    this.vehicleId = vehicleId;
    this.slotId = slotId;
    entryTime = LocalDateTime.now();
    isActive = true;
  }
  public void deactivateTicket(){
    this.isActive = false;
  }

  public UUID getId(){
    return id;
  }
  public UUID getVehicleId(){
    return vehicleId;
  }
  public UUID getSlotId(){
    return slotId;
  }
  public LocalDateTime getEntryTime(){
    return entryTime;
  }
  public boolean getActive(){
    return isActive;
  }

  public String toString(){
    return "Ticket { id = "+id+" VehicleId = "+ vehicleId+" slotId = "+" entryTime = "+entryTime+" isActive = "+isActive+" } ";
  }
  
}
