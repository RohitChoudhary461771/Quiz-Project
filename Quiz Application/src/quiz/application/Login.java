package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{//implements means abstrat class

    JButton rules,back;//global declaration of buttons
    JTextField tfname;
    
    Login(){
        getContentPane() .setBackground(Color.WHITE);
        setLayout(null);
      
     //🎯 Adding Image in frame
     
        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image=new JLabel(i1);
        image.setBounds(-1,-1,600,500);
        add(image);
        
     //🎯 Adding heading in Frame   
     
        JLabel heading =new JLabel("Simple Minds");
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        heading.setForeground(new Color(30,144,254));
        add(heading);//add keyword is must to a add any thing in jframe.
     
    //🎯 Adding Enter You name in Frame
        
        JLabel name =new JLabel("Enter your name");
        name.setBounds(810,130,300,45);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,25));
        name.setForeground(new Color(30,144,254));
        add(name);
     
    //🎯 Adding field text box in frame using JTextField.
       
        tfname =new JTextField();
        tfname.setBounds(735,200,300,25);
        tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tfname);
     
    //🎯 Creating a Rule button in frame  
        
         rules =new JButton("Rules");
        rules.setBounds(735,270,120,25);
        rules.setBackground(Color.green);//or use new Color(30,144,254);
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
    
    //🎯 Creating a Back button in frame  
        
        back =new JButton("Back");
        back.setBounds(915,270,120,25);
        back.setBackground(new Color(30,144,254));//or use new Color(30,144,254);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        
        setSize(1200,500);
        setLocation(100,150);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==rules){
            String name=tfname.getText();
            setVisible(false);
            new Rules(name);
        }
        else if(ae.getSource()==back){
            setVisible(false);
        }
    }
    
    public static  void main (String[] args){
        new Login();
    }
}
