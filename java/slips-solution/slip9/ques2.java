import javax.swing.*;
import java.util.Date;

public class ques2 extends JFrame {
    ques2(){
        JLabel l=new JLabel(new Date().toString());
        add(l);
        setSize(300,200);
        setVisible(true);
    }

    public static void main(String[] args){
        new ques2();
    }
}
