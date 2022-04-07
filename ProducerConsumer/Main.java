package ProducerConsumer;

public class Main {
    public static void main(String args[]){
        Company comp=new Company();
        Producer p=new Producer(comp);
        //Producer p2=new Producer(comp);
        Consumer c=new Consumer(comp);
        p.start();
        // p2.start();
        c.start();
    }
    
}
