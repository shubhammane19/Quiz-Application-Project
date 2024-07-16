import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Login extends JFrame implements ActionListener{

    JButton  start,back;
    JTextField tfname; 
    public Image backgroundImage;
    Login(){

            getContentPane().setBackground(Color.WHITE);
            setLayout(null);

            ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("Quizimagee.png"));
            Image i1 = il.getImage().getScaledInstance(500,550,Image.SCALE_DEFAULT);
            ImageIcon il2 = new ImageIcon(i1);
            JLabel image = new JLabel(il2);
            image.setBounds(0, 0,700,600);
            add(image);

            JLabel heading = new JLabel("Beautiful Minds");
            heading.setBounds(650, 50, 300, 45);
            heading.setFont(new Font("Viner lland ITC",Font.BOLD,35));
            heading.setForeground(Color.ORANGE);
            add(heading);

            JLabel name = new JLabel("Enter your name:");
            name.setBounds(710, 110,250,20);
            name.setFont(new Font("Mongolian Baiti", Font.BOLD,18));
            name.setForeground(Color.blue);
            add(name);

            tfname= new JTextField();
            tfname.setBounds(635, 150,300,25);
            tfname.setFont(new Font("Times New Roman",Font.CENTER_BASELINE,15));
            add(tfname);

            start = new JButton("start");
            start.setBounds(670,210,70,25);
            start.setBackground(Color.GREEN);
            start.setForeground(Color.WHITE);
            start.addActionListener(this);
            add(start);

            back = new JButton("back");
            back.setBounds(810,210,70,25);
            back.setBackground(Color.RED);
            back.setForeground(Color.WHITE);
            back.addActionListener(this);
            add(back);

            setSize(1000, 500);
            setLocation(200, 200);
            setBackground(Color.BLACK);
            setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){

        if(ae.getSource() == start){
            String name = tfname.getText();
            setVisible(false);
            new Start(name);

        }else if(ae.getSource() == back){

            setVisible(false);
        }   
    }

    public static void main(String[] args){

        Login l = new Login();
    }
}