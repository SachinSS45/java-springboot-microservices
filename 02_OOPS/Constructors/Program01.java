package Constructors;

public class Program01 {
    public static void main(String[] args) {

        Student s1 = new Student();
        System.out.println(s1.name);//null
        System.out.println(s1.age);//0
        System.out.println(s1.rollNumber);//0
        System.out.println(s1.college);//null
    }
}
class Student{
    String name;
    int age;
    int rollNumber;
    String college;


}
