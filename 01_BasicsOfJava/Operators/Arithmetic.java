package Operators;

public class Arithmetic {
    public static void main(String[] args) {
        //Operators in java
        //Arithmetic Operators -> + , - , * , / , %
        // += , -= , *= , /= , %= , ++ , --
        int a = 5;
        int b = 10;
        int c = a + b;//15
        int d = a - b;//-5
        int e = a * b;//50
        int f = b/a;//2
        int rem = b%a;//0

        System.out.println( c + " "+ d + " " + e + " " + f + " "+ rem);

        //PreIncrement and PostIncrement

        int i = 10;
        int j = i++;//first assign value to j then increment the i
        int k = ++i;//first increment the i then assign value to k
        System.out.println(i);//12
        System.out.println(j);//10
        System.out.println(k);//12
    }
}
