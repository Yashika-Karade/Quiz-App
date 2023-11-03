import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends JFrame implements ActionListener {
    String name;
    JButton start,back;
    Rules(String name){
        this.name=name;
        getContentPane().setBackground(Color.PINK);
        setLayout(null);

        JLabel heading=new JLabel("Welcome "+name+" In Our Quiz competition");
        heading.setBounds(50, 0, 1500, 100);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,50));
        heading.setForeground(Color.BLACK);
        add(heading);



        JLabel rules=new JLabel();
        rules.setBounds(20, 100, 1500, 500);
        rules.setFont(new Font("Tahoma",Font.PLAIN,25));
        rules.setText(
                "<html>"+
                "1. 10 marks will be awarded for correct answer." +"<br><br>" +
                        "2. Response time for each question is 30 seconds." +"<br><br>"+
                        " 3. There is not pass option." +"<br><br>"+
                        "4. There are no deductions for wrong answers in this round."+"<br><br>"+
                        "5. The questions shall be in the form of multiple choice, true/false statement, specific answer\n" +
                        "question etc"+"<br><br>"+
                        "6. Their is one life line"+"<br><br>"+
                "<html>"
        );


        JLabel Best=new JLabel("BEST OF LUCK");
        Best.setBounds(400, 350, 1500, 500);
        Best.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        Best.setForeground(Color.BLACK);
        add(Best);
        add(rules);



        back = new JButton("Back");
        back.setBounds(850, 650, 120, 25);
        back.setBackground(Color.gray);
        back.setForeground(Color.black);
        back.setFont(new Font("Mongolian Baiti", Font.BOLD, 19));
        back.addActionListener(this);
        add(back);



       start = new JButton("Start");
       start.setBounds(200, 650, 120, 25);
        start.setBackground(Color.gray);
        start.setForeground(Color.black);
        start.setFont(new Font("Mongolian Baiti", Font.BOLD, 19));
        start.addActionListener(this);
        add(start);




        setSize(800,650);
        setLocation(350,100);
        setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==start){
            setVisible(false);
            new Quiz(name);

        }else{
            setVisible(false);
            new Login();  //back to the login page
        }

    }
    public static void main(String[] args) {

        new Rules("user"); //if user not mentioned their name
    }


}
