
package bank.management.system;


import javax.swing.JFrame;
import javax.swing.JLabel;


import java.awt.Color;


import java.sql.ResultSet;


public class MiniStatement extends JFrame{

    MiniStatement(String pin_number){
        
        setTitle("Mini Statement");
        
        setLayout(null);
        
        
        JLabel mini = new JLabel();
        add(mini);
        
        
        JLabel bank = new JLabel("SBI Bank");
        bank.setBounds(150,20,100,20);
        add(bank);
        
        
        JLabel card = new JLabel();
        card.setBounds(20,80,300,20);
        add(card);
        
        
        JLabel balance = new JLabel();
        balance.setBounds(20,400,300,20);
        add(balance);
        
        
        try{
            
           Conn conn = new Conn();
           ResultSet rs = conn.s.executeQuery("select * from login where pin = '"+ pin_number +"'");
           
           while(rs.next())
           {
               card.setText("Card Number: " + rs.getString("card_number").substring(0,4)+"XXXXXXXX"+rs.getString("card_number").substring(12));
               
           } 
        }catch (Exception e)
        {
          System.out.println(e);
        }
        
        try{
            
            Conn conn = new Conn();
            int bal = 0;
            ResultSet rs = conn.s.executeQuery("select * from bank where pin = '"+ pin_number +"'");
            
            while(rs.next()){
                mini.setText(mini.getText() + "<html>" + rs.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount") + "<br><br><html>");
                
                 if(rs.getString("type").equals("Deposit"))  
                  {
                      bal += Integer.valueOf(rs.getString("amount"));
                  }
                  else
                  {
                      bal -= Integer.parseInt(rs.getString("amount"));
                  }
            }
            balance.setText("Your current account balance is Rs " + bal );
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        
        mini.setBounds(20, 140, 400, 200);
        
        setSize(400 , 600);
        setLocation(20 , 20);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);                                                                                            // isko humesha neache hi rakhte h
    }
    
   
    public static void main(String args[])
    {
      new MiniStatement("");
    }
}
