import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quiz extends JFrame implements ActionListener {
    String questions[][]=new String[10][5];
    String answers[][]=new String[10][2];
    String userans[][]=new String[10][1];

 JLabel qno, question;
 JRadioButton opt1,opt2,opt3,opt4;
 ButtonGroup bg;
 JButton next,submit,lifeline;
 public static int timer=30;
 public static int ansGiven=0;
 public static int count=0;
 public static int score=0;
 String name;
    Quiz(String name){
     this.name=name;
        setBounds(50,0,1500,850);
        getContentPane().setBackground(Color.PINK);
        setLayout(null);

        ImageIcon i= new ImageIcon(ClassLoader.getSystemResource("projectImage.jpg"));
        JLabel pic =new JLabel(i);
        pic.setBounds(0,0,1500,350);
        add(pic);

         qno=new JLabel();
        qno.setBounds(50,400,1500,50);
        qno.setFont(new Font("Tahoma",Font.BOLD,24));
        add(qno);

         question=new JLabel();
        question.setBounds(90,400,1500,50);
        question.setFont(new Font("Tahoma",Font.PLAIN,22));
       add(question);

        questions[0][0] = "Which one of the following river flows between Vindhyan and Satpura ranges?";
        questions[0][1] = "Narmada";
        questions[0][2] = "Mahanadi";
        questions[0][3] =  "Son";
        questions[0][4] =  "Netravati";


        questions[1][0] = "The Central Rice Research Station is situated in?";
        questions[1][1] = "Chennai";
        questions[1][2] = "Cuttack";
        questions[1][3] = "Bangalore";
        questions[1][4] = "Quilon";


        questions[2][0] = "Who among the following wrote Sanskrit grammar?";
        questions[2][1] = "Kalidasa";
        questions[2][2] = "Charak";
        questions[2][3] = "Panini";
        questions[2][4] = "Aryabhatt";

        questions[3][0] = "The metal whose salts are sensitive to light is?";
        questions[3][1] = "Zinc";
        questions[3][2] = "Silver";
        questions[3][3] = "Copper";
        questions[3][4] = "Aluminum";

        questions[4][0] = "Chambal river is a part of –";
        questions[4][1] = "Sabarmati basin";
        questions[4][2] = "Ganga basin";
        questions[4][3] = "Narmada basin";
        questions[4][4] = "Godavari basin";

        questions[5][0] = " Volcanic eruption do not occur in the";
        questions[5][1] = "Baltic sea";
        questions[5][2] = "Black sea";
        questions[5][3] = "Caribbean sea";
        questions[5][4] = "Caspian sea";

        questions[6][0] = " Indus river originates in –";
        questions[6][1] = "Kinnaur";
        questions[6][2] = "Ladakh";
        questions[6][3] = "Nepal";
        questions[6][4] = "Tibet";

        questions[7][0] = " Which one of the following rivers originates in Brahmagiri range of Western Ghats?";
        questions[7][1] = "Pennar";
        questions[7][2] = "Cauvery";
        questions[7][3] = "Krishna";
        questions[7][4] = "Tapti";

        questions[8][0] = "The hottest planet in the solar system?";
        questions[8][1] = "Mercury";
        questions[8][2] = "Venus";
        questions[8][3] = "Mars";
        questions[8][4] = "Jupiter";

        questions[9][0] = " Where was the electricity supply first introduced in India ";
        questions[9][1] = "Mumbai";
        questions[9][2] = "Dehradun";
        questions[9][3] = "Darjeeling";
        questions[9][4] = "Chennai";



        answers[0][1] = " Narmada.";
        answers[1][1] = "Cuttack";
        answers[2][1] = "Panini";
        answers[3][1] = " Silver";
        answers[4][1] = "Narmada basin";
        answers[5][1] = "Baltic sea";
        answers[6][1] = "Tibet";
        answers[7][1] = "Cauvery";
        answers[8][1] = "Venus";
        answers[9][1] = " Darjeeling";


         opt1=new JRadioButton();
        opt1.setBackground(Color.pink);
        opt1.setBounds(170,520,700,30);
        opt1.setFont(new Font("Dialog",Font.PLAIN,20));
        add(opt1);

         opt2=new JRadioButton();
        opt2.setBackground(Color.pink);
        opt2.setBounds(170,560,700,30);
        opt2.setFont(new Font("Dialog",Font.PLAIN,20));
        add(opt2);

         opt3=new JRadioButton();
        opt3.setBackground(Color.pink);
        opt3.setBounds(170,600,700,30);
        opt3.setFont(new Font("Dialog",Font.PLAIN,20));
        add(opt3);

        opt4=new JRadioButton();
        opt4.setBackground(Color.pink);
        opt4.setBounds(170,640,700,30);
        opt4.setFont(new Font("Dialog",Font.PLAIN,20));
        add(opt4);

        bg=new ButtonGroup();
        //if i selection one option other option can automatically deselected
        bg.add(opt1);
        bg.add(opt2);
        bg.add(opt3);
        bg.add(opt4);

         next=new JButton("Next");
        next.setBounds(1110,550,200,40);
        next.setFont(new Font("Tahoma",Font.PLAIN,22));
        next.addActionListener(this);
        add(next);




         submit=new JButton("Submit");
        submit.setBounds(1110,650,200,40);
       submit.setFont(new Font("Tahoma",Font.PLAIN,22));
       submit.setEnabled(false);//disable submit button
       submit.addActionListener(this);
        add(submit);

        start(count);

        //setSize(800,650);
        setVisible(true);
        new Score(name,score);

    }

 @Override
 public void actionPerformed(ActionEvent e) {
  if(e.getSource()==next){
   repaint();
   opt1.setEnabled(true);
   opt2.setEnabled(true);
   opt3.setEnabled(true);
   opt4.setEnabled(true);

   ansGiven=1;
   if(bg.getSelection()==null){
    userans[count][0]="";
   }else{
    userans[count][0]=bg.getSelection().getActionCommand();
   }
   if(count==8){
    next.setEnabled(false);
    submit.setEnabled(true);
   }

   count++;
   start(count);

  }


  else if(e.getSource()==submit){
   ansGiven=1;
   if (bg.getSelection() == null) {
    userans[count][0] = "";
   } else {
    userans[count][0] = bg.getSelection().getActionCommand();
   }

   for(int i=0;i<userans.length;i++){
    //marks
    if(userans[i][0].equals(answers[i][1])){
     score=score+10;
    }
   }
   setVisible(false);
   new Score(name,score);


  }
 }

    public void paint(Graphics g){
     super.paint(g);
     String t="Time Left: " +timer +" second";
     g.setColor(Color.blue);
     g.setFont(new Font("Tahoma",Font.BOLD,20));
     if(timer>0){
      g.drawString(t,1100,500);
     }else{
      g.drawString("Times up",1100,500);
     }
     timer--;
     try{
      Thread.sleep(1000);
      repaint();
     }catch (Exception e){
      e.printStackTrace();
     }

     if(ansGiven==1){
      ansGiven=0;
      timer=30;
     }
     else if(timer<0) {
      timer = 30;
      opt1.setEnabled(true);
      opt2.setEnabled(true);
      opt3.setEnabled(true);
      opt4.setEnabled(true);

      if (count == 8) {
       next.setEnabled(false);
       submit.setEnabled(false);
      }
      if (count == 9) {
       //auto-submit button
       if (bg.getSelection() == null) {
        userans[count][0] = "";
       } else {
        userans[count][0] = bg.getSelection().getActionCommand();
       }

       for(int i=0;i<userans.length;i++){
        //marks
        if(userans[i][0].equals(answers[i][1])){
         score=score+10;
        }
       }
       setVisible(false);
       //score

      } else {
       //auto-next button

      if (bg.getSelection() == null) {
       userans[count][0] = "";
      } else {
       userans[count][0] = bg.getSelection().getActionCommand();
      }
      count++;
      start(count);
     }
     }

    }
    public void start(int count){
     qno.setText(""+(count+1)+".   ");
     question.setText(questions[count][0]);
     opt1.setText(questions[count][1]);
     opt1.setActionCommand(questions[count][1]);

     opt2.setText(questions[count][2]);
     opt2.setActionCommand(questions[count][2]);

     opt3.setText(questions[count][3]);
     opt3.setActionCommand(questions[count][3]);

     opt4.setText(questions[count][4]);
     opt4.setActionCommand(questions[count][4]);

     bg.clearSelection();

    }
    public static void main(String[] args) {
        new Quiz("user");
    }
}
