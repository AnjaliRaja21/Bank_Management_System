
package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


import java.util.Date;


public class Withdrawl extends JFrame implements ActionListener{

    
    JButton withdraw , back;
    JTextField amount;
    String pin_no;
    
    
    Withdrawl(String pin_no){   
       
        
        this.pin_no = pin_no;
        
       setLayout(null);
        
     
      ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("icons/ATM.jpg"));
      Image img2 = img1.getImage().getScaledInstance(900 , 900 ,Image.SCALE_DEFAULT); //object of an image
      ImageIcon img3 = new ImageIcon(img2);  //converting image into imageicon  kyunki hum img2 ko label ke andar pass ni kar sakte error ayega

      JLabel image = new JLabel(img3);
      image.setBounds(0 , 0 , 900 , 900);   //fixing location of image with the help of layout
      add(image); 
      
      
      JLabel text = new JLabel("Enter the amount you want to Withdraw");
      text.setBounds(225 , 340 ,300 , 20);
      text.setForeground(Color.WHITE);
      text.setFont(new Font("System" , Font.BOLD , 13));
      image.add(text); 
      
      
//      JTextField
              amount = new JTextField();
      amount.setFont(new Font("Raleway" , Font.BOLD , 22));
      amount.setBounds(220 , 370 , 250 , 25);
      image.add(amount);
      
        
//     JButton  
             withdraw = new JButton("Withdraw");
     withdraw.setBounds(353 , 488 ,130 , 30);
     withdraw.addActionListener(this);
     image.add(withdraw);
      
        
     
//     JButton
             back = new JButton("Exit");
     back.setBounds(353 , 526 ,130 , 30);
     back.addActionListener(this);
     image.add(back);
        
        
    setSize(900 , 900);
    setLocation(350 , 0);
    setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource() == withdraw)
        {
            String deposit_amount = amount.getText();
            Date date = new Date();                                        // util package se ata h
            if(deposit_amount.equals(""))
            {
                JOptionPane.showMessageDialog(null , "please enter the amount you want to withdraw");
             
            }else{
                
                try{
                    
                Conn conn = new Conn();                               //creating connection with database
                
                String query = "insert into bank values('"+pin_no+"' , '"+date+"' , 'Withdrawl' , '"+deposit_amount+"')";

//                now if we need to actually deposit the amount so for that we need to run dbml command

                conn.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Rs " + deposit_amount + " Withdraw Successfully");
                
                setVisible(false);
                new Transactions(pin_no).setVisible(true);
                
                }catch(Exception e){
                    
                    System.out.println(e);
                }
            }
            
            
        }else if(ae.getSource() == back)
        {
            setVisible(false);
            new Transactions(pin_no).setVisible(true);
        }
    }
    public static void main(String args[]) {
       
        new Withdrawl("");
    }
}
