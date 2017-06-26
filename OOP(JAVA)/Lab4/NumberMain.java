import java.util.Scanner;

class Number
{
 private double num;
 
 Number(double n)
 {
  num=n;
 }
 
 boolean isZero()
 {
  if(num==0) return true;
  else return false;
 }
 
 boolean isPositive()
 {
  if(num>0) return true;
  else return false;
 }
 
 boolean isNegative()
 {
  if(num<0) return true;
  else return false;
 }
 
 boolean isOdd()
 {
  if(num%2!=0&&num!=0) return true;
  else return false;
 }
 
 boolean isEven()
 {
  if(num%2==0&&num!=0) return true;
  else return false;
 }
 
 boolean isPrime()
 {
  int i=(int)num;
  for(int j=2;j<i/2;j++)
		    {
			 if(i%j==0)
			  {
			   return false;
			  }
			}
 return true;
 }
}

class NumberMain
{
 public static void main(String ar[])
 {
  double a;
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter a number - "); a=sc.nextDouble();
  Number n=new Number(a);
  System.out.println("Zero - "+n.isZero());
  System.out.println("Positive - "+n.isPositive());
  System.out.println("Negative - "+n.isNegative());
  System.out.println("Integer part even - "+n.isEven());
  System.out.println("Integer part odd - "+n.isOdd());
  System.out.println("Integer part prime - "+n.isPrime());
 }
}
  
  
  