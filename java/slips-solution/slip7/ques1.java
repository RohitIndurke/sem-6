class MyThread extends Thread {
    int n;

    MyThread(int n){ this.n=n; }

    public void run(){
        if(n%2==0)
            System.out.println("Square: "+(n*n));
        else
            System.out.println("Cube: "+(n*n*n));
    }
}

public class ques1 {
    public static void main(String[] args) {
        new MyThread(5).start();
    }
}
