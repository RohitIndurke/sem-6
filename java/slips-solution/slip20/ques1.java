class MyRun implements Runnable {
    public void run(){
        System.out.println("Running");
    }
}

public class ques1 {
    public static void main(String[] args){
        new Thread(new MyRun()).start();
    }
}
