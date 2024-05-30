
public class Task {
	private static int taskNumber=0; //auto incremented as more tasks are added
	
	private String taskID; //1st two letters of taskname:taskNumber:last 3 letters of developers name
	private String taskName; //name of task, eg Add task feature
    private String taskDescription; //max 50 characters in length;
    private String taskDuration; //in hours
    private String developerDetails; //fname and lname of developer assigned task
    private String taskStatus; //"To do" or "Done" or "Doing" 
    

    
  //Constructor
    public Task(String taskName, String taskDescription, String developerDetails, String taskDuration, String taskStatus) {
    	this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.developerDetails=developerDetails;
        this.taskDuration=taskDuration;
        this.taskID=taskID;
        this.taskStatus=taskStatus;
        
        this.taskID = taskName.substring(0, 2) + ":" + ++taskNumber + ":" + developerDetails.substring(developerDetails.length() - 3);
         // Generate task ID automatically
         //this.taskID = generateTaskID();

        // Auto-increment taskNumber
        taskNumber++;
    }



	//Getters and setters of posts into attribute values
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    //-------------------------------taskNumber
    public int getTaskNumber() {
        return taskNumber;
    }

    public static void setTaskNumber(int taskNumber) {
        taskNumber = taskNumber;
    }
    
    //-------------------------------
    public String getDescription() {
        return taskDescription;
    }

    public void setDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }
    
    
  //-------------------------------developerDetails
    public String getDeveloper() {
        return developerDetails;
    }

    public void setDeveloper(String developerDetails) {
        this.developerDetails = developerDetails;
    }
    
    //-------------------------------Task duration
    public String getTaskduration() {
        return taskDuration;
    }

    public void setTaskduration(String taskDuration) {
        this.taskDuration = taskDuration;
    }
    
    //-------------------------------Task duration
    public String getTaskID() {
        return taskID;
    }

    public void setTaskID(String taskID) {
        this.taskID = taskID;
    }
    
    
  //-------------------------------taskStatus
    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }
    
    
    
    private String generateTaskID() {
        return taskName.substring(0, 2) + ":" + taskNumber + ":" + developerDetails.substring(developerDetails.length() - 3);
    }

    // Example validation method for task description length
    public boolean isValidTaskDescription() {
        return taskDescription.length() <= 50;
    }
    
    
    public String printTaskDetails() {
    	return "Task ID: " + taskID + "\n" +
    	           "Task Name: " + taskName + "\n" +
    	           "Task Description: " + taskDescription + "\n" +
    	           "Task Duration: " + taskDuration + "\n" +
    	           "Developer Details: " + developerDetails + "\n" +
    	           "Task Status: " + taskStatus;
    	
		
    }
}
