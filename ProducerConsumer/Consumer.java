package ProducerConsumer;

public class Consumer extends Thread {
    Company comp;
    Consumer(Company obj){
        this.comp=obj;
    }
    public void run(){
        while(true){
            this.comp.consume_item();
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                //TODO: handle exception
            }
        }

    }

    
}
