package ProducerConsumer;
class Company{
    int n;
    boolean f=false;
    //f :false chance of producer
    synchronized public void produce_item(int n)throws Exception{
       if(f){
           wait();
        }
        this.n=n;
        f=true;
        notify();
        System.out.println("Produced by "+Thread.currentThread().getName()+"  "+this.n);
        try {
            Thread.sleep(10000);
        } catch (Exception e) {
            //TODO: handle exception
        }
        

    }
    synchronized public int consume_item() throws Exception{
         if(!f)
         {wait();}
         f=false;
         notify();
        System.out.println("Consumed  "+Thread.currentThread().getName()+" "+this.n);
        return this.n;

    }
}