//four function calculator

import java.util.Scanner;

class Calculator
{
 static float n1,n2;
 static char op,ch;
 
 public static void main(String ar[])
	{
	  Scanner input=new Scanner(System.in);
	 do{
  	  System.out.println("\t\t\t***Four Function Calculator***");
	  System.out.print("Enter number 1: ");
	  n1=input.nextFloat();
	  System.out.print("Enter operator: ");
	  op=input.next().charAt(0);
	  System.out.print("Enter number 2: ");
	  n2=input.nextFloat();
	  
	  switch(op)
	  {
		case '+': System.out.println("Sum = "+(n1+n2));
					break;
		case '-': System.out.println("Difference = "+(n1-n2));
					break;
		case '*': System.out.println("Product = "+(n1*n2));
					break;
		case '/': System.out.println("Quotient = "+(n1/n2));
					break;
		default:  System.out.println("INVALID!");
	  }
	  
	   System.out.println("Another Calculation?? (Y/y)");
	   ch=input.next().charAt(0);
	  }while(ch=='y'||ch=='Y');
	  
	 }
	}