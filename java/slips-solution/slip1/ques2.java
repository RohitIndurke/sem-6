import java.awt.*;
import java.awt.event.*;

public class ques2 extends Frame implements ActionListener {
    TextField t1,t2,t3,t4;

    ques2() {
        setLayout(new GridLayout(5,2));

        add(new Label("EmpNo")); t1=new TextField(); add(t1);
        add(new Label("Name")); t2=new TextField(); add(t2);
        add(new Label("Designation")); t3=new TextField(); add(t3);
        add(new Label("Salary")); t4=new TextField(); add(t4);

        Button b=new Button("Submit");
        b.addActionListener(this);
        add(b);

        setSize(300,300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        System.out.println(t1.getText()+" "+t2.getText()+" "+t3.getText()+" "+t4.getText());
    }

    public static void main(String[] args){
        new ques2();
    }
}
