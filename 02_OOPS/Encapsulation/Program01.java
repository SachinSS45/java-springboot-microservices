package Encapsulation;

public class Program01 {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();

        ba.deposit(500);
        ba.withdraw(300);
        ba.getBalance();

        System.out.println(ba.getBalance());
    }
}

class BankAccount{
    private double balance;

    public void deposit(int amount){
        balance +=  amount;
    }
    public void withdraw(int amount){
        balance -= amount;
    }

    public double getBalance(){
        return balance;
    }
}

class Student{
    private String name;
    private int age;
    private int rollNumber;
    private String college;

    Student(String name,int age,int rollNumber,String college){
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.college = college;
    }

    //getters() and setters()

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getRollNumber(){
        return rollNumber;
    }
    public void setRollNumber(int rollNumber){
        this.rollNumber = rollNumber;
    }

    public String getCollege(){
        return college;
    }
    public void setCollege(String college){
        this.college = college;
    }

}
