package ProducerConsumer;

public class Main {
    public static void main(String args[]){
        Company comp=new Company();
        Company comp2=new Company();
        Producer p=new Producer(comp);
        Producer p2=new Producer(comp);
        Consumer c=new Consumer(comp);
        p.start();
        p2.start();
        c.start();
        Producer p21=new Producer(comp2);
        Producer p22=new Producer(comp2);
        Consumer c2=new Consumer(comp2);
        p21.start();
        p22.start();
        c2.start();
    }
    
}
