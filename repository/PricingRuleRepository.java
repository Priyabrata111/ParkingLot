package repository;
import domain.PricingRule;
import domain.Vehicle;
import domain.Vehicle.VehicleType;

import java.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.Optional;

public class PricingRuleRepository {
  Map<UUID,PricingRule>rules = new ConcurrentHashMap<>();
  Map<Vehicle.VehicleType,UUID>vehicleTypeToRules = new ConcurrentHashMap<>();

  public PricingRule save(PricingRule rule){
    rules.put(rule.getId(),rule);
    vehicleTypeToRules.put(rule.getVehicleType(),rule.getId());
    return rule;
  }
  public Optional<PricingRule> findById(UUID ruleId){
    return Optional.ofNullable(rules.get(ruleId));
  }
  public Optional<PricingRule>findByVehicleType(Vehicle.VehicleType vehicleType){
    UUID ruleId = vehicleTypeToRules.get(vehicleType);
    return ruleId!=null ? Optional.ofNullable(ruleId):Optional.empty();

  }
  public List<PricingRule>findAllRule(){
    return new ArrayList<>(rules.values());
  }
  public void update(PricingRule rule){
    if(rules.containsKey(rule.getId())){
      rules.put(rule.getId(),rule);
      vehicleTypeToRules.put(rule.getVehicleType(),rule.getId());
    }

  }
  public void delete(UUID ruleId){
    PricingRule rule = rules.remove(ruleId);
    if(rule!=null){
      vehicleTypeToRules.remove(rule.getVehicleType());
    }
  }
  public void clear(){
    rules.clear();
    vehicleTypeToRules.clear();
  }
  
}
