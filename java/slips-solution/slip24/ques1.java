import javax.swing.*;

public class ques1 extends JFrame {
    ques1(){
        JTextField t=new JTextField(10);
        JButton b=new JButton("Convert");
        JLabel l=new JLabel();

        b.addActionListener(e->{
            double km=Double.parseDouble(t.getText());
            l.setText(""+(km*0.62));
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
