package ComparableComparator;
//
public class Student implements Comparable<Student>{
    String name;
    int age;
    int rollNo;

    public Student(String name,int age,int rollNo){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getRollNo(){
        return rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rollNo=" + rollNo +
                '}';
    }

    //compare on the basis of name
    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }

//    @Override
//    public int compareTo(Student o) {
//        if(this.age==o.age) return 0;
//        else if(this.age > o.age) return 1;
//        else return -1; //it means o.age > this.age
//    }


}
