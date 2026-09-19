package ThreadCreation01;
//Thread-lifecycle

//So basically what is happening We crated thread t1 still we have called start() means we haven't informed OS that create new thread for t1
// so that's why it is 'NEW' state
// After that we called start() so now t1 is RUNNABLE state
// after that main thread sleep for 2sec so it means it is timed_waiting state so child thread i.e t1 will execute it's all task and go to terminated
// state . after that if we call t1.getState() it will give use TERMINATED State
public class Program04 {

    public static void main(String[] args) {

        Thread mainThread = Thread.currentThread();
        //Thread new stage
        Thread t1 = new Thread(()->{
            System.out.println("Name of the current thread is : " + Thread.currentThread().getName());
            System.out.println("Main thread state : " + mainThread.getState());
        });
        System.out.println(t1.getState());//NEW

        //Now in Runnable state
        t1.start();
        System.out.println(t1.getState());//RUNNABLE
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(t1.getState());//TERMINATED
    }
}
