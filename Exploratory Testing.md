# Exploratory Testing for Monefy

This file contents the exploratory testing for Monefy mobile app. The exploratory testing was done on the Android Emulator and the test charters are based on the common bugs that are found in budget apps. The test charters are also based on the functionality of the Monefy app and the bugs that were found during the exploratory testing.
This file contents the following:
1. Bug taxonomy
2. Test charters
    1. User Registration and Sign-up Flow
    2. Expense capturing and categorization
    3. Income capturing
    4. View balance for any specific day chosen - transaction history
3. Charter prioritisation
********************************************************************************************************
# Bug taxonomy
Below is a sample of common bugs for budget apps like Monefy and this is going to give a starting point for testing the app.
Bug Taxonomy for a Budget Mobile App
1	Functional Transaction Management	 
	 	Expense amounts recorded incorrectly
	 	Budget balance not updating
	 	Incorrect cumulative expense amounts
	 	Incorrect income amounts recorded
	 	Failure to edit captured amounts
	 	 
2	UI/UX	 
	 	Expense capturing navigation
	 	Income capturing  navigation
	 	Amount capturing restrictions
	 	Date selection input


********************************************************************************************************

# Test Charters - Monefy Mobile App

A. Test Charter: User Registration and  Sign-up Flow


Date: 18th of May 2025
Time Box: 30 minutes
Testers: Tom
Platform: Android


Objective: Explore the mobile app's user registration and sign-up to verify if users will be able to create an account

Scope:
•	User registration and sign-up

Areas to Explore:
1.	Install app from the store
2.	User Registration and sign-up

Risks: 
1.	Are users able to capture their details
2.	Are users able to create login details
3.	Are users able to capture payment details
4.	Are users able to login
5.	Are users able to logout
Results: 

Bugs: 
Description: No logout button
Pre-requisite: Logged to the Monefy App
Steps:
1.	Click on the three dots on the right top
2.	Check for the logout button
3.	Check on the screen for logout button
Actual Result: There is no logout button
Expected Result: The app must have a logout button in case the user wants to keep the budget private if other individuals have access to the phone 
Screenshot



B. Test Charter: Expense capturing and categorization


Date: 18th of May 2025
Time Box: 30 minutes
Testers: Tom
Platform: Android


Objective: Explore the mobile app's expense capturing and categorization functionality to verify precise expense tracking and management

Scope:
•	Expense capturing and categorization

Areas to Explore:
1.	Expense capturing and categorization - verify categorization of expenses


Risks: 
1.	Users failing to enter an expense for a specific category
2.	Users failing to add a new category
3.	Captured expenses being summed up incorrectly
4.	Captured expenses displaying an incorrect amount
5.	Users failing to rename a category
6.	Users failing to edit a captured expense
Results: 

Verify if users can capture an expense for a specific category 
Verify is users can add a new category - FAILED
Verify if captured expenses being summed up correctly
Verify if captured expenses are displaying a correct amount
Verify if a user can rename a category
Verify if user can edit a captured expense

     

Bugs: 
Issue 001
Description: Added new category is not being displayed.
Pre-requisite: Logged to the Monefy App
Steps:
1.	Click on the filter icon on the top left
2.	Select “Choose date”
3.	Click on the three dots on the right top
4.	Click “Categories”
5.	Click the “+” on expense to add new category
6.	Enter new name of category
7.	Select an icon e.g dating icon
8.	Click “Add” button on the top right
Actual Result: The new category created does not appear on the when capturing expenses, see screenshot below.
Expected Result: The new category must appear on the main screen when capturing expenses
Screenshot
 


Issue 002

Description: Keyboard for numbers and letters overlapping
Pre-requisite: Logged to the Monefy App
Steps:
1.	Click on the filter icon on the top left
2.	Select “Choose date”
3.	Click on any one of the icons for expenses
4.	Enter a number
5.	Clickeck on “Add note” 
6.	Try to Enter a number which is not 1, 2, or 3
Actual Result: The keyboard with the alphabet blocks all the other numbers, one can only type 1, 2, and 3
Expected Result: When the user types a number the alphabet keyboard must disappear.
Screenshot





C. Test Charter:  Income capturing 


Date: 18th of May 2025
Time Box: 30 minutes
Testers: Tom
Platform: Android


Objective: Explore the mobile app's income capturing functionality to verify precise income source.

Scope:
•	Income capturing - accounts

Areas to Explore:
1.	Income capturing - test capturing income amounts, adding new income sources and transfers between accounts

Risks: 
1.	Users failing to capture amounts on income accounts
2.	Users failing to add new income sources
3.	Users failing to transfer funds between accounts
Results: 

Verify if users are able to capture amounts on income accounts
Verify if users are able to add new income sources
Verify if users are able to transfer funds between accounts
  



Bugs: 
•	No issues were picked up


D. Test Charter: View balance for any specific day chosen - transaction history 

Date: 18th of May 2025
Time Box: 30 minutes
Testers: Tom
Platform: Android


Objective: Explore the mobile app's transaction history functionality to verify data retrieval 

Scope:
•	View transaction history 

Areas to Explore:
1.	View transaction history - verify accuracy and filtering of transaction history

Risks: 
1.	Incorrect transaction history displayed on chosen date
2.	Date picker failing
Results: 
Verify selection  of date using date picker
Verify display of the correct transaction history for chosen date

 
Bugs: 
•	No issues picked up


********************************************************************************************************
# Charter Prioritisation 

	Charter	Priority	                                               Reason
1	Test Charter: User Registration and  Sign-up Flow	High	Core functionality - if users fail to register they won't be able to use the system and the app developer won't be able to collect subscriptions
2	Test Charter: Expense capturing and categorization	High	Core functionality - users must be able to capture expenses and be able to categorize them. Categorization is very vital so that users are aware of areas that they need to make adjustments.
3	Test Charter:  Income capturing - accounts	High	Core functionality - users must be able to capture income amounts to calculate the budget
4	Test Charter: View transaction history	Medium	This is not core functionality but its needed for users to view history for better planning


********************************************************************************************************

# Summary of Exploratory Testing
1. Registration flow needs some improvements
2. Reports visibility needs to be improved
3. The app must also assist in budgeting by providing users with a report of their spending habits










