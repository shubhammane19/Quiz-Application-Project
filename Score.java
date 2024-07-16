import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Score extends JFrame implements ActionListener{

    Score(String name, int score){

        setBounds(400,150,750,550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setVisible(true);
       
        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("score.png"));
        Image i2 = il.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,200,300,350);
        //addComponentListener(this);
        add(image);

        JLabel heading= new JLabel("Thankyou " + name + " for playing Beautiful minds");
        heading.setBounds(45,30,700,30);
        heading.setFont(new Font("Tahoma", Font.PLAIN,22));
        heading.setBackground(Color.BLACK);
        add(heading);

        JLabel lblscore= new JLabel("Your Score is : " + score);
        lblscore.setBounds(350,200,300,30);
        lblscore.setFont(new Font("Tahoma", Font.PLAIN,22));
        //lblscore.setBackground(Color.BLACK);
        add(lblscore);

       
    }

    public void actionPerformed(ActionEvent ae){


    }


    public static void main(String[] args){

        new Score("User",0);
    }
}