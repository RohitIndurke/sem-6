class RevThread extends Thread {
    String s="Hello";

    public void run(){
        String rev="";
        for(int i=s.length()-1;i>=0;i--)
            rev+=s.charAt(i);

        System.out.println(rev);
    }
}

public class ques1 {
    public static void main(String[] args){
        new RevThread().start();
    }
}
