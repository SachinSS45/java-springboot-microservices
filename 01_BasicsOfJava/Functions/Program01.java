package Functions;

public class Program01 {
    public static void main(String[] args) {
        //Functions in Java
        greet();

        sayHello("Sachin");//Arguments
        getNum();
        multiply(10,20);

    }

    //No i/p , No output

    static void greet(){
        System.out.println("Hello!!");
        return;//Optional
    }

    //i/p but no output
    static void sayHello(String name){ //No of parameters can be anything
        System.out.println("Hello " + name);//Hello Sachin
    }

    //No ip but output
    static int getNum(){
        return 10;
    }

    //Ip and OP both
    static int multiply(int a,int b){
        return a*b;
    }

}
