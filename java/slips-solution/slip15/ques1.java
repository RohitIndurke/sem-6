class Demo extends Thread {
    public void run(){
        System.out.println("Thread running");
    }
}

public class ques1 {
    public static void main(String[] args){
        Demo t=new Demo();
        t.setDaemon(true);
        t.start();
    }
}
