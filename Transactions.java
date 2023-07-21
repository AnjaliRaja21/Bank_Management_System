
package bank.management.system;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;


import java.awt.Font;
import java.awt.Color;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class Transactions extends JFrame implements ActionListener{

//    constructure me sara code isliye likhte h kyunki jese hi hum object banaye class ka vese hi hume frmae mil jaaye
//    class ka object banate hi cunstructure call hota h
    
    JButton deposit , withdrawl , fastcash , ministatement , pinchange , balanceEnquery ,exit;
    String pin_no;
    
    
    Transactions(String pin_no){
        
        
        this.pin_no = pin_no;
      setLayout(null);
        
     
      ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("icons/ATM.jpg"));
      Image img2 = img1.getImage().getScaledInstance(900 , 900 ,Image.SCALE_DEFAULT); //object of an image
      ImageIcon img3 = new ImageIcon(img2);  //converting image into imageicon  kyunki hum img2 ko label ke andar pass ni kar sakte error ayega

      JLabel image = new JLabel(img3);
      image.setBounds(0 , 0 , 900 , 900);   //fixing location of image with the help of layout
      add(image); 
      
      
      JLabel text = new JLabel("Please Select your Transaction");
      text.setBounds(230 , 340 ,700 , 35);
      text.setForeground(Color.WHITE);
      text.setFont(new Font("System" , Font.BOLD , 16));
      image.add(text);
      
      
//      JButton 
              deposit = new JButton("Deposit");
      deposit.setBounds(208 , 415 ,130 , 30);
      deposit.addActionListener(this);
      image.add(deposit);
      
      
//       JButton 
               withdrawl = new JButton("Cash Withdrawl");
      withdrawl.setBounds(353 , 415 ,130 , 30);
      withdrawl.addActionListener(this);
      image.add(withdrawl);
      
      
//       JButton
               fastcash = new JButton("Fast Cash");
      fastcash.setBounds(208 , 454 ,130 , 30);
      fastcash.addActionListener(this);
      image.add(fastcash);
      
      
//      JButton 
              ministatement = new JButton("Mini Statement");
      ministatement.setBounds(353 , 454 ,130 , 30);
      ministatement.addActionListener(this);
      image.add(ministatement);
      
      
//      JButton 
              pinchange = new JButton("Pin Change");
      pinchange.setBounds(208 , 492 ,130 , 30);
      pinchange.addActionListener(this);
      image.add(pinchange);
      
      
//     JButton
             balanceEnquery = new JButton("Balance Enquiry");
     balanceEnquery.setBounds(353 , 492 ,130 , 30);
     balanceEnquery.addActionListener(this);
     image.add(balanceEnquery);
      
      
      
//     JButton 
             exit = new JButton("Exit");
     exit.setBounds(353 , 530 ,130 , 30);
     exit.addActionListener(this);
     image.add(exit);
        
        
    setSize(900 , 900);
    setLocation(300 , 0);
    setUndecorated(true); // ye frame ke upar vala title part hata dega
    setVisible(true); // isko humesha neache hi rakhte h
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource() == exit)
        {
         System.exit(0);   
        }
        else if(ae.getSource() == deposit)
        {
            setVisible(false);
            new Deposit(pin_no).setVisible(true);
        }
        else if(ae.getSource() == withdrawl)
        {
            setVisible(false);
            new Withdrawl(pin_no).setVisible(true);
        }
        else if(ae.getSource() == fastcash)
        {
            setVisible(false);
            new FastCash(pin_no).setVisible(true); 
        }
        else if(ae.getSource() == pinchange)
        {
             setVisible(false);
            new PinChange(pin_no).setVisible(true); 
        }
        else if(ae.getSource() == balanceEnquery)
        {
            setVisible(false);
            new BalanceEnquiry(pin_no).setVisible(true);
        }else if(ae.getSource() == ministatement)
        {
//            setVisible(false);
            new MiniStatement(pin_no).setVisible(true);
        }
        
    }
    
    public static void main(String args[]) {
       
        new Transactions("");
    }
}
