import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {
    Score(String name,int score){
        setBounds(600,150,750,550);
        getContentPane().setBackground(Color.PINK);
        setLayout(null);




        JLabel heading=new JLabel("Thank You "+name+" for playing Quiz");
        heading.setBounds(100,30,1500,50);
        heading.setFont(new Font("Tahoma",Font.ROMAN_BASELINE,40));
        add(heading);

        JLabel marks=new JLabel("Your Score is "+score);
        marks.setBounds(200,100,700,40);
        marks.setFont(new Font("Tahoma",Font.BOLD,30));
        add(marks);


        JButton submit=new JButton("Play Again");
        submit.setBounds(380,270,120,30);
        submit.addActionListener(this);
        add(submit);


        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new Login();

    }

    public static void main(String[] args) {

        new Score("user",0);
    }


}
