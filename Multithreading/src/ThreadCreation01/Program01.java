package ThreadCreation01;

class MyThread extends Thread{
        @Override
        public void run(){
            System.out.println("Thread is running");
            System.out.println(Thread.currentThread().getName());
            for(int i=0;i<15;i++){
                System.out.println("In t1 thread : " + i);
            }
        }
}
public class Program01 {
    public static void main(String[] args) {
            //Thread
        MyThread t1 = new MyThread();
        t1.start();

        System.out.println(Thread.currentThread().getName());
        for(int i=0;i<15;i++){
            System.out.println("In main thread : " + i);
        }
    }
}
