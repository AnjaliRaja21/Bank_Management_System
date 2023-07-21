
package bank.management.system;


import java.awt.Color;
import java.awt.Font;
import java.awt.Image;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


import java.sql.ResultSet;


public class BalanceEnquiry extends JFrame implements ActionListener{

      JButton back;
      String pin_number;
    
    BalanceEnquiry(String pin_number){
        
        
      this.pin_number = pin_number;
        
      setLayout(null);
        
     
      ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("icons/ATM.jpg"));
      Image img2 = img1.getImage().getScaledInstance(900 , 900 ,Image.SCALE_DEFAULT);                   //object of an image
      ImageIcon img3 = new ImageIcon(img2);                                                                          //converting image into imageicon  kyunki hum img2 ko label ke andar pass ni kar sakte error ayega

      JLabel image = new JLabel(img3);
      image.setBounds(0 , 0 , 900 , 900);                                                                //fixing location of image with the help of layout
      add(image); 
      
      
//      JButton
             back = new JButton("Back");
     back.setBounds(353 , 526 ,130 , 30);
     back.addActionListener(this);
     image.add(back); 
        
        
            Conn conn = new Conn();
            int balance = 0;
         
            try{
                
                ResultSet rs = conn.s.executeQuery("Select * from bank where pin = '" +pin_number+ "'");
                
                
                while(rs.next())
                {
                  if(rs.getString("type").equals("Deposit"))  
                  {
                      balance += Integer.valueOf(rs.getString("amount"));
                  }
                  else
                  {
                      balance -= Integer.parseInt(rs.getString("amount"));
                  }
                }
            }catch(Exception e)
            {
                System.out.println(e);
            }
        
        
      JLabel text = new JLabel("Your Current Account balance is Rs " + balance);
      text.setBounds(215 , 350 ,300 , 35);
      text.setForeground(Color.WHITE);
      text.setFont(new Font("System" , Font.BOLD , 13));
      image.add(text);
            
            
            
        
    setSize(900 , 900);
    setLocation(300 , 0);
    setUndecorated(true); 
    setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent ae){
        
        setVisible(false);
        new Transactions(pin_number).setVisible(true);
    }
    
    
    public static void main(String args[]) {
       new BalanceEnquiry("");
    }
}
