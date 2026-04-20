package Functions;

public class Chaining {
    public static void main(String[] args) {
        fun1();
        System.out.println("bye");
    }

    private static void fun1() {
        fun2();
        System.out.println("Hi");
    }

    private static void fun2() {
        fun3();
        System.out.println("Hello");
    }

    private static void fun3() {
        System.out.println("How are you?");
    }
}
