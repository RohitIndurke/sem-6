class Race extends Thread {
    String name;

    Race(String n){ name=n; }

    public void run(){
        for(int i=1;i<=3;i++){
            System.out.println(name+" "+i);
        }
    }
}

public class ques1 {
    public static void main(String[] args){
        new Race("A").start();
        new Race("B").start();
    }
}
