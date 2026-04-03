import java.awt.*;
import javax.swing.*;

public class Slip1B extends JFrame {

    JTextField t1;
    JButton b1;

    Slip1B() {
        setSize(400, 400);
        setLayout(new FlowLayout());
        t1 = new JTextField(20);
        b1 = new JButton("Click");
        add(t1);
        add(b1);
        setVisible(true);
    }

    public static void main(String argc[]) {
        new Slip1B();
    }
}
