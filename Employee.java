package com;
//encapsulated java class........Model class...Java Bean
public class Employee 
{
	//class variables class properties
	int id;
	String name;
	String managerName;
	double salary;
	
	
	double getBonus()
	{
		return salary * .1;
	}
	
	

}
