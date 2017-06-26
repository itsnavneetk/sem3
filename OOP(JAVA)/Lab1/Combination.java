//Four digit combinations without repetition

class Combination
{
 public static void main(String[] ar)
 {
  
  
  for(int n=1000;n<10000;n++)
  {

  int d1,d2,d3,d4;
  int flag=0;
  int temp=n;
  
  
   d1=temp/1000;
   temp=temp%1000;
   d2=temp/100;
   temp=temp%100;
   d3=temp/10;
   temp=temp%10;
   d4=temp/1;
  
  if(d1==d2)flag=1;
   else if(d1==d3)flag=1;
   else if(d1==d4)flag=1;
   else if(d2==d3)flag=1;
   else if(d2==d4)flag=1;
   else if(d3==d4)flag=1;
   
   
   if(flag==0)
   System.out.println(n);
  }
 }
}