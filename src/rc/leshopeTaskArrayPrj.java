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
public class leshopeTaskArrayPrj {
    
    //Declaration for all the attributes
    
       private String [] developer, taskName, taskID,taskOutcome, taskDescription;
       private int [] taskDuration, taskStatus,taskNumber;
       private int numOfTasks, x ;
       private String [] statusOptions = {"To Do","Done","Doing"};
       public String [] taskChanges = {"Type in the number of the feature you would like to choose below: " ,"1) Tasks with the task status done", "2)Task with longest duration: ", "3) Search for task with its task name: ", "4) Search for tasks assigned to developer: ", "5) Delete task: ", "6) Report", "7) Quit"};
    
       
       //Creation of a default constructor to set the default values for all attributes

    public leshopeTaskArrayPrj( ) {
        this.developer = new String[4];
        this.taskName = new String[4];
        this.taskID = new String[4];
        this.taskNumber = new int[4];
        this.taskOutcome = new String[4];
        this.taskDescription = new String[4];
        this.taskDuration = new int [4];
        this.taskStatus = new int[4];
        this.x = 0;
        this.numOfTasks = 0;
    }
    // Creation of setters that assign values for each attribute

    public void setDeveloper(String[] developer) {
        this.developer = developer;
    }

    public void setTaskName(String[] taskName) {
        this.taskName = taskName;
    }

    public void setTaskID(String[] taskID) {
        this.taskID = taskID;
    }

    public void setTaskNumber(int[] taskNumber) {
        this.taskNumber = taskNumber;
    }

    public void setTaskOutcome(String[] taskOutcome) {
        this.taskOutcome = taskOutcome;
    }
    
    public void setTaskDescription(String[] taskDescription) {
        this.taskDescription = taskDescription;
    }

    public void setTaskDuration(int[] taskDuration) {
        this.taskDuration = taskDuration;
    }

    public void setTaskStatus(int[] taskStatus) {
        this.taskStatus = taskStatus;
    }

