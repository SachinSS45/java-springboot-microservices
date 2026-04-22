public class Program01 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.name = "Sachin";
        s1.age = 24;
        s1.rollNumber = 101;
        s1.college = "SKNCOE";

        s2.name = "Rushi";
        s2.age = 25;
        s2.rollNumber = 104;
        s2.college = "Matoshri";

        s1.markAttendence();
        s2.markAttendence();

        s1.print();
        s2.print();

        /*
            Output :
            Attendence Marked by Sachin
            Attendence Marked by Rushi
            Sachin , 24 , 101 , SKNCOE
            Rushi , 25 , 104 , Matoshri

         */
    }
}

class Student{
    String name;
    int age;
    int rollNumber;
    String college;

    void markAttendence(){
        System.out.println("Attendence Marked by " + name);
    }

    void print(){
        System.out.println(name + " , " + age + " , " + rollNumber + " , "+ college);
    }
}