// BUTTON DISPLAY RECORD (simplified)
import javax.swing.*;

public class ques2 extends JFrame {
    JTextField t;

    ques2(){
        t=new JTextField(20);
        JButton b=new JButton("Show");

        b.addActionListener(e-> t.setText("Record Loaded"));

        add(t); add(b);
        setLayout(new java.awt.FlowLayout());
        setSize(300,200);
        setVisible(true);
    }

    public static void main(String[] args){
        new ques2();
    }
}
