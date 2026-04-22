import javax.swing.*;

public class ques1 extends JFrame implements Runnable {
    int y=0;

    ques1(){
        setSize(200,200);
        setVisible(true);
        new Thread(this).start();
    }

    public void run(){
        while(true){
            y+=5;
            repaint();
            try{ Thread.sleep(100); }catch(Exception e){}
        }
    }

    public void paint(java.awt.Graphics g){
        g.fillOval(100,y,20,20);
    }

    public static void main(String[] args){
        new ques1();
    }
}
