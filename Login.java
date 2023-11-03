import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


//Jframe=for creating frames
public class Login extends JFrame implements ActionListener {
    //constructor

    JButton rules,cancel;  //globally declare
    JLabel name;

    JTextField f;
    Login() {
        getContentPane().setBackground(Color.PINK);
        setLayout(null);//for our image layout

        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("quizImage.jpg"));

        JLabel image = new JLabel(i);

        image.setBounds(450, 0, 600, 400);
        add(image);



        JLabel heading = new JLabel("let's  Start");
        heading.setBounds(600, 450, 500, 55);
        heading.setFont(new Font("Viner Hand ITC", Font.CENTER_BASELINE, 60));
        heading.setForeground(Color.black);
        add(heading);



         name = new JLabel("Enter Your Name");
        name.setBounds(650, 500, 300, 45);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 30));
        name.setForeground(Color.black);
        add(name);


        f = new JTextField();
        f.setBounds(600, 550, 350, 45);
        f.setFont(new Font("Mongolian Baiti", Font.PLAIN, 19));
        add(f);



        rules = new JButton("Rules");
        rules.setBounds(600, 650, 120, 25);
        rules.setBackground(Color.gray);
        rules.setForeground(Color.black);
        rules.setFont(new Font("Mongolian Baiti", Font.BOLD, 19));
        rules.addActionListener(this);
        add(rules);


        cancel = new JButton("Cancel");
        cancel.setBounds(850, 650, 120, 25);
        cancel.setBackground(Color.gray);
        cancel.setForeground(Color.black);
        cancel.setFont(new Font("Mongolian Baiti", Font.BOLD, 19));
        cancel.addActionListener(this);
        add(cancel);


        setSize(1200, 500);
        setLocation(200, 200);
        setVisible(true);




    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==rules){
            String name=f.getText();
            setVisible(false);

            new Rules(name);
        }else if(e.getSource()==cancel){
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new Login();

    }



}
