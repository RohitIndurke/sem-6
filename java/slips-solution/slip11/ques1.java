import javax.swing.*;
import java.awt.*;

public class ques1 extends JFrame {
    ques1(){
        setLayout(new GridLayout(3,1));
        add(new JLabel("RED",JLabel.CENTER));
        add(new JLabel("YELLOW",JLabel.CENTER));
        add(new JLabel("GREEN",JLabel.CENTER));
        setSize(200,300);
        setVisible(true);
    }
    public static void main(String[] args){
        new ques1();
    }
}
