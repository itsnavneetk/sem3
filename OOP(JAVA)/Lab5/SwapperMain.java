  /////////////////// 
 //Swap two values//  
///////////////////

import java.util.Scanner;

class Swapper
{
 int a;
 int b;
 
 void acceptValues()
 {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter a - ");
	a=sc.nextInt();
  System.out.print("Enter b - ");
	b=sc.nextInt();
 }
 
 void displayValues()
 {
  System.out.println("a = "+a);
  System.out.println("b = "+b);
 }
 
 void swap(int x, int y)
 {
  int temp=x;
  x=y;
  y=temp;
 }
 
 void swap(Swapper X)
 {
  int TEMP=X.a;
  X.a=X.b;
  X.b=TEMP;
 }
}

class SwapperMain
{
 public static void main(String[] ar)
 {
  Swapper obj=new Swapper();
  obj.acceptValues();
  System.out.println("Call by value!"); 
  obj.swap(obj.a,obj.b);
  obj.displayValues();
  System.out.println("Call by reference!");
  //Objects in Java are passed by reference. 
  obj.swap(obj);
  obj.displayValues();
 }
} 
  
  
  