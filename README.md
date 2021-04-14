# Object-Oriented

Fat Gram Calculator:

Smart Beauty Shop needs a Fat Gram Calculator that calculates the percentage of calories from fat, given a food item, the total of calories and fat grams in a food item. The number of calories from fat cannot be greater than the total of calories in the food item. If the program determines that the number of calories from fat is greater than the number of calories in the food item, it should display an error message indicating that the input is invalid.

Fat contains 9 calories per gram. The calculator should display the percentage of the calories that come from fat. The percentage of calories from fat can be calculated as follows:
Calories from fat = grams of fat * 9
Percentage of calories from fat = (calories from fat / total calories) * 100

If the calories from fat are less than 30% of the total calories of the food, it should also display a message indicating the food is low fat.
The number of calories from fat cannot be greater than the total of calories in the food item. If the program determines that the number of calories from fat is greater than the number of calories in the food item, it should display an error message indicating that the input is invalid.

Construct the UML, class and an application that creates a food object. Your class should have the following:
a.	Give an appropriate name for your class
b.	Define appropriate data member and their data type 
c.	Constructor with and without arguments
d.	Setter method and getter method
e.	Other appropriate methods.
f.	Test your application with food items below:

Food Item:	Total Calories	,Fat (gram)
Crunchy Peanut	:539.7	,32.22 
Muruku	:111.0	,7.00
Food A	:211.0	,7.00
Nasi lemak	:644.0	,83.0

----------------------------------------------------------------------------------------------------------------------------
Course:

Write a class named Course to represent course. A Course object can be created using the constructor by passing a course name. Students can be added by using addStudent(String student) method and return all the students for that course using the getStudents() method. Write a complete test program named TestCourse that can add three courses with more then five students for each courses. Display the number of student and students name for that courses as shown below:

	Number of students in Programming II course : 6
	
1.	Siti Aminah Muhammad
2.	Halim Zainal Abidin
3.	Jason Lim
4.	..
5.	..	

       Number of students in Database Systems course : 15
      
1.	Fatimah Ahmad
2.	Sarah Goh
..
