package Inheritance;

public class Main {
    public static void main(String[] args) {
        EngineeringStudent es = new EngineeringStudent();
        es.markAttendence();
        es.attendLab();

        Student s1 = new Student();
        s1.markAttendence();
        //s1.attendLab();//we can't call child method using parent class object class
    }
}
