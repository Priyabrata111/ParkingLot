package service;
import domain.Vehicle;
import domain.Vehicle.VehicleType;
import domain.Ticket;
import repository.TicketRepository;
import java.util.UUID;
import java.util.Optional;

public class TicketService {
  private TicketRepository ticketRepository;

  public TicketService(TicketRepository ticketRepository){
    this.ticketRepository = ticketRepository;
  }

  public Ticket generateTicket(Vehicle vehicle, UUID slotId){
    System.out.println("[SYSTEM] : Generating Ticket for "+vehicle.getNumberPlate());
    Ticket ticket = new Ticket(vehicle.getId(),slotId);
    ticketRepository.save(ticket);
    System.out.println("[SYSTEM] : Ticket Generation successfull for  "+ticket.getId());
    return ticket;
  }
  
}
