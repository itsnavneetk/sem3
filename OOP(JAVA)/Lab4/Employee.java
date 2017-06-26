//////////////////////////////////////////////////////////////////////////////////////////////////////////
//Define a class Employee with data members: employee name, city, basic salary, dearness allowance (DA%)//
//and house rent (HRA%). Define getdata(), calculate(), and display() functions. Calculate method should//
//find the total salary and display method should display it.											//
//							Total = basic+basic*da/100+basic*hra/100;			                        //
//////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Emp
{
	String name, city;
	double salary;
	float DA, HRA;
	 
	Emp()
	{
	  salary=0;
	  DA=0;
	  HRA=0;
	}
	 
	void getData()
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the details of employee:");
	 System.out.print("Name\t\t\t|"); name=sc.next();
	 System.out.print("City\t\t\t|"); city=sc.next();
	 System.out.print("Basic Salary ($)\t|"); salary=sc.nextDouble();
	 System.out.print("Dearness Allowance\t|"); DA=sc.nextFloat();
	 System.out.print("House Rent\t\t|"); HRA=sc.nextFloat();
	}
	   
	double calculate()
	{
	  double total=salary+(salary*DA/100)+(salary*HRA/100);
	  return total;
	}
	
	void display(double t)
	{
	  System.out.println("The total salary of the Employee is "+t+"$");
	}
}

class Employee
{
 public static void main(String args[])
	{
		Emp E=new Emp();
		E.getData();
		double t=E.calculate();
		E.display(t);
	}
}
	
	