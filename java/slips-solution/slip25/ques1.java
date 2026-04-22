class Demo {
    synchronized void show(){
        System.out.println("Sync method");
    }
}

public class ques1 {
    public static void main(String[] args){
        Demo d=new Demo();

        new Thread(()->{ d.show(); }).start();
    }
}
