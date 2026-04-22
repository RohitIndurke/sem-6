class Calc extends Thread {
    int a=2,b=3;

    public void run(){
        System.out.println("Sum: "+(a+b));
        System.out.println("Mul: "+(a*b));
    }
}

public class ques1 {
    public static void main(String[] args){
        new Calc().start();
    }
}
