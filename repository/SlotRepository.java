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
  

  
}
