package Interfaces;


interface Payment{
    void pay();
}

class DebitCard implements Payment{
    @Override
    public void pay(){
        System.out.println("Paying via Debit Card");
    }
}

class CreditCard implements Payment{

    @Override
    public void pay() {
        System.out.println("Paying via CreditCard");
    }
}
public class Program01 {

    public static void main(String[] args) {

        Payment p = new CreditCard();
        p.pay();
        Payment p1 = new DebitCard();
        p1.pay();
    }
}
