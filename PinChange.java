
package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;





public class PinChange extends JFrame implements ActionListener{

    
//    JTextField pin ,repin ;  kyunki hume eneter karne par pin visible nhii chahiye
    JPasswordField pin , repin ;
    JButton change , back;
    String pin_number;
    
    
    PinChange(String pin_number){
        
        this.pin_number = pin_number;
        
       setLayout(null);
        
     
      ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("icons/ATM.jpg"));
      Image img2 = img1.getImage().getScaledInstance(900 , 900 ,Image.SCALE_DEFAULT); //object of an image
      ImageIcon img3 = new ImageIcon(img2);  //converting image into imageicon  kyunki hum img2 ko label ke andar pass ni kar sakte error ayega

      JLabel image = new JLabel(img3);
      image.setBounds(0 , 0 , 900 , 900);   //fixing location of image with the help of layout
      add(image); 
      
      
      JLabel text = new JLabel("CHANGE YOUR PIN");
      text.setBounds(270 , 320 ,700 , 35);
      text.setForeground(Color.WHITE);
      text.setFont(new Font("System" , Font.BOLD , 16));
      image.add(text);
      
      
      JLabel pintext = new JLabel("NEW PIN:");
      pintext.setBounds(222 , 360 ,180 , 25);
      pintext.setForeground(Color.WHITE);
      pintext.setFont(new Font("System" , Font.BOLD , 13));
      image.add(pintext);
      
      
//      JTextField 
              pin = new JPasswordField();
      pin.setFont(new Font("Raleway" , Font.BOLD , 20));
      pin.setBounds(347 , 360 , 130 , 20);
      image.add(pin);
      
      
      JLabel repintext = new JLabel("Re-Enter New PIN:");
      repintext.setBounds(222 , 390 ,180 , 25);
      repintext.setForeground(Color.WHITE);
      repintext.setFont(new Font("System" , Font.BOLD , 13));
      image.add(repintext);
      
      
//      JTextField 
              repin = new JPasswordField();
      repin.setFont(new Font("Raleway" , Font.BOLD , 20));
      repin.setBounds(347 , 390 , 130 , 20);
      image.add(repin);
     
      
//    JButoon 
             change = new JButton("CHANGE");
     change.setBounds(353 , 488 ,130 , 30);
     change.addActionListener(this);
     image.add(change);
        
     
//     JButton 
             back = new JButton("BACK");
     back.setBounds(353 , 526 ,130 , 30);
     back.addActionListener(this);
     image.add(back);
      
      
    setSize(900 , 900);
    setLocation(300 , 0);
    setUndecorated(true); 
    setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent ae){
      
        if(ae.getSource() == change)
        {
         
            try{
                 String new_pin = pin.getText();
                 String re_entered_pin = repin.getText();
                 
                 if(! new_pin.equals(re_entered_pin))
                 {
                     JOptionPane.showMessageDialog(null ,"Entered PIN does not match");
                     return;
                 }
                 
                 if(new_pin.equals(""))
                 {
                     JOptionPane.showMessageDialog(null ,"Please enter PIN");
                     return; 
                 }
                 
                 
                  if(re_entered_pin.equals(""))
                 {
                     JOptionPane.showMessageDialog(null ,"Please re-enter new PIN");
                     return; 
                 }
                  
                  
                  Conn conn = new Conn();
                  String query1 = "update bank set pin = '" +re_entered_pin+ "' Where pin = '"+ pin_number +"'";
                   String query2 = "update login set pin = '" +re_entered_pin+ "' Where pin = '"+ pin_number +"'";
                    String query3 = "update signup3 set pin = '" +re_entered_pin+ "' Where pin = '"+ pin_number +"'";
                    
                    
                    conn.s.executeUpdate(query1);
                     conn.s.executeUpdate(query2);
                      conn.s.executeUpdate(query3);
                 
           
                      JOptionPane.showMessageDialog(null ,"PIN changed successfully");
                      
                      
                      setVisible(false);
                      new Transactions(re_entered_pin).setVisible(true);
                      
                      
            }catch(Exception e)
            {
                System.out.println(e);
            }  
    }else{
            
           setVisible(false);
           new Transactions(pin_number).setVisible(true);
            
        }
    }
    public static void main(String args[]){
        
       new PinChange("");
    }
}
