package com;
//encapsulated java class........Model class...Java Bean
public class Employee 
{
	//class variables class properties
	int id; // integer variable that stores id of customer
	
	String name;   //String variable that stores the name of customer
	
	String managerName;    //String variable that stores the name of manager
	
	double salary;     //double type variable that holds the salary of customer
	
	String comanyName;// string variable that holds the name of company		
	
	
	double getBonus()     //function which calculates the bonus over the salary
	{
		return salary * .1;    //bonus is 10 percent of salary
	}
	
	

}
