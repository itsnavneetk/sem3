//Cosine
import java.math.*;

class Cosine
{
   public static long factorial(int n)
   {
    long fact=1;  
    for(int j=1;j<=n;j++)
	fact*=j; 
	return fact;
   }	

   public static void main(String ar[])
 {
 
  final double PIr=3.14159;
  final int PId=180;
  
  int n=60;
  
  //1 degree=pi/180 rad
  
  double x=n*(PIr/PId);
  double cos=1;
    
  for(int i=1;i<=10;i++)
  {
   double term=Math.pow(-1,i)*Math.pow(x,i*2)/factorial(i*2);   
   cos=cos+term;
  }
  
  System.out.println("Cosine of "+x+" rad and "+n+" deg is "+cos+".");
 }
}
 
   