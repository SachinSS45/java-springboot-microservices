package Inheritance.superDemo;
//super it is keyword which stores parent reference

//we can access parent class variables (super.varName) , parent class methods (super.methodName();) , we can call parent class construct
// using super(); from child class constructor .
public class Program01 {
    public static void main(String[] args) {
        EngineeringStudent es1 = new EngineeringStudent();
        es1.age = 25;
        es1.name = "Sachin";
        es1.rollNo = 101;
        es1.college = "SKNCOE";
        es1.print();

        EngineeringStudent es2 = new EngineeringStudent("Arun" , 24 , 109, "IIT kharakpur");
        es2.print();
    }
}

class Student{
    String name;
    int age;
    int rollNo;
    int x;

    Student(String name,int age,int rollNo){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    Student(){

    }

    void printParent(){
        System.out.println(name + " , " + age + " , " + rollNo);
    }
}

class EngineeringStudent extends Student{
    String college;
    int x;
    EngineeringStudent(){

    }
    EngineeringStudent(String name , int age,int rollNo, String college){
        super(name,age,rollNo);//calling parent constructor from child constructor using super else it will call default constructor
        this.college = college;
    }
    void print(){
        System.out.println(super.name + " , " + super.age + " , " + super.rollNo + " , " + super.x);
        super.printParent();//call parent printParent() method
    }
}
