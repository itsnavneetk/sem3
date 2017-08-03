/*Write a program to store the information of students using object serialization
  and the read the same using object de-serialization. Calculate the percentage  
  and grade them and write the information again to the file.*/

import java.io.*;
import java.util.Scanner;
  
class Student
{
 String name;
 int rno;
 int marks;
 
 Student()
 {	
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter name - ");
	name=sc.nextLine();
	System.out.print("Enter roll number - ");
	rno=sc.nextInt();
	System.out.print("Enter marks out of 50 - ");
	marks=sc.nextInt();
 }
 
 public String toString()
 {
	System.out.println("Name = "+name);
	System.out.println("Roll number = "+rno);
	System.out.println("Percentage = "+(marks*2)+"%");
 }
 
}

class SerializationDemo
{
 public static void main(String[] ar)
 {
  Scanner sc=new Scanner(System.in);
  char ch='n';
  try
  {
	do
	{	
		Student s=new Student();
		FileOutputStream fos=new FileOutputStream("Serial");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s);
		oos.flush();
		System.out.print("Enter again? (y/Y) - ");
		ch=sc.next().charAt(0);
	}while(ch=='y'||ch=='Y');
		
 
 