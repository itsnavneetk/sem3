import java.util.Scanner;

class Convert		//int to byte, char to int, double to byte
					//double to int
{
 public static void main(String[] ar)
 {
  
  Scanner in= new Scanner(System.in);
  
  System.out.print("Enter an Integer - ");
  int i=in.nextInt();
  System.out.print("Enter a Double  - ");
  double d=in.nextDouble();
  System.out.print("Enter a Character - ");
  char c=in.next().charAt(0);
  
  System.out.println("\nInt to Byte:	");
  byte b=(byte)i;
  System.out.println(i+"(INT)="+b+"(BYTE)");
  
  System.out.println("\nChar to Int:	");
  int i2=c;
  System.out.println(c+"(CHAR)="+i2+"(INT)");  
  
  System.out.println("\nDouble to Byte:	");
  byte b1=(byte)d;
  System.out.println(d+"(DOUBLE)="+b1+"(BYTE)");  
  
  System.out.println("\nDouble to Int:	");
  int i3=(int)d;
  System.out.println(d+"(DOUBLE)="+i3+"(INT)");  
 }
}