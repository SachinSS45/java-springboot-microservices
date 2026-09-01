package ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Sachin",25,143);
        Student s2 = new Student("Rupesh",27,155);
        Student s3 = new Student("Vijay",23,101);

        List<Student> ll = new ArrayList<>();
        ll.add(s1);
        ll.add(s2);
        ll.add(s3);

        //sort by name using comparable
        Collections.sort(ll);
        System.out.println(ll);

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Sachin",3,25));
        employees.add(new Employee("Rupesh",4,27));
        employees.add(new Employee("Vijay",2,23));

        Collections.sort(employees,new SortByName());
        System.out.println(employees);

        //Using Anonymous inner class
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.name.compareTo(o2.name);
            }
        });

        //Using Lambda

        Collections.sort(employees,(stud1,stud2)->stud1.empId-stud2.empId);
    }
}
