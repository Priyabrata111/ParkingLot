package repository;
import domain.Floor;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.UUID;
import java.util.List;
import java.util.Optional;
public class FloorRepository {
  Map<UUID,Floor>floors = new ConcurrentHashMap<>();
  Map<Integer,UUID>floorNumberToId = new ConcurrentHashMap<>();

  public Floor saveFloor(Floor floor){
    floors.put(floor.getId(),floor);
    floorNumberToId.put(floor.getFloorNumber(),floor.getId());
    return floor;
  }
  public Optional<Floor>findById(UUID floorId){
    return Optional.ofNullable(floors.get(floorId));
  }
  public Optional<Floor>findByNumber(Integer floorNumber){
    UUID floorId = floorNumberToId.get(floorNumber);
    return floorId!=null? Optional.ofNullable(floors.get(floorId)):Optional.empty();
  }
  public List<Floor>findAllFloor(){
    return new ArrayList<>(floors.values());
  }
  public boolean existByNumber(Integer floorNumber){
    return floorNumberToId.containsKey(floorNumber);
  }
  public void deleteFloor(UUID floorId){
    Floor floor = floors.remove(floorId);
    if(floor!=null) floorNumberToId.remove(floor.getFloorNumber());
  }
  public void clear(){
    floors.clear();
    floorNumberToId.clear();
  }
}
