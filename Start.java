import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Start extends JFrame implements ActionListener{
    
    String name;
    JButton Launch, Back;
   // JLabel image2;
    String questions[][] = new String[10][5];
    String answers[][] = new String[10][2];
    String useranswers[][] = new String[10][1];
    JLabel Qno,QString;
    ButtonGroup groupbutton;
    static int count = 0;
    JButton next,Submit;
    JRadioButton opt1,opt2,opt3,opt4;
    public static int timer = 15;
    public static int ans_given = 0;
    public static int score = 0;
    public static String username;

    Start(String name){

        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        setSize(800,650);
        setLocation(350,100);
        setVisible(true);

        JLabel heading = new JLabel("Welcome " + name +" to Beautiful Minds");
        heading.setBounds(50,20,700,30);
        heading.setFont(new Font("Viner lland ITC",Font.BOLD,35));
        heading.setForeground(Color.ORANGE);
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(20,90,700,350);
        rules.setFont(new Font("Tahoma", Font.PLAIN,16));
        rules.setText(
            "<html>"+ 
                "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                "4. Crying is allowed but please do so quietly." + "<br><br>" +
                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
            "<html>"
         );
         add(rules);

        Launch = new JButton("Launch");
        Launch.setBounds(250,470,120,25);
        Launch.setBackground(Color.GREEN);
        Launch.setForeground(Color.WHITE);
        Launch.addActionListener(this);
        add(Launch);

        Back = new JButton("Back");
        Back.setBounds(415,470,120,25);
        Back.setBackground(Color.RED);
        Back.setForeground(Color.WHITE);
        Back.addActionListener(this);
        add(Back);
    }

    public void actionPerformed(ActionEvent ae){

            if(ae.getSource() == Launch){

                setVisible(false);
                new Test(username);

            }else if(ae.getSource() == Back){

                setVisible(false);
                new Login();
            }
    }

    class Test extends JFrame implements ActionListener{

        public static String name;

        Test(String name){
            
            this.name = name;
            setBounds(50,0,1440,1450);
            getContentPane().setBackground(Color.WHITE);
            setLayout(null);
            setVisible(true);
           
            ImageIcon il2 = new ImageIcon(ClassLoader.getSystemResource("QUIZ1.png"));
            Image i2 = il2.getImage().getScaledInstance(1440,400,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            JLabel image2 = new JLabel(i3);
            image2.setBounds(0,0,1440,400);
            //addComponentListener(this);
            add(image2);

            Qno = new JLabel("1");
            Qno.setBounds(50,450,40,50);
            Qno.setFont(new Font("Tahoma", Font.PLAIN,24));
            Qno.setBackground(Color.BLACK);
            add(Qno);

            QString = new JLabel();
            QString.setBounds(100,450,1000,50);
            QString.setFont(new Font("Tahoma", Font.PLAIN,24));
            QString.setBackground(Color.BLACK);
            add(QString);

            questions[0][0] = "Which is used to find and fix bugs in the Java programs.?";
            questions[0][1] = "JVM";
            questions[0][2] = "JDB";
            questions[0][3] = "JDK";
            questions[0][4] = "JRE";

            questions[1][0] = "What is the return type of the hashCode() method in the Object class?";
            questions[1][1] = "int";
            questions[1][2] = "Object";
            questions[1][3] = "long";
            questions[1][4] = "void";

            questions[2][0] = "Which package contains the Random class?";
            questions[2][1] = "java.util package";
            questions[2][2] = "java.lang package";
            questions[2][3] = "java.awt package";
            questions[2][4] = "java.io package";

            questions[3][0] = "An interface with no fields or methods is known as?";
            questions[3][1] = "Runnable Interface";
            questions[3][2] = "Abstract Interface";
            questions[3][3] = "Marker Interface";
            questions[3][4] = "CharSequence Interface";

            questions[4][0] = "In which memory a String is stored, when we create a string using new operator?";
            questions[4][1] = "Stack";
            questions[4][2] = "String memory";
            questions[4][3] = "Random storage space";
            questions[4][4] = "Heap memory";

            questions[5][0] = "Which of the following is a marker interface?";
            questions[5][1] = "Runnable interface";
            questions[5][2] = "Remote interface";
            questions[5][3] = "Readable interface";
            questions[5][4] = "Result interface";

            questions[6][0] = "Which keyword is used for accessing the features of a package?";
            questions[6][1] = "import";
            questions[6][2] = "package";
            questions[6][3] = "extends";
            questions[6][4] = "export";

            questions[7][0] = "In java, jar stands for?";
            questions[7][1] = "Java Archive Runner";
            questions[7][2] = "Java Archive";
            questions[7][3] = "Java Application Resource";
            questions[7][4] = "Java Application Runner";

            questions[8][0] = "Which of the following is a mutable class in java?";
            questions[8][1] = "java.lang.StringBuilder";
            questions[8][2] = "java.lang.Short";
            questions[8][3] = "java.lang.Byte";
            questions[8][4] = "java.lang.String";

            questions[9][0] = "Which of the following option leads to the portability and security of Java?";
            questions[9][1] = "Bytecode is executed by JVM";
            questions[9][2] = "The applet makes the Java code secure and portable";
            questions[9][3] = "Use of exception handling";
            questions[9][4] = "Dynamic binding between objects";

            answers[0][1] = "JDB";
            answers[1][1] = "int";
            answers[2][1] = "java.util package";
            answers[3][1] = "Marker Interface";
            answers[4][1] = "Heap memory";
            answers[5][1] = "Remote interface";
            answers[6][1] = "import";
            answers[7][1] = "Java Archive";
            answers[8][1] = "java.lang.StringBuilder";
            answers[9][1] = "Bytecode is executed by JVM";

            opt1 = new JRadioButton();
            opt1.setBounds(130,520,800,30);
            opt1.setBackground(Color.WHITE);
            opt1.setFont(new Font("Dialog",Font.PLAIN,20));
            add(opt1);

            opt2 = new JRadioButton();
            opt2.setBounds(130,560,800,30);
            opt2.setBackground(Color.WHITE);
            opt2.setFont(new Font("Dialog",Font.PLAIN,20));
            add(opt2);

            opt3 = new JRadioButton();
            opt3.setBounds(130,600,800,30);
            opt3.setBackground(Color.WHITE);
            opt3.setFont(new Font("Dialog",Font.PLAIN,20));
            add(opt3);

            opt4 = new JRadioButton();
            opt4.setBounds(130,640,800,30);
            opt4.setBackground(Color.WHITE);
            opt4.setFont(new Font("Dialog",Font.PLAIN,20));
            add(opt4);

            groupbutton = new ButtonGroup();
            groupbutton.add(opt1);
            groupbutton.add(opt2); 
            groupbutton.add(opt3); 
            groupbutton.add(opt4); 

            next = new JButton("Next");
            next.setBounds(1100,550,120,30);
            next.setFont(new Font("Tahoma",Font.PLAIN,20));
            next.setBackground(Color.GRAY);
            next.setForeground(Color.BLACK);
            next.addActionListener(this);
            add(next);

            Submit = new JButton("Submit");
            Submit.setBounds(1100,610,120,30);
            Submit.setFont(new Font("Tahoma",Font.PLAIN,20));
            Submit.setBackground(Color.GRAY);
            Submit.setForeground(Color.BLACK);
            Submit.addActionListener(this);
            add(Submit);

            start(count);
        }

        public void actionPerformed(ActionEvent a){

            if(a.getSource() == next){
                repaint();

                ans_given = 1;
                if(groupbutton.getSelection() == null){

                    useranswers[count][0] = "";

                }else{

                    useranswers[count][0] = groupbutton.getSelection().getActionCommand();
                }

                if(count == 8){
                    next.setEnabled(false);
                    Submit.setEnabled(true);
                }
                count++;
                start(count);
            }else if(a.getSource() == Submit){
                ans_given = 1;
                if(groupbutton.getSelection() == null){
                    useranswers[count][0] = "";
                }else{
                    useranswers[count][0] = groupbutton.getSelection().getActionCommand();
                }

                for(int i =0; i<useranswers.length; i++){

                    if(useranswers[i][0].equals(answers[i][1])){
                        score = score +10;
                    }
                }
                setVisible(false);
                new Score(name,score);
                
            }
        }

        public void paint(Graphics g){

            super.paint(g);

            String time = "Time left: " + timer + "seconds";
            g.setColor(Color.RED);
            g.setFont(new Font("Tahoma", Font.BOLD,20));

            if(timer>0){

                g.drawString(time, 1100,530);
            }else{

                g.drawString("Times Up!!",1100,500);
            }
            timer--;

            try{

                Thread.sleep(1000);
                repaint();
            }catch(Exception e){
                e.printStackTrace();
            }

            if(ans_given == 1){

                ans_given = 0;
                timer = 15;

            }else if(timer < 0){
                timer = 15;
                if(count == 8){
                    next.setEnabled(false);
                    Submit.setEnabled(true);
                }

                if(count == 9){  //submit

                    if(groupbutton.getSelection() == null){

                        useranswers[count][0] = "";

                    }else{

                        useranswers[count][0] = groupbutton.getSelection().getActionCommand();
                    }

                    for(int i =0; i<useranswers.length; i++){

                        if(useranswers[i][0].equals(answers[i][1])){
                            score = score +10;
                        }
                        
                    }
                    setVisible(false);
                    new Score(name,score);

                }else{ //next auto
                
                    if(groupbutton.getSelection() == null){

                        useranswers[count][0] = "";

                    }else{

                        useranswers[count][0] = groupbutton.getSelection().getActionCommand();
                    }
                    count++;
                    start(count);
                }
            }
        }

        public void start(int count){

            Qno.setText(""+ (count + 1) + ".");
            QString.setText(questions[count][0]);
            opt1.setText(questions[count][1]);
            opt1.setActionCommand(questions[count][1]);

            opt2.setText(questions[count][2]);
            opt2.setActionCommand(questions[count][2]);

            opt3.setText(questions[count][3]);
            opt3.setActionCommand(questions[count][3]);

            opt4.setText(questions[count][4]);
            opt4.setActionCommand(questions[count][4]);

            groupbutton.clearSelection();

        }
    }



    public static void main(String[] args){

        new Start("User");
       
    }
}
