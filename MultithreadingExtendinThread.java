public class MultithreadingExtendinThread extends Thread {

    public void run(){
        for(int i=0;i<20;i++){
            System.out.println("Thread second "+i);
            System.out.println("Name "+Thread.currentThread().getName());
           try {
            Thread.sleep(50);
           } catch (Exception e) {
               //TODO: handle exception
           } 
        }
    }
    
}
