public class CreditCardPaymentService implements PaymentService{
    @Override
    public void pay() {
        System.out.println("payment is processing via Credit Card...");
        System.out.println("Payment done");
    }
}
