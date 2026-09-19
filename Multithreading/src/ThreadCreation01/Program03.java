package ThreadCreation01;
class MyRunnable1 implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());//Thread-0
        System.out.println("Thread is running...");
    }
}
public class Program03 {
    public static void main(String[] args) {
        MyRunnable1 runnable = new MyRunnable1();
        Thread t1 = new Thread(runnable);
        t1.start();

        //Using lambda expression
        Runnable r = ()-> System.out.println(Thread.currentThread().getName());//logic of run() method //Thread-1
        Thread t2 = new Thread(r);
        t2.start();

        Thread t3 = new Thread(
                ()-> System.out.println(Thread.currentThread().getName())
        );//Thread-3
        t3.start();
    }
}
