import javax.swing.*;

public class ques1 extends JFrame {
    ques1(){
        JButton b=new JButton("Pick Color");
        JPanel p=new JPanel();

        b.addActionListener(e->{
            java.awt.Color c=JColorChooser.showDialog(this,"Color",null);
            p.setBackground(c);
        });

        add(b); add(p);
        setLayout(new java.awt.FlowLayout());
        setSize(300,200);
        setVisible(true);
    }

    public static void main(String[] args){
        new ques1();
    }
}
