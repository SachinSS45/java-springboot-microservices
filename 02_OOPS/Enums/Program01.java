package Enums;

enum PaymentStatus{
    SUCCESS,
    FAILED,
    PENDING;
}
public class Program01 {
    public static void main(String[] args) {
//        PaymentStatus status = PaymentStatus.SUCCESS;
//        System.out.println(status);//SUCCESS
//        System.out.println(status.name());//SUCCESS

       // PaymentStatus status1 = 100; // ERROR : java: incompatible types: int cannot be converted to Enums.PaymentStatus (no type safety issue)
        PaymentStatus status = PaymentStatus.FAILED;
//        if(status == "sucess"){
//
//        } //ERROR : type mismatch
    }
}
