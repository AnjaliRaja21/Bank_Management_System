
package bank.management.system;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;

import com.toedter.calendar.JDateChooser; //vedio ke discription se download kiya

import java.util.Random;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class SignUp1 extends JFrame implements ActionListener{    //implement karre h interface isliye iska override function bhi banayenge neache

    String num;
    JTextField  nameTextField , fnameTextField, emailTextField , addressTextField , cityTextField , stateTextField , pincodeTextField;
    JDateChooser datechooser;
    JRadioButton male , female , married ,unmarried , other;
    JButton next;
    
    

SignUp1(){

    setLayout(null);
 
    Random ran = new Random();          //random class util package se aatti h
     num = "" + (Math.abs((ran.nextInt() % 9000L) + 1000L));        //Math.abs no. ko positive karega

    JLabel formNo = new JLabel("APPLICATION FORM NO.  "+ num);  
    formNo.setFont(new Font("Raleway" , Font.BOLD , 38));
    formNo.setBounds(140 , 20 , 600 , 40);
    add(formNo); 


    JLabel personalDetail = new JLabel("Page 1: Personal Details");  
    personalDetail.setFont(new Font("Raleway" , Font.BOLD , 22));
    personalDetail.setBounds(290 , 80 , 400 , 30);
    add(personalDetail); 


    JLabel name = new JLabel("Name:");  
    name.setFont(new Font("Raleway" , Font.BOLD , 20));
    name.setBounds(100 , 140 , 100 , 30);
    add(name); 


    nameTextField = new JTextField();
    nameTextField.setFont(new Font("Raleway" , Font.BOLD , 14));
    nameTextField.setBounds(300 , 140 , 400 , 30);
    add(nameTextField);


    JLabel fname = new JLabel("Father's Name:");  
    fname.setFont(new Font("Raleway" , Font.BOLD , 20));
    fname.setBounds(100 , 190 , 200 , 30);
    add(fname); 


    fnameTextField = new JTextField();
    fnameTextField.setFont(new Font("Raleway" , Font.BOLD , 14));
    fnameTextField.setBounds(300 , 190 , 400 , 30);
    add(fnameTextField);


    JLabel dob = new JLabel("Date Of Birth:");  
    dob.setFont(new Font("Raleway" , Font.BOLD , 20));
    dob.setBounds(100 , 240 , 200 , 30);
    add(dob);


//    JDateChooser
    datechooser = new JDateChooser();        //ye humne vedio ke description se download kiya
    datechooser.setBounds(300, 240, 400, 30);
    datechooser.setForeground(Color.BLACK);
    add(datechooser);


    JLabel gender = new JLabel("Gender:");  
    gender.setFont(new Font("Raleway" , Font.BOLD , 20));
    gender.setBounds(100 , 290 , 200 , 30);
    add(gender);


//    JRadioButton 
            male = new JRadioButton("Male");
    male.setBounds(300 , 290 , 120 , 30);
    male.setBackground(Color.WHITE);
    add(male);
    
    
//    JRadioButton
            female = new JRadioButton("Female");
    female.setBounds(450 , 290 , 120 , 30);
    female.setBackground(Color.WHITE);
    add(female);
    
    ButtonGroup gendergroup = new ButtonGroup();  //taaki ek hi option choose ho
    gendergroup.add(male);
    gendergroup.add(female);


    JLabel email = new JLabel("Email Address:");  
    email.setFont(new Font("Raleway" , Font.BOLD , 20));
    email.setBounds(100 , 340 , 200 , 30);
    add(email);


    emailTextField = new JTextField();
    emailTextField.setFont(new Font("Raleway" , Font.BOLD , 14));
    emailTextField.setBounds(300 , 340 , 400 , 30);
    add(emailTextField);


    JLabel mstatus = new JLabel("Merital Status:");  
    mstatus.setFont(new Font("Raleway" , Font.BOLD , 20));
    mstatus.setBounds(100 , 390 , 200 , 30);
    add(mstatus);


//    JRadioButton 
            married = new JRadioButton("Married");
    married.setBounds(300 , 390 , 100 , 30);
    married.setBackground(Color.WHITE);
    add(married);
    
    
//    JRadioButton 
            unmarried = new JRadioButton("Unmarried");
    unmarried.setBounds(450 , 390 , 100 , 30);
    unmarried.setBackground(Color.WHITE);
    add(unmarried);
    
//    JRadioButton 
            other = new JRadioButton("Other");
    other.setBounds(600 , 390 , 100 , 30);
    other.setBackground(Color.WHITE);
    add(other);
    
    ButtonGroup maritalgroup = new ButtonGroup();  //taaki ek hi option choose ho
    maritalgroup.add(married);
    maritalgroup.add(unmarried);
    maritalgroup.add(other);


    JLabel address = new JLabel("Address:");  
    address.setFont(new Font("Raleway" , Font.BOLD , 20));
    address.setBounds(100 , 440 , 200 , 30);
    add(address);


    addressTextField = new JTextField();
    addressTextField.setFont(new Font("Raleway" , Font.BOLD , 14));
    addressTextField.setBounds(300 , 440 , 400 , 30);
    add(addressTextField);


     JLabel city = new JLabel("City:");  
    city.setFont(new Font("Raleway" , Font.BOLD , 20));
    city.setBounds(100 , 490 , 200 , 30);
    add(city);


    cityTextField = new JTextField();
    cityTextField.setFont(new Font("Raleway" , Font.BOLD , 14));
    cityTextField.setBounds(300 , 490 , 400 , 30);
    add(cityTextField);


    JLabel state = new JLabel("State:");  
    state.setFont(new Font("Raleway" , Font.BOLD , 20));
    state.setBounds(100 , 540 , 200 , 30);
    add(state);


    stateTextField = new JTextField();
    stateTextField.setFont(new Font("Raleway" , Font.BOLD , 14));
    stateTextField.setBounds(300 , 540 , 400 , 30);
    add(stateTextField);


    JLabel pincode = new JLabel("Pin Code:");  
    pincode.setFont(new Font("Raleway" , Font.BOLD , 20));
    pincode.setBounds(100 , 590 , 200 , 30);
    add(pincode);


    pincodeTextField = new JTextField();
    pincodeTextField.setFont(new Font("Raleway" , Font.BOLD , 14));
    pincodeTextField.setBounds(300 , 590 , 400 , 30);
    add(pincodeTextField);
    
    
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
    
    String form_No =  num ;   
    String name = nameTextField.getText();  //setText se set kar sakte h and getText mese nikaal sakte h
    String fname = fnameTextField.getText();
    String dob = ((JTextField)datechooser.getDateEditor().getUiComponent()).getText();
    String gender = null;
 
    if(male.isSelected()){
        gender = "Male";
    }else if(female.isSelected()){
        gender = "Female";
    }
    
    String email = emailTextField.getText();
    String marital = null;
    
    if(married.isSelected()){
        marital = "Married";
    }else if(unmarried.isSelected()){
        marital = "Unmarried";
    }else if(other.isSelected()){
        marital = "Other";
    }
    
    String address = addressTextField.getText();
    String city = cityTextField.getText();
    String state = stateTextField.getText();
    String pin = pincodeTextField.getText();
    
//    kyunki database external entity h to try catch(Exceptional handlling)

try{
    if(name.equals("")){
        JOptionPane.showMessageDialog(null , "Name is Required");
    }else{
// abb hume ek database me call maarni , abb database me call maarne se pahle hume mysql ke sath connection establish bhi to karna padega
// connection establish ke baad me mysql ke querry ko run kar sakta hoon
//connection establish
Conn c = new Conn();
String query = "insert into signup values('" + form_No +"' , '" + name +"' , '" + fname +"' , '" + dob +"' , '" + gender +"' , '" + email +"' , '"+ address +"' , '" + city +"' , '" + state +"' , '" + pin +"' )";
c.s.executeUpdate(query);   //executing mysql query


setVisible(false);
new SignUp2(form_No).setVisible(true);

    }
    
   
}catch(Exception e){
    
    System.out.println(e);
}
}


    public static void main(String args[]){
        new SignUp1();
    }
}
