import javax.swing.*;

public class ques1 extends JFrame {
    ques1(){
        JTextField user=new JTextField(10);
        JPasswordField pass=new JPasswordField(10);
        JButton b=new JButton("Login");
        JLabel l=new JLabel();

        b.addActionListener(e->{
            if(user.getText().equals("admin"))
                l.setText("Login Success");
            else
                l.setText("Fail");
        });

        add(user); add(pass); add(b); add(l);
        setLayout(new java.awt.FlowLayout());
        setSize(300,200);
        setVisible(true);
    }

    public static void main(String[] args){
        new ques1();
    }
}
