import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class TaskTest {

	@Test
    public void testTask() {
        String taskName = "login feature";
        String taskDescription = "create login to authenticate users";
        String developerDetails = "Robyn Harrison";
        String taskDuration = "8hrs"; 
        String taskStatus = "To do";

        Task task = new Task(taskName, taskDescription, developerDetails, taskDuration, taskStatus);

        // Assert task ID format
        Assertions.assertTrue(task.getTaskID().startsWith(taskName.substring(0, 2)));
        Assertions.assertTrue(task.getTaskID().endsWith(developerDetails.substring(developerDetails.length() - 3)));

        Assertions.assertEquals(taskName, task.getTaskName());
        Assertions.assertEquals(taskDescription, task.getDescription());
        Assertions.assertEquals(taskDuration, task.getTaskduration());
        Assertions.assertEquals(developerDetails, task.getDeveloper());
        Assertions.assertEquals(taskStatus, task.getTaskStatus());
    }
	
	@Test
    public void testTask2() {
        String taskName = "add task feature";
        String taskDescription = "Create Add Task feature to add task  users";
        String developerDetails = "Mike Smith ";
        String taskDuration = "10hrs"; 
        String taskStatus = "Doing";

        Task task = new Task(taskName, taskDescription, developerDetails, taskDuration, taskStatus);

        // Assert task ID format
        Assertions.assertTrue(task.getTaskID().startsWith(taskName.substring(0, 2)));
        Assertions.assertTrue(task.getTaskID().endsWith(developerDetails.substring(developerDetails.length() - 3)));

        Assertions.assertEquals(taskName, task.getTaskName());
        Assertions.assertEquals(taskDescription, task.getDescription());
        Assertions.assertEquals(taskDuration, task.getTaskduration());
        Assertions.assertEquals(developerDetails, task.getDeveloper());
        Assertions.assertEquals(taskStatus, task.getTaskStatus());
    }
	
	
	@Test
    public void testTask3() {
        String taskName = "add task feature";
        String taskDescription = "Create Add Task feature to add task  users. desciption test of mpre than 50 characters";
        String developerDetails = "Mike Smith ";
        String taskDuration = "10hrs"; 
        String taskStatus = "Doing";

        try {
            Task task = new Task(taskName, taskDescription, developerDetails, taskDuration, taskStatus);
            Assertions.fail("Task description is too long but no exception was thrown.");
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("Task description cannot be longer than 50 characters.", e.getMessage());
        }
    }

}
