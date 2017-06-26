//Program to check whether entered matrix
//is a Magic Square or not

import java.util.Scanner;

class Matrix
{
 int a[][]=new int[10][10];
 int order;
 
 static void acceptMatrix(Matrix M)
  {
   Scanner input=new Scanner(System.in);
   
   System.out.print("Enter order:: ");
   M.order=input.nextInt();
   
   System.out.println("Input Matrix:: "); 
  
   for(int i=0;i<M.order;i++)
		for(int j=0;j<M.order;j++)
			M.a[i][j]=input.nextInt();
  }
  
  static boolean checkMagicSquare(Matrix M)
  {
   for(int i=0;
 