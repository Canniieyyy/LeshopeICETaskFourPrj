/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

 // @author Leshope Kopano ST10459862

public class userRegistration {

//Creation of attributes
    
    public String name, surname, userName, password;
      
//Creation of a default constructor to set the default values for all attributes

    public userRegistration() {
        this.name = "";
        this.surname = "";
        this.userName = "";
        this.password = "";
    }
    
//Creation of getters that return the values for each attribute

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
    
//Creation of setters that assign values for each attribute

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
//Method for asking user for their input
    
   void userInput(){
     name = JOptionPane.showInputDialog(null,"Please Enter first name");
     surname = JOptionPane.showInputDialog(null,"Please Enter last name");
     JOptionPane.showMessageDialog(null,"Hello" + " " + name + " " + surname);
     userName = JOptionPane.showInputDialog(null,"Please create a username, please ensure that your username is no more than 5 charecters and consits of an underscore");
     password = JOptionPane.showInputDialog(null, "Please create a password, Please ensure that your username begins with one upppercase letter, followed by one lowercase letter, followed by any one number from 1 to 9, followed by any of these special charecters(!@#$%^&*)");
     }
     void userNameCreation( String username){
     
   
     while(!isValid(userName)|| userName.length()>5){ 
         userName = JOptionPane.showInputDialog(null,"Username is not correctly formatted,please ensure that your username is no more than 5 charecters and consits of an underscore");
     }
         JOptionPane.showMessageDialog(null,"Valid Username is:" + " " + userName);
     }
    
    
       void passwordCreation( String password){
         
      while(!isTrue(password) || password.length()> 8){
         
          password = JOptionPane.showInputDialog(null, "password is not correctly formatted, please ensure that your password is no more begins with one upppercase letter, followed by one lowercase letter, followed by any one number from 1 to 9, followed by any of these special charecters(!@#$%^&*)");
      }
          JOptionPane.showMessageDialog(null,"Valid password is:" + " " + password);
      }
        
    
    
//Method for matching username pattern    
    public static boolean isValid (String userName){
    
    Pattern p = Pattern.compile("_");
    Matcher m = p.matcher(userName);
    
    return m.find();
    
    }
    
//Method for matching if password pattern is within parameters
    
    
 public static boolean isTrue (String password){
    
    Pattern o = Pattern.compile("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$");
    Matcher n = o.matcher(password);
    
    return n.find();
    
    }
    
    
}
