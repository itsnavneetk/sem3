import java.util.Scanner;
   public class SinX
  {
      public static void main(String[] args)
     {
        Scanner kbd = new Scanner(System.in);
     	      
     	
        System.out.print("Enter a number: ");
        int x = kbd.nextInt();
     	     
        
        double sum =0;
        int s=1;
        int p=1;
        int fact =1;
     	
     	
        for (int i=1; i<=x; i+=2)
        
        {
           for(int k=1; k<=i; k++)

           {
              p=p*x;
           
              for (int j=1; j<=i; j++)
              {
                 fact = fact*j;
                 sum = ((double)p/fact)*s;
                 s =- s;
              }
           }
        
        }
           System.out.print("The sum is: "+ sum);
        
     }
  }
