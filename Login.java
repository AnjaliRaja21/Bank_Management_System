
package bank.management.system;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;          //javax kyunki swing java ke extended package se ata h
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;


import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener{   //implemented interfaces to take  actions on login clear registration
                                                               //login error dega kyunki agar hum kisis interface ko implement karate h
                                                                 //to us interface ke andar jitne bhi methods hote h apko unko override karbana padta h


       JButton login , signUp , clear;    //globally defined so that we can use them inside the actionperformed funtions
       JTextField  cardTextField;
       JPasswordField  pinTextField;    //taaki password kisi ko dikhe nahi
    
        Login(){                                     

        setTitle("AUTOMATED TELLER MACHINE");
        setLayout(null);          //tabhi setBounds function work karega


        ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo_ATM.jpg"));
        Image img2 = img1.getImage().getScaledInstance(140 , 130 ,Image.SCALE_DEFAULT); //object of an image
        ImageIcon img3 = new ImageIcon(img2);  //converting image into imageicon  kyunki hum img2 ko label ke andar pass ni kar sakte error ayega

        JLabel label = new JLabel();
 
        label.setBounds(70 , 20 , 140 , 130);   //fixing location of image with the help of layout
        label.setIcon(img3);
        // label.setBackground(Color.WHITE);
        // label.setOpaque(true);
        add(label);

        JLabel text = new JLabel("Welcome To ATM");
        text.setFont(new Font("Osward" , Font.BOLD , 38));  //created object of Font then passed font family ,font type , font size
        text.setBounds(280, 60, 400, 40);  //kyunki bydeafault layout null h
        add(text);


        JLabel cardNo = new JLabel("Card No :");
        cardNo.setFont(new Font("Raleway" , Font.BOLD , 28));  //created object of Font then passed font family ,font type , font size
        cardNo.setBounds(120, 190, 150, 30);  //kyunki bydeafault layout null h
        add(cardNo);



        // JTextField 
        cardTextField = new JTextField();
        cardTextField.setBounds(300, 190, 230, 30);
        cardTextField.setFont(new Font("Arial" , Font.BOLD , 14));
        add(cardTextField);



        JLabel pin = new JLabel("PIN :");
        pin.setFont(new Font("Raleway" , Font.BOLD , 28));  //created object of Font then passed font family ,font type , font size
        pin.setBounds(120, 250, 150, 30);  //kyunki bydeafault layout null h
        add(pin);


        // JTextField
        pinTextField = new JPasswordField();
        pinTextField.setBounds(300, 250, 230, 30);
        pinTextField.setFont(new Font("Arial" , Font.BOLD , 14));
        add(pinTextField);


        // JButton         kyunki localy define horae the button but kyunki hume actionperformed func me use karna h isliye globally karne padenge
        login = new JButton("SIGN IN");
        login.setBounds(300 , 320 , 100 , 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);


        // JButton
         clear = new JButton("CLEAR");
        clear.setBounds(430 , 320 , 100 , 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);          //ye batayega ki button par click hua h lekin click hone par kyaa karna h vo define karenge hum actionPerformed func ke andar
        
        
        add(clear);                               


        // JButton 
        signUp = new JButton("SIGN UP");
        signUp.setBounds(300 , 370 , 230 , 30);
        signUp.setBackground(Color.BLACK);
        signUp.setForeground(Color.WHITE);
        signUp.addActionListener(this);
        add(signUp);

        getContentPane().setBackground(Color.WHITE);    //poora frame utha kar dega
 
       
        setSize(800 , 480);
        setVisible(true);
        setLocation(350 , 200);     //350 horizontal 200 vertical
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    public void actionPerformed(ActionEvent ae){

     if(ae.getSource() == clear){
          
        cardTextField.setText("");   //to set text
        pinTextField.setText("");

     }else if(ae.getSource() == login){

         Conn conn = new Conn();
         String card_no = cardTextField.getText();
         String pin_no = pinTextField.getText();  //kyunki password hidden h
         String query = "select * from login where card_number = '"+ card_no +"' and pin = '"+pin_no+"'";
         
         try{
             
          ResultSet rs  =  conn.s.executeQuery(query);  //resultset ke obj me value dega resultset mysql se aata h to usko import karlenge upar matlab iska data type resultset hota h
             if(rs.next())  // matlab agar data aya h to
             {
               setVisible(false); //matlab agar rs ne value pakdi h matlab user succesfully login kiya h
               new Transactions(pin_no).setVisible(true);
             }
             else{      // agar data match nahi hua to
                
                 JOptionPane.showMessageDialog(null , "Incorrect card number or pin");
             }
          
          
         }catch(Exception e){ 
             System.out.println(e);     
         }
           
           
     }else if(ae.getSource() == signUp){

         setVisible(false);
         new SignUp1().setVisible(true);   //created object of signup1 class
         
     }

    }
    
    public static void main(String [] args){

        new Login();
    }
}