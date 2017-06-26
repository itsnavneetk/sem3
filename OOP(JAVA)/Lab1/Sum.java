import java.math.*;

class Sum
{
 public static void main(String[] ar)
 {
  double sum=0;
  int n=5;
    
  for(int i=1;i<=n;i++)
  {
   double term=Math.pow(1/i,i)*Math.pow(-1,i+1);   
   sum=sum+term;
  }
  System.out.println(sum);
 }
}