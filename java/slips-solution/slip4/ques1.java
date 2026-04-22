import javax.swing.*;

public class ques1 extends JFrame implements Runnable {
    JLabel l;

    ques1(){
        l=new JLabel("Hello");
        add(l);
        setSize(200,200);
        setVisible(true);

        new Thread(this).start();
    }

    public void run(){
        while(true){
            try{
                l.setVisible(false);
                Thread.sleep(500);
                l.setVisible(true);
                Thread.sleep(500);
            }catch(Exception e){}
        }
    }

    public static void main(String[] args){
        new ques1();
    }
}
