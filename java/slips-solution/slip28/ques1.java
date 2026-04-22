import javax.swing.*;

public class ques1 extends JFrame {
    int c=0;

    ques1(){
        JLabel l=new JLabel("0");
        JButton b=new JButton("Click");

        b.addActionListener(e->{
            c++;
            l.setText(""+c);
        });

        add(l); add(b);
        setLayout(new java.awt.FlowLayout());
        setSize(200,200);
        setVisible(true);
    }

    public static void main(String[] args){
        new ques1();
    }
}
