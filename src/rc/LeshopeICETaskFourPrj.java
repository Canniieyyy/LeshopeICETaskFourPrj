/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rc;

 // @author Leshope Kopano ST10459862
import javax.swing.JOptionPane;


 
public class LeshopeICETaskFourPrj {
    
 /* 
    Creation of objects other classes, so that attributes from 
    those classes can be used on this class
 */
        static Login objLogin = new Login();
        static Task objTask = new Task();
        static userRegistration objuserRegisration = new userRegistration();
        static leshopeTaskArrayPrj objleshopeTaskArrayPrj = new leshopeTaskArrayPrj ();
       
    public static void main(String[] args) {
       
//Declaring of variable to store name, surname and username
     
       objuserRegisration.userInput();
       objuserRegisration.userNameCreation( objuserRegisration.userName);
       objuserRegisration.passwordCreation( objuserRegisration.password);
      
//Login methods from the login class
        objLogin.checkUserName();
        objLogin.checkPasswordComplexity();
        objLogin.loginUser(objuserRegisration.userName,objuserRegisration.password);
   
//Calling user task editing methods from task class  
        //objTask.userSelection();
        //objTask.returnTotalHours();
        
//Calling of user task editing methods from  leshopeTaskArrayPrj class
        objleshopeTaskArrayPrj.taskCreation();
        
   boolean terminate = false;
        
       do{ //   //do-while loop so that the user will be able to go back to the main menu until the press quit
        
        int choose  =  Integer.parseInt(JOptionPane.showInputDialog(null,objleshopeTaskArrayPrj.taskChanges));
        
        switch(choose){ // switch-case for a numeric option for the user to select from
            case 1:
           objleshopeTaskArrayPrj.printTaskDone();
            System.out.println("Working 1");
            break;
            
            case 2:
          objleshopeTaskArrayPrj.printTaskMax();
            System.out.println("Working 2");
            break;
            case 3:
          objleshopeTaskArrayPrj.searchTask();
            System.out.println("Working 3");
            break;
            
            case 4:
          objleshopeTaskArrayPrj.printDeveloperTasks();
            System.out.println("Working 4");
            break;
            case 5:
          objleshopeTaskArrayPrj.deleteTask();    
            System.out.println("Working 5");
            break;
            case 6:
          objleshopeTaskArrayPrj.taskReport();
            System.out.println("Working 6");
            break;
            case 7:
                JOptionPane.showMessageDialog(null, "You are quiting. Thank you!");
                terminate = true;
            break;
                    
            default: 
                JOptionPane.showMessageDialog(null, "Sorry invalid option! please try again");  
            }
           }while(terminate == false);
       
        
   }
   
}

