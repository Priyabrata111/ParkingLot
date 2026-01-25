package domain;
import java.time.LocalDateTime;
import java.util.UUID;

public class Receipt {
  private UUID id;
  private UUID ticketId;
  private LocalDateTime exitTime;
  private double totalFee;
  private PaymentStatus paymentStatus;

  public enum PaymentStatus{
    SUCCESS,FAILED,PENDING
  }

  public Receipt(UUID ticketId,double totalFee){
    this.id = UUID.randomUUID();
    this.ticketId = ticketId;
    this.totalFee = totalFee;
    this.exitTime = LocalDateTime.now();
    this.paymentStatus = PaymentStatus.PENDING;
  }
  public void makePaymentFailed(){
    this.paymentStatus = PaymentStatus.FAILED;
  }
  public void makePaymentPending(){
    this.paymentStatus = PaymentStatus.PENDING;
  }
  public void makePaymentSuccess(){
    this.paymentStatus = PaymentStatus.SUCCESS;
  }
  public UUID getId(){
    return this.id;
  }
  public UUID getTicketId(){
    return ticketId;
  }
  public double getTotalFee(){
    return totalFee;
  }
  public LocalDateTime getLocalDateTime(){
    return exitTime;
  }
  public PaymentStatus getPaymentStatus(){
    return this.paymentStatus;
  }

  public String toString() {
        return "Receipt{" +
                "id=" + id +
                ", ticketId=" + ticketId +
                ", exitTime=" + exitTime +
                ", totalFee=" + totalFee +
                ", paymentStatus=" + paymentStatus +
                '}';
    }
  
}
