import java.util.Scanner;

class Smallest
{
 public static void main(String[] ar)
 {
  int a,b,c;
  
  Scanner input=new Scanner(System.in);
  
  System.out.print("Enter number 1 - ");
  a=input.nextInt();
  System.out.print("Enter number 2 - ");
  b=input.nextInt();
  System.out.print("Enter number 3 - ");
  c=input.nextInt();
  
  int sm=((a<b&&a<c)?a:(b<c&&b<a)?b:c);
  
  System.out.println("Smallest number = "+sm);
  
 }
}
 