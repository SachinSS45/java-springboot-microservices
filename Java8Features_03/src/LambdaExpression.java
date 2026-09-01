import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortInDecresingOrder implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return -Integer.compare(o1,o2);
    }
}
//Convert to lambda :
/*
public int compare(Integer o1, Integer o2) {
        return -Integer.compare(o1,o2);
}
Solution :
No need to give return type , No need to give name of method , no need to tell data type of parameter

(o1,o2) -> o1-o2

 */
public class LambdaExpression {
    public static void main(String[] args) {

        //We can apply lambda expression on Functional Interfaces only : Callable , Runnable , Comparator

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(10);
        list.add(30);
        list.add(4);
        list.add(12);

        //list.sort(null);//Natural sorting
        Collections.sort(list);//It will go to comparable interface and call to compareTo method interannly because Integer class extends comparable

        //Sort in reverse order
        Comparator<Integer> c1 = new SortInDecresingOrder();
        Collections.sort(list,c1);
        System.out.println(list);

        //Using Anonymous Inner class (we know we are using c1 only one time)
        Collections.sort(list,new Comparator<Integer>(){

            @Override
            public int compare(Integer o1,Integer o2){
                return o2-o1;
            }
        });

        System.out.println(list);

        //Now using lambda expression we can convert this functional interface into lambda easily
        //instead of passing object to method then calling we can pass logic/method as argument

        Collections.sort(list,(i1,i2)-> i1-i2);
        System.out.println(list);

        //Using method reference
        Collections.sort(list,Integer::compare);
        System.out.println(list);
    }
}
