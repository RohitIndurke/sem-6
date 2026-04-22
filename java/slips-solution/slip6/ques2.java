import javax.swing.*;

public class ques2 extends JFrame implements Runnable {
    JLabel l1,l2,l3;

    ques2(){
        setLayout(null);

        l1=new JLabel("RED"); l1.setBounds(100,50,100,30);
        l2=new JLabel("YELLOW"); l2.setBounds(100,100,100,30);
        l3=new JLabel("GREEN"); l3.setBounds(100,150,100,30);

        add(l1); add(l2); add(l3);

        setSize(300,300);
        setVisible(true);

        new Thread(this).start();
    }

    public void run(){
        while(true){
            try{
                l1.setVisible(true); l2.setVisible(false); l3.setVisible(false);
                Thread.sleep(1000);

                l1.setVisible(false); l2.setVisible(true); l3.setVisible(false);
                Thread.sleep(1000);

                l1.setVisible(false); l2.setVisible(false); l3.setVisible(true);
                Thread.sleep(1000);
            }catch(Exception e){}
        }
    }

    public static void main(String[] args){
        new ques2();
    }
}
