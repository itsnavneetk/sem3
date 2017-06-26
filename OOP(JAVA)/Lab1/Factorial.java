//Factorial of a number

class Factorial
{
 public static void main(String[] ar)
 {
  int n=7;
  long fact=1;
  
  for(int i=1;i<=n;i++)
  {
   fact*=i;
  }
  
  System.out.println("Factorial of "+n+" is "+fact);
 }
}