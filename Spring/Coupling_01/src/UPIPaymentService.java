public class UPIPaymentService implements PaymentService{
    @Override
    public void pay() {
        System.out.println("Payment is processing via UPI");
        System.out.println("Payment done");
    }
}
