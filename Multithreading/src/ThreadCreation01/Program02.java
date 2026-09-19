package ThreadCreation01;

@FunctionalInterface
interface RunnableMy{
    void run();
}

class ThreadMy implements RunnableMy{
    RunnableMy target;
    ThreadMy(){

    }

    ThreadMy(RunnableMy runnableMy){
        this.target=runnableMy;
    }
    @Override
    public void run() {
        if(this.target!=null){
            target.run();
        }
    }

    public void start(){
        run();
    }
}

class MyRunnable implements RunnableMy{

    @Override
    public void run() {
        System.out.println("Thread is running ...");
    }
}
public class Program02 {
    public static void main(String[] args) {
        MyRunnable r1 = new MyRunnable();
        ThreadMy t1 = new ThreadMy(r1);
        t1.start();
    }
}
