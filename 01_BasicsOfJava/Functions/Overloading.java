package Functions;

public class Overloading {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(sum(a,b));
        int c = 30;
        System.out.println(sum(a,b,c));
    }
    static int sum(int a,int b){
        return (a+b);
    }
    static int sum(int a,int b,int c){ //different number of parameters
        return (a+b+c);
    }


}
