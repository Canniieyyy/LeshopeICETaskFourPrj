/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class Login {//Create attributes for user details
    
    public String firstName;
    public String lastName;
    public String correctUserName;
    public String correctPassword;
    
//Creation of a default constructor to set the default values for all attributes

    public Login() {
        this.firstName = "";
        this.lastName = "";
        this.correctUserName = "";
        this.correctPassword = "";
    }
    
//Creation of getters that return the values for each attribute

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCorreectUserName() {
        return correctUserName;
    }

    public String getCorrectPassword() {
        return correctPassword;
    }
    
    
//Creation of setters that assign values for each attribute

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUserName(String correctUserName) {
        this.correctUserName = correctUserName;
    }

    public void setPassword(String correctPassword) {
        this.correctPassword = correctPassword;
    }
    
 
    
    
    
//Method(s) for checking complexibility for username and password 
    
    boolean isCorrect (String correctUserName){
    
    Pattern w = Pattern.compile("_");
    Matcher q = w.matcher(correctUserName);
    
    return q.find();
    
    }
   
     boolean isTrue (String correctPassword){
    
    Pattern p = Pattern.compile("([A-Z])([a-z])([1-9])([!@#$%^&*])");
    Matcher m = p.matcher(correctPassword);
    
    return m.find();
    
    }
      boolean checkUserName(){
         
        while(!isCorrect(correctUserName)){
          JOptionPane.showMessageDialog(null,"Now type your registered username again to verify");
         correctUserName = JOptionPane.showInputDialog(null,"Please type your registered username");
        
         
     }
     
        
        return true;
        
       }
        


    boolean checkPasswordComplexity(){
        
      while (!isTrue(correctPassword) ){
          JOptionPane.showMessageDialog(null,"Now type your registered password again to verify");
          correctPassword = JOptionPane.showInputDialog(null, "Please type your registered password ");
          
          
      }
     
      return true;
   }
    
/*Method(s) for checking if username and password corrisponds 
with the registerd input
*/
    
     boolean loginUser( String userName, String password){
        
    boolean status = false;
  
      JOptionPane.showMessageDialog(null, "Hello Please Login");
      do{
          
       correctUserName = JOptionPane.showInputDialog("Please enter your login Username");
       correctPassword = JOptionPane.showInputDialog("Please enter your login password");
    
      
      
      if(correctUserName.equals(userName)&& correctPassword.equals(password)){
        JOptionPane.showMessageDialog(null, "Welcome back" + " " + userName);
         status = true; 
      }
      
      
      else{
          JOptionPane.showMessageDialog(null, "Username or password not valid please try again");
      }
      
   } while(status == false);
      return true;
  }
    
}    

    

