package Operators;

public class LogicalOperator {
    public static void main(String[] args) {

        //Logical Operator ( && , || ) we call it as short circuit operator also
        int a = 25;
        int b = 10;
        int c = 15;

        boolean d = (a < b) && (a < c);
        System.out.println(d);//false
    }
}
