
package bank.management.system;

import java.sql.*;

public class Conn {
    
    Connection c;          //connection class ka ek objct banaya
    Statement s;

    public Conn(){
        
//   isme try and catch (exceptional handlling) ka use karenge kyunki mysql ek external entity h to vo runtime error (compile error ni) de sakti h

try{
    
//    isme error ayega pahle to iski library ko import karana padega lecture ke description me h
//    Class.forName(com.mysql.cj.jdbc.Driver);   //sabse pahle driver ko register karna h uske liye Class name ki Class hoti h usme static method hota h forName iske andar hum apna class ka name likhenge (Driver ka name);
 //upar vali line ko comment out kardiya kyunki abb ye library me add kardiya to khudse pick hojayegi   
//    step 1 = create connection;

//c = DriverManager.getConnection("jdbc:mysql://localhost:3306");    bydefault mysql localhost 3306 par hi chalta h islie apko likhne ki jarurat ni h

c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem" , "root" , "Anjali@123");   // name of created mysql database ,username of mysql , password

//  step 2 = create statement

s = c.createStatement();
    
    
}catch(Exception e){
    
    System.out.println(e);                        //error ko print kara liya
    
}
    }
}
