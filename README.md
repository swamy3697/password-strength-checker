# Password Strength Checker

Welcome to the Password Strength Checker project! This Java application allows you to assess the strength of passwords and provides feedback based on various criteria. Determine whether your passwords are weak, medium, strong, or very strong with ease.

## Getting Started

1. Clone or download this repository to your local machine.
2. Navigate to the `src` directory.

## How to Run

1. Compile the Java files using the following command:

   ```bash
   javac com/company/Main.java com/company/Checker.java
Run the program with:

bash
Copy code
java com.company.Main
Follow the prompts to enter passwords and receive strength feedback.

## Classes
### Main
The Main class serves as the entry point for the Password Strength Checker program. 
It displays the user interface, takes input, and interacts with the Checker class.

### Checker
The Checker class contains the logic for evaluating password strength. 
It calculates points based on lowercase letters, uppercase letters, special characters, 
numbers, and minimum length. The class provides a check method to analyze passwords and give feedback on their strength.
## Usage
The program prompts you to enter a password or type "exit" to quit.
The password strength levels are: Very Very Weak, Very Weak, Weak, Medium, Strong, and Very Strong.
The program analyzes the entered password and displays its strength level.
## Example
```
------- -- -------- -------- -------
WELCOME TO PASSWORD STRENGTH CHECKER
------- -- -------- -------- -------

password Strength levels
                                 Very Very Weak        Very Weak       Weak        Medium      Strong      Very Strong

Enter Password To check or if you want to exit enter exit
mypassword

Password Strength: Strong

Enter Password To check or if you want to exit enter exit
1234

Password Strength: Weak

Enter Password To check or if you want to exit enter exit
exit
```
## Contribution
If you find this tool useful or have suggestions for improvement, feel free to contribute! Fork this repository, make your changes, and submit a pull request.
## Support
If you find this tool helpful, consider giving this repository a ⭐️ on GitHub to show your support.

   
