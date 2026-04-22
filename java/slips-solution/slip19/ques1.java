import javax.swing.*;

public class ques1 extends JFrame {
    ques1(){
        JLabel l=new JLabel("Text");
        JComboBox<String> c=new JComboBox<>(new String[]{"Arial","Serif"});

        c.addActionListener(e-> l.setFont(new java.awt.Font((String)c.getSelectedItem(),0,20)));

        add(c); add(l);
        setLayout(new java.awt.FlowLayout());
        setSize(300,200);
        setVisible(true);
    }

    public static void main(String[] args){
        new ques1();
    }
}
