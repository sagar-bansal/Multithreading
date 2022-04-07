package ProducerConsumer;

public class Consumer extends Thread {
    Company comp;
    Consumer(Company obj){
        this.comp=obj;
    }
    public void run(){
        while(true){
           
            try {
                this.comp.consume_item();
               // Thread.sleep(1000);
            } catch (Exception e) {
                //TODO: handle exception
            }
        }

    }

    
}
