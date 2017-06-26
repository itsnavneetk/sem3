import java.util.Scanner;

class Matrix2
{
 public static void main(String[] ar)
 {
  int b[][]=new int[3][3];
  Scanner input=new Scanner(System.in);
  System.out.println("Enter Matrix B::");
  
  for(int i=0;i<3;i++)
   for(int j=0;j<3;j++)
    b[i][j]=input.nextInt();
	
  
  int sum=0;  
	
  System.out.println("Non Diagonal Elements::");
  for(int i=0;i<3;i++)
   for(int j=0;j<3;j++)
    {
	 
	 if(i!=j&&(i+j)!=2)
	 {
	  sum+=b[i][j];
	  System.out.println(b[i][j]);
	 }
	
	}
	
  System.out.println("Sum of Non Diagonal Elements = "+sum);
  }
  }
	
	