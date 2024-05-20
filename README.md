Sure, here's an updated README file including the algorithm for the Task operations in the Main.java file:

```markdown
# POE_Part1
## User Dashboard Registration Application - Part 1

This project is a Java application for implementing user registration functionality, including input validation for username and password, and task management.

## Table of Contents
1. [Project Title and Description](#project-title-and-description)
2. [Table of Contents](#table-of-contents)
3. [Installation Instructions](#installation-instructions)
4. [Usage](#usage)
5. [Features](#features)
6. [Validation Rules](#validation-rules)
7. [Task Management](#task-management)
8. [Contributing](#contributing)
9. [Testing](#testing)
10. [License](#license)
11. [Contact Info](#contact-info)
12. [Acknowledgements](#acknowledgements)
13. [Troubleshooting](#troubleshooting)

## Project Title and Description
**User Dashboard Registration Application - Part 1**

This project is a Java application for implementing user registration functionality, including input validation for username and password, and task management.

## Installation Instructions
To install this project, clone the repository and import it into your preferred Java IDE (e.g., Eclipse). Ensure you have JUnit for testing and Docker for containerization.

## Usage
To run the application, execute the `Main` class. Follow the prompts to register, login, and manage tasks.

## Features
- **User registration**: Allows users to create an account by providing their username, password, first name, and last name.
- **Input validation**: Validates the entered username and password based on specified conditions.
- **Task management**: Allows users to create and manage tasks after logging in.

## Validation Rules
### Username
- **Condition**: Username contains an underscore and is no more than 5 characters long.
  - **Message True**: "Username successfully captured."
  - **Message False**: "Username is not correctly formatted. Please ensure that your username contains an underscore and is no more than 5 characters in length."

### Password
- **Condition**: Password meets the following complexity rules:
  - At least 8 characters long
  - Contains a capital letter
  - Contains a number
  - Contains a special character
  - **Message True**: "Password successfully captured."
  - **Message False**: "Password is not correctly formatted. Please ensure that the password contains at least 8 characters, a capital letter, a number, and a special character."

## Task Management
### Algorithm for Task Operations in Main.java
1. Register to the application
2. Login to the application
3. While logged in:
   - Ask the user if they want to create a task using number options
   - If the user wants to create a task:
     - Ask the user how many tasks they want to create
     - Using the number of tasks, repeat:
       - Create and capture a new task
       - Ask the user if they want to continue, "yes" means loop until the specified number of tasks have been created

## Contributing
To contribute to this project, fork the repository, create a new branch, and submit a pull request.

## Testing
This project uses JUnit for testing. To run the tests, execute the test classes in your IDE.

## License
This project is licensed under the MIT License.

## Contact Info
* LinkedIn: [Kholofelo Ledwaba](https://www.linkedin.com/in/kholofelo-ledwaba/)
* Email: [ST10451732@vcconnect.edu.za](mailto:ST10451732@vcconnect.edu.za)
* Instagram: 

## Acknowledgements
Thanks to the course instructors and fellow students for their support.

## Troubleshooting
If you encounter any issues, please check the following:
- Ensure all dependencies are correctly installed.
- Refer to the logs for any error messages.
- Consult the project documentation for detailed instructions.
```

This updated README includes the new task management algorithm and other essential information for users and contributors.
