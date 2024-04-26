/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rc;

import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class Task {
    static Login objLogin = new Login();
    
   private String taskN, taskID, taskDescription, taskNo,haveToDo,done,inProgress ;
   private String [] userOptions = {"Add Tasks", "Show Report", "Quit"};
   private int taskDuration;
   
   
   
//Creation of a default constructor to set the default values for all attributes

    public Task() {
        this.taskN = "";
        this.taskID = "";
        this.taskDescription = "";
        this.taskNo = "";
        this.taskDuration = 0;
        this.haveToDo = "";
        this.done = "";
        this.inProgress = "";
        
    }
    
//Creation of getters that return the values for each attribute

    public String getTaskN() {
        return taskN;
    }

    public String getTaskID() {
        return taskID;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public String[] getUserOptions() {
        return userOptions;
    }

    public String getTaskNo() {
        return taskNo;
    }

    public int getTaskDuration() {
        return taskDuration;
    }

    public String getHaveToDo() {
        return haveToDo;
    }

    public String getDone() {
        return done;
    }

    public String getInProgress() {
        return inProgress;
    }
    
    
    
    
    
// Creation of setters that assign values for each attribute

    public void setTaskN(String taskN) {
        this.taskN = taskN;
    }

    public void setTaskID(String taskID) {
        this.taskID = taskID;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public void setUserOptions(String[] userOptions) {
        this.userOptions = userOptions;
    }

    public void setTaskNo(String taskNo) {
        this.taskNo = taskNo;
    }

    public void setTaskDuration(int taskDuration) {
        this.taskDuration = taskDuration;
    }

    public void setHaveToDo(String haveToDo) {
        this.haveToDo = haveToDo;
    }

    public void setDone(String done) {
        this.done = done;
    }

    public void setInProgress(String inProgress) {
        this.inProgress = inProgress;
    }
    
    
    
    
    
// Creating a Methods so that users can add and specify tasks
    
    public void userSelection(){
        String [] statusOptions = {"To Do","Done","Doing"};
        
        
        boolean end = false;
       do{
     var select = JOptionPane.showOptionDialog(null, "Please select one of the options", "EasyKhanban", 
                                                      JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, getUserOptions(),0  );
     if (select == 0 ){
       taskN = JOptionPane.showInputDialog(null,"Add Task Name");
       
       taskNo = ( JOptionPane.showInputDialog(null,"Add Task Number"));
       
       taskDescription = JOptionPane.showInputDialog(null,"Add task description, this should be under 50 characters in length");
       
       taskDuration = Integer.parseInt( JOptionPane.showInputDialog(null,"What is the estimated duration of the task"));
       
       var taskStatus = JOptionPane.showOptionDialog(null, "Please select one of the options", "Status", 
                                                      JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, statusOptions,0  );
       
       if (taskStatus == 0){
         haveToDo =  JOptionPane.showInputDialog(null, "Type: to do");
       }
       
       if (taskStatus ==1){
          done = JOptionPane.showInputDialog(null, "Type: Done!");
       }
       
       if (taskStatus ==2){
           inProgress = JOptionPane.showInputDialog(null, "In progress...");
       }
       
       JOptionPane.showMessageDialog(null ,objLogin.firstName + " " + objLogin.lastName);
    }
    
    if (select == 1){
        JOptionPane.showInputDialog(null, "Coming soon!");
    }
   
    if (select == 2){
        JOptionPane.showMessageDialog(null, "You are quiting");
        end = true;
    }
    
       } while (end == false);
   
   
    }
    
//Creating a method of counting the lenght of the task discription
    
   boolean checkTaskDescription(){
       int charLength = taskDescription.length();
       
       return true;
   }
   
//Creating a method for compiling and structuring a task identity 
   String createTaskID(){
       
       char lastN = objLogin.firstName.charAt( objLogin.firstName.length() - 1 );
       char secondLastN = objLogin.firstName.charAt( objLogin.firstName.length() - 2 );
       char thirdLastN = objLogin.firstName.charAt( objLogin.firstName.length() - 3 );
       
       char lastTN = taskN.charAt( taskN.length() - 1 );
       char secondLastTN = taskN.charAt( taskN.length() - 2 );
       
       char lastTNo = taskNo.charAt( taskNo.length() - 1 );
       char secondLastTNo = taskNo.charAt( taskNo.length() - 2 );
       
     String taskID =lastTN + secondLastTN + ":" + lastTNo + secondLastTNo + ":" + lastN + secondLastN + thirdLastN ;
      
      return taskID;
   }
   
   //Creating a method for displaying the all the task details
   Object []  printTaskDetails(){
     Object[] taskDetail = new Object[7];
     taskDetail[0] = "Task Status:"+ " " + done ;
     taskDetail[1] = "developerDeatils";
     taskDetail[2] = "Task Number:" + " " + taskNo;
     taskDetail[3] = "Task Name:" + " " + taskN;
     taskDetail[4] = "Task Description:" + " " + taskDescription;
     taskDetail[5] = "Task ID:" + " " + taskID;
     taskDetail[6] = "Task Duration:" + " " + taskDuration;
      
     JOptionPane.showMessageDialog(null, taskDetail);
      return taskDetail;
   }
}
//{,"developerDeatils"}