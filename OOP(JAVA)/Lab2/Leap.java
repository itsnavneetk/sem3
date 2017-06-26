import java.util.Scanner;

class Leap
{
 public static void main(String[] ar)
 {
  Scanner in=new Scanner(System.in);
  
  System.out.print("Enter the year - ");
  int year=in.nextInt();
  
  boolean flag;
  
  if((year%4==0)&&(year%100!=0)||(year%400==0))
  {
   flag=true;
  }
  
  else flag=false;
  
  if(flag==true)   System.out.println("LEAP YEAR");
  else			   System.out.println("NOT A LEAP YEAR");
 }
}
   