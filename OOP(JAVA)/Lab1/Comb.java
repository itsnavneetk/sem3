//Four digit combinations without repetition

class Combination
{
 public static void main(String[] ar)
 {
  boolean flag;
  int d1,d2,d3,d4;
  
  for(int n=1000;n<10000;i++)
  {
   flag=false;
  
   d1=n/1000;
   n=n%1000;
   d2=n/100;
   n=n%100;
   d3=n/10;
   n=n%10;
   d4=n/1;
   
   if(d1==d2||d1==d3||d3==d4||d2==d3||d2==d4||d3==d4)
   flag=true;
   
   if(flag==false)
   System.out.println(n);
  }
 }
}