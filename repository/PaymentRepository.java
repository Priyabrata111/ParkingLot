package repository;
import domain.Payment;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Objects;
import java.util.stream.Collectors;

public class PaymentRepository {
  Map<UUID,Payment>payments = new ConcurrentHashMap<>();
  Map<UUID,List<UUID>>ticketToPayments = new ConcurrentHashMap<>();


  
}
