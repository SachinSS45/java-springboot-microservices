package ComparableComparator;

import java.awt.print.Paper;
import java.util.Comparator;

public class Employee {
    String name;
    int empId;
    int age;

    public Employee(String name,int empId,int age){
        this.name = name;
        this.empId = empId;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getEmpId() {
        return empId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", empId=" + empId +
                ", age=" + age +
                '}';
    }
}

class SortByName implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.name.compareTo(o2.name);
    }
}

class SortByEmpId implements Comparator<Employee>{
    @Override
    public int compare(Employee o1,Employee o2){
        return Integer.compare(o1.getEmpId(),o2.getEmpId());
    }
}
class CustomComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1,Employee o2){
        if(o1.empId == o2.empId){
            if(o1.age == o2.age){
                return o1.name.compareTo(o2.name);// // compare by name if empId & age equal
            }else{
                return Integer.compare(o1.age,o2.age);// compare by age if empId equal
            }
        }
        return Integer.compare(o1.empId,o2.empId);// compare by empId first
    }
}
