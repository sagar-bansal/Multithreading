package ProducerConsumer;
class Company{
    int n;
    synchronized public void produce_item(int n){
        this.n=n;
        System.out.println("Produced by "+Thread.currentThread().getName()+"  "+this.n);
        try {
            Thread.sleep(10000);
        } catch (Exception e) {
            //TODO: handle exception
        }
        

    }
     public int consume_item(){
        System.out.println("Consumed  "+Thread.currentThread().getName()+" "+this.n);
        return this.n;

    }
}