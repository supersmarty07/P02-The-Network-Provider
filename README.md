
Develop a Java program that allows the user to enter details of their phone usage and then compare the bill which would result from this usage under different billing plans. 
Requirement 1: 
Display a welcome message when the program starts 
• The welcome message should have a row of “*” at the top and the bottom, just long enough to extend over the text.  
• The first line of the message should read “WELCOME TO PHONE BILL COMPARISON SYSTEM” 
• The second line of the message should be blank.
• The third line should read “Developed by” followed by your names and a comma, then “student ID”, then your student ids of all group members. 
• The fourth line should display “OODP101 Object Oriented Design and Programming” 
• The fifth line should display the current date and time of system. You are expected to do a research to complete this task. 
• The sixth line should be blank, and the seventh line should be another row of “*”
Requirement 2 
Provide a menu from which the user can select to Enter Usage Details, Display Cost Under Provider 1, Display Cost Under Provider 2, Display Cost Under Provider 3, Clear Usage, or Exit System. This menu should be repeated each time after the user has chosen and completed an option until the user chooses to Exit. The user selects an option by entering the number next to it. If an invalid number is selected, the user is advised to make another selection.
Requirement 3 
When the user selects the Enter Usage Details option, provide another menu from which the user can select Phone Call, SMS, Data Usage, or Return to Main Menu. The user selects an option by entering the number next to it. If an invalid number is selected, the user is told to make another selection.
Requirement 3.1 
If the user selects Phone Call, they are prompted to enter the length of the call in seconds. If user selects this option more than once then it means that there are more than one calls that user had made on particular day so your program should be able to consider all calls in billing system. The value entered must be positive – if not, the user should be prompted to re-enter a new value. After entering a valid call length, number of calls should be displayed and the user is returned to the Enter Usage Details Menu so that they may choose to enter additional usage details.
Requirement 3.2 
If the user selects SMS, the program should simply increment the count of the number of SMS messages and number of messages. No further information is required so the program should simply display the total number of SMS messages recorded so far, and then return to the Enter Usage Details Menu.
Requirement 3.3 
If the user selects Data Usage, they should be prompted to enter the amount of data used in MB. The value entered must be positive – if not, the user should be prompted to reenter a new value. After entering a valid value, the user is returned to the Enter Usage Details Menu so that they may choose to enter additional usage details.
Requirement 4 
When the user selects the Display Cost Under Provider 1 option, the program should display a summary of the usage details which have been entered, and their cost under Provider 1, along with the total cost, formatted as shown in the screenshot below. The cost structure for Provider 1 is listed in the following table. Once the bill summary has been displayed, it’s total value should be saved into an array and the program should return to the Main Menu.
Requirement 5 
When the user selects the Display Cost Under Provider 2 option, the program should do the same as in Step 4, but using Provider 2’s cost structure instead, which is listed in the following table,and then return to the Main Menu.
Requirement 6 
When the user selects the Display Cost Under Provider 3 option, the program should do the same as in Step 4, but using cost structure that will be developed by you and then return to the Main Menu
Requirement 7 
When the user selects Clear Usage Details the value of all variables related to the usage (number of calls, total length of calls, number of SMS, total data usage) should all be reset to 0. A message reporting this should be displayed, and the program should return to the Main Menu.
Requirement 8 
When the user selects Exit System, quit the program with a message to the user which will show which is the expensive and cheapest provider by using the values stored in the array. 


