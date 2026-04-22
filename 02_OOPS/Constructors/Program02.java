package Constructors;

//Parameterized constr
public class Program02 {
    public static void main(String[] args) {
        StudentDemo s1 = new StudentDemo("Sachin",24,100,"SKNCOE");
        System.out.println(s1.toString());
    }
}

class StudentDemo{

    String name;
    int age;
    int rollNumber;
    String college;

    StudentDemo(){

    }
    StudentDemo(String n,int a,int rn,String c){
        name = n;
        age = a;
        rollNumber = rn;
        college = c;
    }

    @Override
    public String toString() {
        return "StudentDemo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rollNumber=" + rollNumber +
                ", college='" + college + '\'' +
                '}';
    }
}
