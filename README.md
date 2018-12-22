# copart-project
interview project for copart

For my final touches, I Polished up the code and filed the Selection if statements located in the Main.java application. Had I had more time to complete this project, I would have added a group/individual signup options in the Main application and Sports file. I would have also added output to the user showing how who was on each roster, the total amount on the roster when selecting a particular sports selection, and how many spots were left on each roster. Finally, I should have added a variable located in the Person.java file that keeps track of the number of sports each employee has signed up for, but this would be a very simple addition to the class.
What I have delivered should give a decent look at my design process. It was my intent that this code should be modular enough to continuously add provisions and extra methods that will fit the requirements given on the project and beyond. The Sports and Person java files can be continuously added and extended to include multiple different types of people and sports based on the parameters

#Main.java
runs the main application which includes create each obstantiation of a sport using the sports class, in this case it is 5 sports. 
Application then adds or removes the user from the list depending on their option choice and the sports class

#Sports.java
The sports class is a class that holds the name of the game, it's unique ID, its max players and its own hashmap roster that will keep track of who is in already signed up. A hashmap was chosen as the data structure because of continuous search and insertion time. 
The main method in this class is the addDeletePlayer method which adds or deletes the player from the roster when passed in. Utilization of the hashmap methods makes this process simple. 

#Person.java
class that can easily be extened to fit any type of person and not just an employee (like a family member or anyone else). It holds the first name, last name, and an ID for that individual user. 
