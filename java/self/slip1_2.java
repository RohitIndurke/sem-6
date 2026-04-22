import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class slip1_2 extends JFrame {

    JTextField Eno, EName, ESalary, EDes, ESal;
    JButton b1;
    JLabel a, b, c, d;

    slip1_2() {
        setSize(400, 400);
        setLayout(new FlowLayout());
        Eno = new JTextField(20);
        EName = new JTextField(20);
        ESalary = new JTextField(20);
        EDes = new JTextField(20);
        ESal = new JTextField(20);
        b1 = new JButton("Submit");
        a = new JLabel("Eno");
        b = new JLabel("EName");
        c = new JLabel("EDesi");
        d = new JLabel("ESal");

        add(a);
        add(Eno);
        add(b);
        add(EName);
        add(c);
        add(ESalary);
        add(d);
        add(ESal);
        add(b1);
        setVisible(true);
    }

    public static void main(String argc[]) {
        new slip1_2();
    }
}
