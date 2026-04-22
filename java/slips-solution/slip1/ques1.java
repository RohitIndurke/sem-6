class AlphabetThread extends Thread {
    public void run() {
        for(char ch='A'; ch<='Z'; ch++) {
            System.out.print(ch + " ");
            try { Thread.sleep(2000); } catch(Exception e){}
        }
    }
}

public class ques1 {
    public static void main(String[] args) {
        new AlphabetThread().start();
    }
}