    public void setNumOfTasks(int numOfTasks) {
        this.numOfTasks = numOfTasks;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setStatusOptions(String[] statusOptions) {
        this.statusOptions = statusOptions;
    }

    public void setTaskChanges(String[] taskChanges) {
        this.taskChanges = taskChanges;
    }
    
    
    //Creation of getters that return the values for each attribute

    public String[] getDeveloper() {
        return developer;
    }

    public String[] getTaskName() {
        return taskName;
    }

    public String[] getTaskID() {
        return taskID;
    }

    public int[] getTaskNumber() {
        return taskNumber;
    }

    public String[] getTaskOutcome() {
        return taskOutcome;
    }
    
    public String[] getTaskdescription() {
        return taskDescription;
    }

    public int[] getTaskDuration() {
        return taskDuration;
    }

    public int[] getTaskStatus() {
        return taskStatus;
    }

    public int getNumOfTasks() {
        return numOfTasks;
    }

    public int getX() {
        return x;
    }

    public String[] getStatusOptions() {
        return statusOptions;
    }

    public String[] getTaskChanges() {
        return taskChanges;
    }
    
    //Methods
   
    //Method for user entry of tasks to the arrays 
    public void taskCreation()
    {
        numOfTasks = Integer.parseInt(JOptionPane.showInputDialog("Please enter the amount of tasks you would like to add. Number of tasks must not be more than 4"));
        while(numOfTasks >4 || numOfTasks == 0){
          numOfTasks = Integer.parseInt( JOptionPane.showInputDialog("Tasks added must be less than 5 but not less than 1, please enter the amount of tasks you would like to add"));
        }
        
        for (x = 0 ; x <numOfTasks; x++){
          
          developer[x] = JOptionPane.showInputDialog(null,"Please enter the developer name");
          taskName[x] = JOptionPane.showInputDialog(null,"Please enter the task name");
          taskDescription [x] = JOptionPane.showInputDialog(null,"Please enter a task descrption for the task");
          checkTaskDescription();
         for(int r = 0 ;r <numOfTasks; r++){ //An increment for the task number auto-generation of the task number 
          taskNumber[x] = x;
          }
          taskDuration[x] =     Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter the duration for the hours of task"));
          taskStatus[x] =  JOptionPane.showOptionDialog(null, "Please select one of the options", "Status", 
                                                      JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, statusOptions,0  );
          
          
          
          if(taskStatus[x] == 0){ // nested if for the three options of the task status
          
             taskOutcome[x] = "ToDo";
          }
           
          if(taskStatus[x] == 1){
         
              taskOutcome[x] = "Done!";
          }
          
          if(taskStatus[x] == 2){
              taskOutcome[x] = "In progress...";
          
      }
         
        JOptionPane.showMessageDialog(null,"Task successfully captured :)");  // Message displayed everytime the user has entered a task successfully
        }
       
    }
    
    //Method for displaying all tasks that are done
    
    public void printTaskDone(){
       
            
                
                for(int t = 0; t < numOfTasks; t++){
                if(taskStatus[t] == 1 ){
               JOptionPane.showMessageDialog(null,"\n Developer Name: " + developer[t] + 
                                   "\n Task Name: " + taskName[t]  + 
                                   "\n Task Duration: " + taskDuration[t] +
                                   "\n TaskStatus: " + taskOutcome[t]);
                                        
                
              }
            }
          }
    
    //Method for displaying the task with the highest duration
    
    public  void printTaskMax(){
         int largest = 0;
         String longestDeveloper = null;
        for (int z = 0; z < numOfTasks; z++ ){
            if(taskDuration[z] >  largest){
                largest = taskDuration[z];
                longestDeveloper = developer[z];
               
               
         }
            
       }
      JOptionPane.showMessageDialog(null,"Developer Name: " + longestDeveloper +
                                                              "\nTask Duration: " + largest );
       
     } 
    
    //Method for searching for a task using the task name
    
     public void searchTask(){
        
        boolean flag = false;
        String searchTaskName = JOptionPane.showInputDialog("Please enter task desired to search using the task name");
        for (int y = 0; y < numOfTasks; y++ ) {
            
            if (searchTaskName.equals(taskName[y])) {
                 JOptionPane.showMessageDialog(null,"Task Name: " + taskName[y]  +
                                   "\nDeveloper Name: " + developer[y]+
                                   "\nTaskStatus: " + taskOutcome[y]);
                flag = true;
                break;
            }
        }
         
         if (flag == false){
            JOptionPane.showMessageDialog(null,"Task name not found!"); 
         }
             
      }
      
     //Method for searching for a task using the developer name
     public void printDeveloperTasks(){
         boolean flag = false;
         String searchDeveloperName = JOptionPane.showInputDialog("Please enter tasks assigned to developer desired");
        for (int j = 0; j < numOfTasks; j++ ) {
            
            if (searchDeveloperName.equals(developer[j])) {
                
                
                    
                 JOptionPane.showMessageDialog(null,"Task Name: " + taskName[j]+
                                   "\nTaskStatus: " + taskOutcome[j]);
                
                
                flag = true;
                break;
              
            }
        }
         
         if (flag == false){
            JOptionPane.showMessageDialog(null,"Developer not found"); 
   }
             
}
     
     //Method to delete a task using the task name
     
     public void deleteTask(){
         
         String delete = "";
         boolean deleteTask = false;
         int confirm = 0;
          delete = JOptionPane.showInputDialog("Enter the task name of the task you want to delete");
          
          for(int p = 0 ; p < numOfTasks; p++){
              
              if (delete.equalsIgnoreCase(taskName[p])){
                  JOptionPane.showMessageDialog(null,taskName[p] + " is deleted!!");
                  
                  int total = 0;
                      total = total - (taskDuration[p]);
                      
                      
                      developer[p] = null;
                      taskNumber[p] = 0;
                      taskName [p] = null;
                      
                      taskDuration[p] = 0;
                      taskOutcome [p] = null;
                      taskID [p] = null;
                      
                      
                      
              }
          }
     
     }
     
     //Method for displaying all the tasks added
     
      public void taskReport(){
                for (int l = 0; l<numOfTasks; l++){
                 JOptionPane.showMessageDialog(null,"\n Developer Name: " + developer[l]  + 
                                                                "\n Task Number: " + taskNumber[l] +
                                                                "\n Task Description: " + taskDescription[l] +
                                                                "\n Task Name: " + taskName[l]  + 
                                                                "\n Task Duration: " + taskDuration[l] +
                                                                "\n Task Status: " + taskOutcome[l] +
                                                                "\n Task ID: " + taskID[l]);
                }
            
          
     
 }
      
      //Method for creating the ID of the task
      
       public String [] createTaskID(){
       
       String lastTN = taskName[x].substring(0, 2);
        
        char lastDName = developer[x].charAt(developer[x].length()-1);
        char lastDName2 = developer[x].charAt(developer[x].length()-2);
        char lastDName3 = developer[x].charAt(developer[x].length()-3);
       
        taskID[x]  = (lastTN + ":" + taskNumber[x] + ":" + " " + lastDName3 + lastDName2 + lastDName).toUpperCase() ;
      
         
       return taskID;
     
   }
       
       //Creating a method of counting the lenght of the task discription
    
        String[] checkTaskDescription(){
        
        while(taskDescription[x].length()>50){
            taskDescription [x] = JOptionPane.showInputDialog(null, "Please enter a task description of less than 50 charecters");
        }
        
        
       return taskDescription;
   }
   
  
}
//