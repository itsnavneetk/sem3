import java.io.*;
import java.util.*;

class Student extends Serializable
{
	int marks[5];
	Scanner in=new Scanner(System.in);
	Student()
	{
		System.out.println("Enter marks");
		for(int i=0;i<5;i++)
		marks[i]=in.nextInt();
	}
}

class ObSer
{
