class Counter {
    int c=0;

    synchronized void inc(){
        c++;
    }
}

public class ques1 {
    public static void main(String[] args) throws Exception {
        Counter obj=new Counter();

        Thread t1=new Thread(()->{ for(int i=0;i<1000;i++) obj.inc(); });
        Thread t2=new Thread(()->{ for(int i=0;i<1000;i++) obj.inc(); });

        t1.start(); t2.start();
        t1.join(); t2.join();

        System.out.println(obj.c);
    }
}
