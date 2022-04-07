import java.util.concurrent.ExecutionException;

public class MultiThreadingIntro implements Runnable{
    public static void main(String args[]){
        System.out.println("Creating a thread");
        System.out.println(Thread.currentThread().getPriority());
        MultiThreadingIntro obj=new MultiThreadingIntro();
        MultithreadingExtendinThread obj2=new MultithreadingExtendinThread();
        Thread t1=new Thread(obj);
        t1.start();
       Thread t2=new Thread(obj2);
       t2.start();
    }
    public void run(){
        for(int i=0;i<10;i++)
       {   
            System.out.println("Thread First "+i);
            System.out.println("Name of thread"+Thread.currentThread().getName());
            try{Thread.sleep(100);}
           catch(Exception e){
               System.out.println("Exception");
           }
       }
    }
}