package Question1;

 class Helper {
    static  int i=0;
   synchronized public int getI(){
     return i;
   }
   synchronized public void increment(){
    try{Thread.sleep(100);}
    catch(Exception e){
        
    }

       setI(getI()+1);
      
   }
   synchronized public void setI(int i){
    

      this.i=i; 
      
   }

}
