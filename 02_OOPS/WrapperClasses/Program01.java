package WrapperClasses;

//Autoboxing
public class Program01 {

    public static void main(String[] args) {

        //Autoboxing
        int x = 10;
        Integer y = x;//internally  y = Integer.valueOf(x);
        System.out.println(x);
        System.out.println(y);//while printing internally it is doing unboxing

        //Unboxing
        Integer a = 20;
        int b = a;// b = a.intValue()


        //NullPointerException
        Integer p = null;
        System.out.println(p);//null
        int q = p;// p.intValue(); so you are trying to call method on null object so you will defineitly get Exception
        //System.out.println(q);//NullPointerException

    }
}
