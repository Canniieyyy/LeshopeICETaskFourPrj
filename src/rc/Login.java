/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;



 // @author Leshope Kopano ST10459862
 
public class Login {


    public String correctUserName;
    public String correctPassword;
    
//Creation of a default constructor to set the default values for all attributes

    public Login() {
       
        this.correctUserName = "";
        this.correctPassword = "";
    }
    
//Creation of getters that return the values for each attribute

    public String getCorreectUserName() {
        return correctUserName;
    }

    public String getCorrectPassword() {
        return correctPassword;
    }
    
    
//Creation of setters that assign values for each attribute


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
    
    Pattern p = Pattern.compile("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$");
    Matcher m = p.matcher(correctPassword);
    
    return m.find();
    
    }
      boolean checkUserName(){
         
        while(!isCorrect(correctUserName)|| correctUserName.length()>5){
         correctUserName = JOptionPane.showInputDialog(null,"Please type your registered username to verify");
     } return true;
        
       }
        


    boolean checkPasswordComplexity(){
        
      while (!isTrue(correctPassword)|| correctPassword.length()>8 ){
          correctPassword = JOptionPane.showInputDialog(null, "Please type your registered password to verify ");
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
       JOptionPane.showMessageDialog(null, "Welcome to EasyKhanban " +  userName);
         status = true; 
      }
       else{
          JOptionPane.showMessageDialog(null, "Username or password not valid please try again");
      }
      
   } while(status == false);
      return true;
  }
    
}    

    

