/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rc;


import javax.swing.JOptionPane;


 
 // @author Leshope Kopano ST10459862
 
public class Task {
    
//Creation of attributes
    
   private String taskN, taskID, taskDescription, taskNo, taskOutcome, developerDetails, lastTN, lastTaskNo, developerName ;
   private String [] userOptions = { "Choose one of the following from the menu by typing the number of your option:", "1)Add Tasks", "2)Show Report", "3)Quit"};
   public int taskDuration, numOfTasks, i;
   private char lastDName, lastDName2, lastDName3 ;
   
//Creation of a default constructor to set the default values for all attributes

    public Task() {
        this.taskN = "";
        this.taskID = "";
        this.taskDescription = "";
        this.taskNo = "";
        this.taskDuration = 0;
        this.taskOutcome = "";
        this.developerDetails = "";
        this.numOfTasks = 0 ;
        this.i = 0;
        this.lastTN = "";
        this.lastTaskNo = "";
        this.developerName = "";
        this.lastDName = 'C';
        this.lastDName2 = 'C';
        this.lastDName3 = 'C';
         
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

    public String getTaskOutcome() {
        return taskOutcome;
    }

    public String getDeveloperDetails() {
        return developerDetails;
    }

    public int getNumOfTasks() {
        return numOfTasks;
    }

    public int getI() {
        return i;
    }

    public String getLastTN() {
        return lastTN;
    }

    public String getLastTaskNo() {
        return lastTaskNo;
    }

    public char getLastDName() {
        return lastDName;
    }

    public char getLastDName2() {
        return lastDName2;
    }

    public char getLastDName3() {
        return lastDName3;
    }
    
    public String getDeveloperName() {
        return developerName;
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

    public void setTaskOutcome(String taskOutcome) {
        this.taskOutcome = taskOutcome;
    }

    public void setDeveloperDetails(String developerDetails) {
        this.developerDetails = developerDetails;
    }

    public void setNumOfTasks(int numOfTasks) {
        this.numOfTasks = numOfTasks;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void setLastTaskNo(String lastTaskNo) {
        this.lastTaskNo = lastTaskNo;
    }

    public void setLastDName(char lastDName) {
        this.lastDName = lastDName;
    }

    public void setLastDName2(char lastDName2) {
        this.lastDName2 = lastDName2;
    }

    public void setLastDName3(char lastDName3) {
        this.lastDName3 = lastDName3;
    }
    
    public void setLastTN(String lastTN) {
        this.lastTN = lastTN;
    }

    public void setDeveloperName(String developerName) {
        this.developerName = developerName;
    }
 
// Creating a Methods so that users can add and specify tasks
    
    public void userSelection(){
        String [] statusOptions = {"To Do","Done","Doing"};
        
        
        boolean end = false;
        
       do{                  //do-while loop so that the user will be able to go back to the main menu until the press quit
           
            int select = Integer.parseInt(JOptionPane.showInputDialog(null,  userOptions ));
     
     if (select == 1 ){
         
       numOfTasks = Integer.parseInt(JOptionPane.showInputDialog(null,"How many tasks are you going to add? there should be no morethan two tasks."));
       
     for( i = 0 ;i< numOfTasks ; i++){
         
       taskN = JOptionPane.showInputDialog(null,"Add Task Name");
       
       taskNo = ( JOptionPane.showInputDialog(null,"Add Task Number"));
       
       taskDescription = JOptionPane.showInputDialog(null,"Please enter a task description of less than 50 charecters");
       
                        checkTaskDescription();
                        
                       JOptionPane.showMessageDialog(null, "Task successfully captured!");
            
       developerName = JOptionPane.showInputDialog(null,"Please enter your name");
       
       taskDuration = Integer.parseInt( JOptionPane.showInputDialog(null,"What is the estimated duration of the task in hours"));
      
       var taskStatus = JOptionPane.showOptionDialog(null, "Please select one of the options", "Status", 
                                                      JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, statusOptions,0  );
     
      switch(taskStatus){
          case 0:
             taskOutcome = "ToDo";
          break;
           
          case 1:
              taskOutcome = "Done!";
          break;
          
          case 2:
              taskOutcome = "In progress...";
          break;
          
          default:
              JOptionPane.showMessageDialog(null, "Option is not found, please try again");
      }
            printTaskDetails();      
    }
  }   
    
    if (select == 2){
        JOptionPane.showMessageDialog(null, "Coming soon!");
    }
   
    if (select == 3){
        JOptionPane.showMessageDialog(null, "You are quiting");
        end = true;
    }
    
       } while (end == false);
   
    }
    
//Creating a method of counting the lenght of the task discription
    
   boolean checkTaskDescription(){
        
        while(taskDescription.length()>50){
            taskDescription = JOptionPane.showInputDialog(null, "Please enter a task description of less than 50 charecters");
        }
        
        
       return true;
   }
   
//Creating a method for compiling and structuring a task identity 
   String createTaskID(){
       
        lastTN = taskN.substring(0, 2);
        lastTaskNo = taskNo.substring(0, 1);
        lastDName = developerName.charAt(developerName.length()-1);
        lastDName2 = developerName.charAt(developerName.length()-2);
        lastDName3 = developerName.charAt(developerName.length()-3);
       
      taskID = lastTN + ":" + lastTaskNo + ":" + " " + lastDName3 + lastDName2 + lastDName ;
       
      return taskID ;
   }
   
//Creating a method for displaying the all the task details
  
   String printTaskDetails(){
       String taskDetail = ("\nTask Status: " + taskOutcome + 
                             "\nDeveloperDeatils: " + developerName +
                             "\nTask Number: " + taskNo + 
                             "\nTask Name: " + taskN + 
                             "\nTask Description: " + taskDescription +
                             "\nTask ID: " + createTaskID().toUpperCase() +
                             "\nTask Duration in Hours(H): " + taskDuration);
       JOptionPane.showMessageDialog(null, taskDetail);
       return taskDetail;
   }
   
//Creating a method to calculte the total hours of all the tasks
   
   int returnTotalHours(){
        int totalHours = taskDuration;
         if (numOfTasks > 1){totalHours += taskDuration  ;}// if the number of tasks is greater than 1, this will add up the hours of all the tasks
     
      JOptionPane.showMessageDialog(null,"Total hours of all tasks: " + totalHours );
      return totalHours;
   }
      
 }

   
