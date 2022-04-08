package Question1;
 class Numbers extends Thread{
    Helper h;
    Numbers(Helper h){
        this.h=h;
    }
     public void run(){
       while(h.getI()<10){ 
           System.out.println(Thread.currentThread().getName()+ " "+h.getI());
            h.increment(); 
           }
    }  
    
}
