public class UserService {
    //field injection
    PaymentService paymentService;

    //constructor injection
    UserService(PaymentService paymentService){
        this.paymentService=paymentService;
    }
    //need for setter injection
    UserService(){
        System.out.println("Default constructor");
    }

    //setter injection
    public void setPaymentService(PaymentService paymentService){
        this.paymentService = paymentService;
    }


    public void doPayment(){
        paymentService.pay();
    }
}
