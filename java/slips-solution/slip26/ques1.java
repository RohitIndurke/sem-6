import javax.swing.*;

public class ques1 extends JFrame {
    int n=50;

    ques1(){
        JTextField t=new JTextField(5);
        JButton b=new JButton("Guess");
        JLabel l=new JLabel();

        b.addActionListener(e->{
            int g=Integer.parseInt(t.getText());
            if(g==n) l.setText("Correct");
            else l.setText("Try again");
        });

        add(t); add(b); add(l);
        setLayout(new java.awt.FlowLayout());
        setSize(300,200);
        setVisible(true);
    }

    public static void main(String[] args){
        new ques1();
    }
}
