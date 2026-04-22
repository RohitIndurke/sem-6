class T extends Thread {
    public void run(){
        System.out.println("Task");
    }
}

public class ques1 {
    public static void main(String[] args) throws Exception {
        T t1=new T();
        t1.start();
        t1.join();
        System.out.println("Done");
    }
}
