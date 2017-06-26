import java.util.*;

class Student
{
 long regno;
 String name;
 int age;
 
 Scanner in=new Scanner(system.in);
 
 Student()
 {
  System.out.println("Name - ");
  name=in.next();
  System.out.println("Reg. no - ");
  regno=in.nextLong();
  System.out.println("Age - ");
  age=in.nextInt();
 }
 
 void display()
 {
  System.out.println("Name - "+name);
  System.out.println("Reg. no - "+regno);
  System.out.println("Age - "+age);
 }
}

class UG extends Student
{
 String core;
 
 