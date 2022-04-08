package Question1;
public class Main {
    public static void main(String[] args) {
        Helper h=new Helper();
        Numbers t1=new Numbers(h);
        Numbers t2=new Numbers(h);
        Numbers t3=new Numbers(h);
        t1.start();
        t2.start();
        t3.start();
        try{t1.join();}
        catch(Exception e){}
    }  
}
