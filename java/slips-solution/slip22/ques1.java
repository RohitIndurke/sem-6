import javax.swing.*;

public class ques1 extends JFrame {
    ques1(){
        JTextArea ta=new JTextArea(10,20);
        add(new JScrollPane(ta));
        setSize(300,300);
        setVisible(true);
    }
    public static void main(String[] args){
        new ques1();
    }
}
