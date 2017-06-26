import java.util.Scanner;

class Matrix1
{
 public static void main(String[] ar)
 {
  int a[][]=new int[3][3];
  Scanner input=new Scanner(System.in);
  System.out.println("Enter Matrix A::");
  
  for(int i=0;i<3;i++)
   for(int j=0;j<3;j++)
    a[i][j]=input.nextInt();
	
  
  int sum=0;  
	
  System.out.println("Principal Diagonal::");
  for(int i=0;i<3;i++)
   for(int j=0;j<3;j++)
    {
	 
	 if(i==j)
	 {
	  sum+=a[i][j];
	  System.out.println(a[i][j]);
	 }
	
	}
	
  System.out.println("Sum of elements of principal diagonal = "+sum);
  }
  }
	
	