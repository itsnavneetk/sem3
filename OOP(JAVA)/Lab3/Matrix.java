//Program to add and to multiply
//two integer matrices

import java.util.Scanner;

class Matrix
{
 int a[][]=new int[10][10];
 int r,c;
 
  static boolean checkAdd(Matrix M1, Matrix M2)
 {
  if(M1.r==M2.r && M1.c==M2.c)
  return true;
  return false;
 }
 
  static boolean checkMultiply(Matrix M1, Matrix M2)
 {
  if(M1.c==M2.r)
  return true;
  return false;
 }
  
  static void acceptMatrix(Matrix M)
  {
   Scanner input=new Scanner(System.in);
   for(int i=0;i<M.r;i++)
   for(int j=0;j<M.c;j++)
   M.a[i][j]=input.nextInt();
  }
  
  static void display(Matrix M)
  {
   for(int i=0;i<M.r;i++)
	{
		for(int j=0;j<M.c;j++)
		System.out.print(M.a[i][j]+"\t");
	System.out.println("");
	}
  }
  
  static Matrix Add(Matrix M1,Matrix M2)
  {
  Matrix M3=new Matrix();
  M3.r=M1.r;
  M3.c=M1.c;
  for(int i=0;i<M3.r;i++)
	{
		for(int j=0;j<M3.c;j++)
	M3.a[i][j]=M1.a[i][j]+M2.a[i][j];
    }
 return M3;
  }
  
  static Matrix Multiply(Matrix M1, Matrix M2)
  {
  Matrix M3=new Matrix();
  M3.r=M1.r;
  M3.c=M2.c;
  for(int i=0;i<M3.r;i++)
		{
			for(int j=0;j<M3.c;j++)
			{
			 M3.a[i][j]=0;
			 for(int k=0;k<M1.c;k++)
			 M3.a[i][j]+=M1.a[i][k]*M2.a[k][j];
	        }
		}
	return M3;
   }
 public static void main(String[] ar)
 {
  Scanner input=new Scanner(System.in);
  Matrix MA=new Matrix();
  Matrix MB=new Matrix();
  Matrix MC=new Matrix();
  
  System.out.println("Matrix A:: ");
  System.out.print("Enter rows:: ");
  MA.r=input.nextInt();
  System.out.print("Enter columns:: ");
  MA.c=input.nextInt();
  System.out.println("Input Matrix:: ");
  acceptMatrix(MA);
  
  System.out.println("\nMatrix B:: ");
  System.out.print("Enter rows:: ");
  MB.r=input.nextInt();
  System.out.print("Enter columns:: ");
  MB.c=input.nextInt();
  System.out.println("Input Matrix:: ");
  acceptMatrix(MB);
   
  if(checkAdd(MA,MB))
   {
    MC=Add(MA,MB);
	System.out.println("\nSum of the two Matrices::");
    display(MC);
   }
  else 
   System.out.println("ADDITION IS INVALID");

  if(checkMultiply(MA,MB))
   {
    MC=Multiply(MA,MB);
	System.out.println("Product of the two Matrices::");
    display(MC);
   }
  else System.out.println("MULTIPLICATION IS INVALID");

 }
}

  