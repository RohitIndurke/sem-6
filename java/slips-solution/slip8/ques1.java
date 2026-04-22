class PrintThread extends Thread {
    String msg; int n;

    PrintThread(String m,int n){ msg=m; this.n=n; }

    public void run(){
        for(int i=1;i<=n;i++)
            System.out.println(msg);
    }
}

public class ques1 {
    public static void main(String[] args) {
        new PrintThread("COVID19",10).start();
        new PrintThread("LOCKDOWN",20).start();
    }
}
