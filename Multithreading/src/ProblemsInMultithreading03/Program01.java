package ProblemsInMultithreading03;

class Counter{
    public int count = 0;
    void increment(){
        count++;
    }
}
public class Program01 {
    public static void main(String[] args)throws InterruptedException {
        Counter c = new Counter();
        Thread t1= new Thread(
                () -> {
                    for(int i=1;i<=10000;i++) {
                        c.increment();
                    }
                }
        );

        Thread t2 = new Thread(
                ()-> {
                    for(int i=1;i<=10000;i++) {
                        c.increment();
                    }
                }
        );
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(c.count);
    }
}
