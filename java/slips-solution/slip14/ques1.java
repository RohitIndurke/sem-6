class PC {
    int data;

    synchronized void produce(int x){
        data=x;
        System.out.println("Produced "+x);
    }

    synchronized void consume(){
        System.out.println("Consumed "+data);
    }
}

public class ques1 {
    public static void main(String[] args){
        PC obj=new PC();

        new Thread(()->{ obj.produce(10); }).start();
        new Thread(()->{ obj.consume(); }).start();
    }
}
