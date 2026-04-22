class Bank {
    int bal=1000;

    synchronized void deposit(int x){
        bal+=x;
        System.out.println("Bal: "+bal);
    }
}

public class ques1 {
    public static void main(String[] args){
        Bank b=new Bank();

        new Thread(()->{ b.deposit(500); }).start();
    }
}
