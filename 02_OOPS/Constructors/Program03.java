package Constructors;

//static keyword (for class var and for static method)
public class Program03 {

    public static void main(String[] args) {
        StudDemo s1 = new StudDemo("Sachin",24,100);
        StudDemo s2 = new StudDemo("Yash",25,101);
        StudDemo.college = "SKNCOE";

        System.out.println(s1.name + " , " + s1.age + " , " + s1.rollNumber + " , " + s1.college);
        System.out.println(s2.name + " , " + s2.age + " , " + s2.rollNumber + " , " + StudDemo.college);
        /*
        Sachin , 24 , 100 , SKNCOE
        Yash , 25 , 101 , SKNCOE
         */
    }
}

class StudDemo{
    String name;
    int age;
    int rollNumber;
    static String college; //class variable common to all

    StudDemo(String name,int age,int rollNumber){
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }
}
