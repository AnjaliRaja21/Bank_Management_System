
package bank.management.system;



import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JOptionPane;


import java.awt.Font;
import java.awt.Color;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


import java.util.Random;


public class SignUp3 extends JFrame implements ActionListener{
    
    JRadioButton sav_button , fd_button , curr_button , rd_button;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit , cancel;
    String form_no;

    SignUp3(String form_no){
        
        this.form_no = form_no;
        
      setLayout(null);
        
      JLabel a_details = new JLabel("Page 3: Account Details");  
      a_details.setFont(new Font("Raleway" , Font.BOLD , 22));
      a_details.setBounds(280 , 40 , 400 , 40);
      add(a_details);
      
      
      JLabel a_type = new JLabel("Account Type");  
      a_type.setFont(new Font("Raleway" , Font.BOLD , 22));
      a_type.setBounds(100 , 140 , 200 , 30);
      add(a_type);
      
      
      sav_button = new JRadioButton("Saving Account");
      sav_button.setFont(new Font("Raleway" , Font.BOLD , 16));
      sav_button.setBackground(Color.WHITE);
      sav_button.setBounds(100, 180, 250, 20);
      add(sav_button);
      
      
      fd_button = new JRadioButton("Fixed Deposit Account");
      fd_button.setFont(new Font("Raleway" , Font.BOLD , 16));
      fd_button.setBackground(Color.WHITE);
      fd_button.setBounds(350, 180, 250, 20);
      add(fd_button);
      
      
      curr_button = new JRadioButton("Current Account");
      curr_button.setFont(new Font("Raleway" , Font.BOLD , 16));
      curr_button.setBackground(Color.WHITE);
      curr_button.setBounds(100, 220, 250, 20);
      add(curr_button);
      
      
      rd_button = new JRadioButton("Recurring Deposit Account");
      rd_button.setFont(new Font("Raleway" , Font.BOLD , 16));
      rd_button.setBackground(Color.WHITE);
      rd_button.setBounds(350, 220, 250, 20);
      add(rd_button);
      
      
      ButtonGroup accountbuttons = new ButtonGroup();
      accountbuttons.add(sav_button);
      accountbuttons.add(fd_button);
      accountbuttons.add(curr_button);
      accountbuttons.add(rd_button);
      
      
      JLabel card = new JLabel("Card Number");  
      card.setFont(new Font("Raleway" , Font.BOLD , 22));
      card.setBounds(100 , 300 , 200 , 30);
      add(card);
      
      
      JLabel number = new JLabel("XXXX-XXXX-XXXX-4184");  
      number.setFont(new Font("Raleway" , Font.BOLD , 22));
      number.setBounds(330 , 300 , 300 , 30);
      add(number);
      
      
      JLabel cardDetail = new JLabel("your 16 Digit Card Number");  
      cardDetail.setFont(new Font("Raleway" , Font.BOLD , 12));
      cardDetail.setBounds(100 , 330 , 300 , 20);
      add(cardDetail);
      
      
      JLabel pin = new JLabel("PIN:");  
      pin.setFont(new Font("Raleway" , Font.BOLD , 22));
      pin.setBounds(100 , 370 , 200 , 30);
      add(pin);
      
      
      JLabel pnumber = new JLabel("XXXX");  
      pnumber.setFont(new Font("Raleway" , Font.BOLD , 22));
      pnumber.setBounds(330 , 370 , 300 , 30);
      add(pnumber);
      
      JLabel pinDetail = new JLabel("your 4 Digit Password");  
      pinDetail.setFont(new Font("Raleway" , Font.BOLD , 12));
      pinDetail.setBounds(100 , 400 , 300 , 20);
      add(pinDetail);
      
      
      JLabel services = new JLabel("Services Required:");  
      services.setFont(new Font("Raleway" , Font.BOLD , 22));
      services.setBounds(100 , 450 , 400 , 30);
      add(services);
      
      
      
      c1 = new JCheckBox("  ATM CARD");
      c1.setBackground(Color.WHITE);
      c1.setFont(new Font("Raleway" , Font.BOLD ,16 ));
      c1.setBounds(100, 500, 200, 30);
      add(c1);
      
      
      c2 = new JCheckBox("  Internet Banking");
      c2.setBackground(Color.WHITE);
      c2.setFont(new Font("Raleway" , Font.BOLD ,16 ));
      c2.setBounds(350, 500, 200, 30);
      add(c2);

      
      c3 = new JCheckBox("  Mobile Banking");
      c3.setBackground(Color.WHITE);
      c3.setFont(new Font("Raleway" , Font.BOLD ,16 ));
      c3.setBounds(100, 550, 200, 30);
      add(c3);

      
      c4 = new JCheckBox("  Email & SMS Alerts");
      c4.setBackground(Color.WHITE);
      c4.setFont(new Font("Raleway" , Font.BOLD ,16 ));
      c4.setBounds(350, 550, 200, 30);
      add(c4);

      
      c5 = new JCheckBox("  Cheque Book");
      c5.setBackground(Color.WHITE);
      c5.setFont(new Font("Raleway" , Font.BOLD ,16 ));
      c5.setBounds(100, 600, 200, 30);
      add(c5);

      
      c6 = new JCheckBox("  E Statement");
      c6.setBackground(Color.WHITE);
      c6.setFont(new Font("Raleway" , Font.BOLD ,16 ));
      c6.setBounds(350, 600, 200, 30);
      add(c6);

      
      c7 = new JCheckBox("  I hereby declares that the above entered details are correct to the best of my knowledge");
      c7.setBackground(Color.WHITE);
      c7.setFont(new Font("Raleway" , Font.BOLD ,12 ));
      c7.setBounds(100, 680, 600, 30);
      add(c7);

      
      submit = new JButton("Submit");
      submit.setBackground(Color.BLACK);
      submit.setForeground(Color.WHITE);
      submit.setFont(new Font("Raleway" , Font.BOLD , 14));
      submit.setBounds(220,720,100,30);
      submit.addActionListener(this);
      add(submit);
      
      
      cancel = new JButton("Cancel");
      cancel.setBackground(Color.BLACK);
      cancel.setForeground(Color.WHITE);
      cancel.setFont(new Font("Raleway" , Font.BOLD , 14));
      cancel.setBounds(420,720,100,30);
      cancel.addActionListener(this);
      add(cancel);
      
        
      getContentPane().setBackground(Color.WHITE);
        
    setSize(850 , 820);
    setVisible(true);
    setLocation(350 , 0);
    }
    
//    override function for ActionListioner
    public void actionPerformed(ActionEvent ae){
        
       if(ae.getSource() == submit)
       {
         String accountType = null;
         
         if(sav_button.isSelected())
         {
             accountType = "Saving Account";
         }else if(fd_button.isSelected())
         {
             accountType = "Fixed Deposit Account";
         }else if(curr_button.isSelected())
         {
             accountType = "Current Account";
         }else if(rd_button.isSelected())
         {
             accountType = "Recurring Deposit Account";
         }
         
         
         Random random = new Random();
         String card_number = "" + Math.abs((random.nextLong() % 90000000L) + 5040936000000000L);
         
         String pin_number = "" + Math.abs((random.nextLong() % 9000L ) + 1000L);
         
         String facility = "";
         if(c1.isSelected())
         {
           facility = facility + " ATM Card";  
         }
         else if(c2.isSelected())
         {
             facility = facility + " Internet Banking";
         }
         else if(c3.isSelected())
         {
             facility = facility + " Mobile Banking";
         }
         else if(c4.isSelected())
         {
             facility = facility +" Email & SMS Alerts";
         }
         else if(c5.isSelected())
         {
             facility = facility + " Check Book";
         }
         else if(c6.isSelected())
         {
             facility = facility + " E-Statement";
         }
         
//         database handling me error ajata h isliye use handle bhi karte h

         try{
    
             if(accountType.equals("")){
                 JOptionPane.showMessageDialog(null , "Account Type is Required");
             }
             else 
             {
               Conn conn = new Conn();
               String query1 = "insert into signup3 values('"+form_no+"' , '"+accountType+"' , '"+card_number+"' , '"+pin_number+"' , '"+facility+"')";
               String query2 = "insert into login values('"+form_no+"' , '"+card_number+"' , '"+pin_number+"')";
               
               conn.s.executeUpdate(query1);
               conn.s.executeUpdate(query2);
               
               JOptionPane.showMessageDialog(null , "Card Number: " + card_number + "\n Pin: " + pin_number);
               
               
               setVisible(false);
               new Deposit(pin_number).setVisible(true);  //kyunki new account khola h to kuch pese daalne padenge 0 se ni khulega
             }
    
         }catch(Exception e){
            System.out.println(e);
         }
       }
       else if(ae.getSource() == cancel){
           
           setVisible(false);
           new Login().setVisible(true);
       } 
    }
    
    
    public static void main(String args[]) {
      new SignUp3("");
    }
}
