package domain;
import java.util.UUID;
public class Payment {
  private UUID id;
  private double amount;
  private UUID ticketId;
  private PaymentGateWay gateWay;
  private PaymentStatus paymentStatus;

  public enum PaymentGateWay{
    PAYPAL, RAZORPAY, STRIPE
  }
  public enum PaymentStatus{
    SUCCESS,PENDING,FAILED
  }

  public Payment(UUID ticketId,double amount,PaymentGateWay gateWay){
    this.id = UUID.randomUUID();
    this.ticketId = ticketId;
    this.amount = amount;
    this.gateWay = gateWay;
    this.paymentStatus = PaymentStatus.PENDING;
  }
  public void makePaymentSuccess(){
    this.paymentStatus = PaymentStatus.SUCCESS;
  }
  public void makePaymentPending(){
    this.paymentStatus = PaymentStatus.PENDING;
  }
  public void makePaymentFailed(){
    this.paymentStatus = PaymentStatus.FAILED;
  }

  public UUID getId(){
    return id;
  }
  public UUID getTicketId(){
    return ticketId;
  }
  public double getAmount(){
    return amount;
  }
  public PaymentGateWay getGateWay(){
    return this.gateWay;
  }
  public PaymentStatus getPaymentStatus(){
    return this.paymentStatus;
  }

  
}
