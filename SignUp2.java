
package bank.management.system;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
//import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;

import java.awt.Color;
import java.awt.Font;

//import com.toedter.calendar.JDateChooser; //vedio ke discription se download kiya

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;


public class SignUp2 extends JFrame implements ActionListener{    //implement karre h interface isliye iska override function bhi banayenge neache

    JTextField PAN,adhar;
    JRadioButton s_yes , s_no ,ea_yes , ea_no ;
    JButton next;
    JComboBox religion,category,income,education,occupation;
    String form_no;
    
    

SignUp2(String form_no){
    
    this.form_no =  form_no;

    setLayout(null);
 
    setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
    
    
    JLabel additionalDetail = new JLabel("Page 2: Additional Details");  
    additionalDetail.setFont(new Font("Raleway" , Font.BOLD , 22));
    additionalDetail.setBounds(290 , 50 , 400 , 30);
    add(additionalDetail); 

    
    
    JLabel rel = new JLabel("Religion:");  
    rel.setFont(new Font("Raleway" , Font.BOLD , 20));
    rel.setBounds(100 , 140 , 100 , 30);
    add(rel); 
//    JComboBox religion = new JComboBox(["Hindu" , "Muslim" , "Sikh" , "Christian" , "others"]);  
//array of string pass karni padti lekin isse error ara to method 2
    String religionVal[] = {"Hindu" , "Muslim" , "Sikh" , "Christian" , "others"};
//    JComboBox 
            religion = new JComboBox(religionVal);
    religion.setBounds(300 , 140 , 400 , 30);
    religion.setBackground(Color.WHITE);
    add(religion);
    
    
    

    JLabel cat = new JLabel("Category:");  
    cat.setFont(new Font("Raleway" , Font.BOLD , 20));
    cat.setBounds(100 , 190 , 200 , 30);
    add(cat);
  
    String categoryVal[] = {"General" , "OBc" , "SC" , "ST" , "others"};
//    JComboBox 
            category = new JComboBox(categoryVal);
    category.setBounds(300 , 190 , 400 , 30);
    category.setBackground(Color.WHITE);
    add(category);
    

    

    JLabel incm = new JLabel("Income:");  
    incm.setFont(new Font("Raleway" , Font.BOLD , 20));
    incm.setBounds(100 , 240 , 200 , 30);
    add(incm);

    String incomeVal[] = {"Null" , "< 1,50,000 " , "< 2,50,000 " , "< 5,00,000" , "Upto 10,00,000"};
//    JComboBox
            income = new JComboBox(incomeVal);
    income.setBounds(300 , 240 , 400 , 30);
    income.setBackground(Color.WHITE);
    add(income);
    
   
    

    JLabel edu = new JLabel("Educational");  
    edu.setFont(new Font("Raleway" , Font.BOLD , 20));
    edu.setBounds(100 , 290 , 200 , 30);
    add(edu);
    JLabel qual = new JLabel("Qualification:");  
    qual.setFont(new Font("Raleway" , Font.BOLD , 20));
    qual.setBounds(100 , 315 , 200 , 30);
    add(qual);

    String educationalVal[] = {"Non Graduate" , "Graduation " , "Post Graduation " , "Doctrate" , "others"};
//    JComboBox 
            education = new JComboBox(educationalVal);
    education.setBounds(300 , 315 , 400 , 30);
    education.setBackground(Color.WHITE);
    add(education);

    
    

    JLabel occu = new JLabel("Occupation:");  
    occu.setFont(new Font("Raleway" , Font.BOLD , 20));
    occu.setBounds(100 , 390 , 200 , 30);
    add(occu);

    String occuVal[] = {"Salaried" , "Self Employed" , "Bussiness" , "Student" , "Retired" , "others"};
//    JComboBox 
            occupation = new JComboBox(occuVal);
    occupation.setBounds(300 , 390 , 400 , 30);
    occupation.setBackground(Color.WHITE);
    add(occupation);
   
    


    JLabel pan = new JLabel("PAN Number:");  
    pan.setFont(new Font("Raleway" , Font.BOLD , 20));
    pan.setBounds(100 , 440 , 200 , 30);
    add(pan);

    PAN = new JTextField();
    PAN.setFont(new Font("Raleway" , Font.BOLD , 14));
    PAN.setBounds(300 , 440 , 400 , 30);
    add(PAN);

    
    

     JLabel a_no = new JLabel("Adhar Number:");  
    a_no.setFont(new Font("Raleway" , Font.BOLD , 20));
    a_no.setBounds(100 , 490 , 200 , 30);
    add(a_no);

    adhar = new JTextField();
    adhar.setFont(new Font("Raleway" , Font.BOLD , 14));
    adhar.setBounds(300 , 490 , 400 , 30);
    add(adhar);


    
    
    JLabel scitizen = new JLabel("Senior Citizen:");  
    scitizen.setFont(new Font("Raleway" , Font.BOLD , 20));
    scitizen.setBounds(100 , 540 , 200 , 30);
    add(scitizen);
//    JRadioButton 
            s_yes = new JRadioButton("Yes");
    s_yes.setBounds(300 , 540 , 100 , 30);
    s_yes.setBackground(Color.WHITE);
    add(s_yes);
//    JRadioButton 
            s_no = new JRadioButton("No");
    s_no.setBounds(450 , 540 , 100 , 30);
    s_no.setBackground(Color.WHITE);
    add(s_no);
 
    ButtonGroup s_button = new ButtonGroup();  //taaki ek hi option choose ho
    s_button.add(s_yes);
    s_button.add(s_no);
   

    JLabel pincode = new JLabel("Existing Account:");  
    pincode.setFont(new Font("Raleway" , Font.BOLD , 20));
    pincode.setBounds(100 , 590 , 200 , 30);
    add(pincode);

            ea_yes = new JRadioButton("Yes");
    ea_yes.setBounds(300 , 590 , 100 , 30);
    ea_yes.setBackground(Color.WHITE);
    add(ea_yes);
//    JRadioButton 
            ea_no = new JRadioButton("No");
    ea_no.setBounds(450 , 590 , 100 , 30);
    ea_no.setBackground(Color.WHITE);
    add(ea_no);
 
    ButtonGroup ea_button = new ButtonGroup();  //taaki ek hi option choose ho
    ea_button.add(ea_yes);
    ea_button.add(ea_no);
    

    
//    JButton 
            next = new JButton("Next");
    next.setBackground(Color.BLACK);
    next.setForeground(Color.WHITE);
    next.setFont(new Font("Raleway" , Font.BOLD , 14));
    next.setBounds(620 , 660 , 80 , 30);
    next.addActionListener(this);  //kis button ke click par option chahiye
    add(next);

    getContentPane().setBackground(Color.WHITE);


    setSize(850 , 800);
    setVisible(true);
    setLocation(350 , 10);

}

public void actionPerformed(ActionEvent ae){
     
    String sreligion = (String) religion.getSelectedItem();   //kyunki ye ek object ko return karta h isliye string me convert kiya type cast se
    String scategory = (String) category.getSelectedItem();
    String sincome =  (String) income.getSelectedItem();
    String seducation =  (String) education.getSelectedItem();
    String soccupation =  (String) occupation.getSelectedItem();
    String span = PAN.getText();
    String sadhar = adhar.getText();
    
    
    String scitizen = null;
 
    if(s_yes.isSelected()){
        scitizen = "Yes";
    }else if(s_no.isSelected()){
        scitizen = "No";
    }
    
    
    String eaccount = null;
 
    if(ea_yes.isSelected()){
        eaccount = "Yes";
    }else if(s_no.isSelected()){
        eaccount = "No";
    }
    
    
//    kyunki database external entity h to try catch(Exceptional handlling)

try{
    if(religion.equals("")){
        JOptionPane.showMessageDialog(null , "Name is Required");
    }else{
// abb hume ek database me call maarni , abb database me call maarne se pahle hume mysql ke sath connection establish bhi to karna padega
// connection establish ke baad me mysql ke querry ko run kar sakta hoon
//connection establish
   Conn c = new Conn();
   String query = "insert into signup2 values('" + form_no +"' , '" + sreligion +"' , '" + scategory +"' , '" + sincome +"' , '" + seducation +"' , '" + soccupation +"' , '"+ span +"' , '" + sadhar +"' , '" + scitizen +"' , '" + eaccount +"' )";
   c.s.executeUpdate(query);   //executing mysql query


    //signup3
     setVisible(false);
     new SignUp3(form_no).setVisible(true);
    }
    
   
}catch(Exception e){
    
    System.out.println(e);
}
}


    public static void main(String args[]){
        new SignUp2("");  //error ata agar "" nahi lagate to kyunki fir vo default constructor nhii rahta
    }
}
