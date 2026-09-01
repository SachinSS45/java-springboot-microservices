//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new CreditCardPaymentService();
        UserService userService = new UserService(paymentService);
        userService.doPayment();

        //setter injection (we inject independent object in dependent object via setter method)
        UserService userService2 = new UserService();
        PaymentService paymentService2 = new UPIPaymentService();
        userService2.setPaymentService(paymentService2);
        userService2.doPayment();

        //field inject (very less use default in testing)
        UserService userService3 = new UserService();
        userService3.paymentService = new UPIPaymentService();
        userService3.doPayment();
    }
}