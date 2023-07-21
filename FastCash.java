
package bank.management.system;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;


import java.awt.Font;
import java.awt.Color;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


import java.sql.ResultSet;


import java.util.Date;  // isko hume date hi likhna padta kyunki ye sql me bhi h or util me bhi to star lagane se error ayega kyunki compiler confuse hoga



public class FastCash extends JFrame implements ActionListener{

//    constructure me sara code isliye likhte h kyunki jese hi hum object banaye class ka vese hi hume frmae mil jaaye
//    class ka object banate hi cunstructure call hota h
    
    JButton hundred , fiveHundred , thousand , twoThousand , fiveThousand , tenThousand ,back;
    String pin_no;
    
    
    FastCash(String pin_no){
        
        
        this.pin_no = pin_no;
      setLayout(null);
        
     
      ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("icons/ATM.jpg"));
      Image img2 = img1.getImage().getScaledInstance(900 , 900 ,Image.SCALE_DEFAULT); //object of an image
      ImageIcon img3 = new ImageIcon(img2);  //converting image into imageicon  kyunki hum img2 ko label ke andar pass ni kar sakte error ayega

      JLabel image = new JLabel(img3);
      image.setBounds(0 , 0 , 900 , 900);   //fixing location of image with the help of layout
      add(image); 
      
      
      JLabel text = new JLabel("SELECT WITHDRAWL AMOUNT");
      text.setBounds(230 , 340 ,700 , 35);
      text.setForeground(Color.WHITE);
      text.setFont(new Font("System" , Font.BOLD , 16));
      image.add(text);
      
      
//      JButton 
              hundred = new JButton("Rs 100");
      hundred.setBounds(208 , 415 ,130 , 30);
      hundred.addActionListener(this);
      image.add(hundred);
      
      
//       JButton 
               fiveHundred = new JButton("Rs 500");
      fiveHundred.setBounds(353 , 415 ,130 , 30);
      fiveHundred.addActionListener(this);
      image.add(fiveHundred);
      
      
//       JButton
               thousand = new JButton("Rs 1000");
      thousand.setBounds(208 , 454 ,130 , 30);
      thousand.addActionListener(this);
      image.add(thousand);
      
      
//      JButton 
              twoThousand = new JButton("Rs 2000");
      twoThousand.setBounds(353 , 454 ,130 , 30);
      twoThousand.addActionListener(this);
      image.add(twoThousand);
      
      
//      JButton 
              fiveThousand = new JButton("Rs 5000");
      fiveThousand.setBounds(208 , 492 ,130 , 30);
      fiveThousand.addActionListener(this);
      image.add(fiveThousand);
      
      
//     JButton
             tenThousand = new JButton("Rs 10000");
     tenThousand.setBounds(353 , 492 ,130 , 30);
     tenThousand.addActionListener(this);
     image.add(tenThousand);
      
      
      
//     JButton 
             back = new JButton("Back");
     back.setBounds(353 , 530 ,130 , 30);
     back.addActionListener(this);
     image.add(back);
        
        
    setSize(900 , 900);
    setLocation(300 , 0);
    setUndecorated(true); // ye frame ke upar vala title part hata dega
    setVisible(true); // isko humesha neache hi rakhte h
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource() == back)
        {
         setVisible(false);
         new Transactions(pin_no).setVisible(true);
        }
        else
        {
//          String amount = ae.getSource();            isse button ka access ata h ki button ka source kyaa h                                                    
//            String amount = (JButton)ae.getSource();            abb ye hume object return karega to hume type cast karna padega jButton me
//            abb iska text uthayenge fir aage ka Rs hatane ke liye substring lelenge
            
            String amount =((JButton)ae.getSource()).getText().substring(3);
            Conn conn = new Conn();
            
            try{
                
                ResultSet rs = conn.s.executeQuery("Select * from bank where pin = '" +pin_no+ "'");
                int balance = 0;
                
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
                
                if(ae.getSource() != back && balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null, "Insufficient balance");
                    return;
                }
                
                
                Date date = new Date();
                String query = "Insert into bank values('"+ pin_no +"' , '"+ date +"' ,' Withdrawl ', '"+ amount +"' )";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Debited Sucessfully");
                
                setVisible(false);
                new Transactions(pin_no).setVisible(true);
                
            }catch(Exception e)
            {
                System.out.println(e);
            }
            
            
        }
        
    }
    
    public static void main(String args[]) {
       
        new FastCash("");
    }
}
