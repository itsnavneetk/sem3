//Prime numbers between m and n

class Prime
{
 public static void main(String[] ar)
 {
  int m=2,n=100;
  
  System.out.println("Value of m=2");
  System.out.println("Value of n=100");
  
  for(int i=m;i<=n;i++)
  {
   int flag=0;
           for(int j=2;j<i/2;j++)
		    {
			 if(i%j==0)
			  {
			   flag=1;
			  }
			}
		if(flag==0)
		System.out.println(i);
  }
 }
}