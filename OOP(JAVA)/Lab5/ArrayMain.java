import java.util.Scanner;

class Array
{
 int arr[]= new int[10];
 
 Array()
 {
  Scanner sc=new Scanner(System.in); 
  
  System.out.println("Enter Array::\n");
  for(int i=0;i<10;i++)
	arr[i]=sc.nextInt();
 }
 
 void displayArray()
 {
  System.out.println("\nArray::\n");
  for(int i=0;i<10;i++)
	System.out.println(arr[i]);
 }
 
 void largestValue()
 {
  int largest=arr[0],pos=0;
  for(int i=0;i<10;i++)
   if(largest<arr[i])
    {
	 largest=arr[i];
	 pos=i;
	}
 System.out.println("Largest value is "+largest+" at position "+pos+".");
 }

 void displayAverage()
 {
  int sum=0;
  float avg;
  for(int i=0;i<10;i++)
   sum+=arr[i];
  avg=((float)(sum))/10 ;
  System.out.println("Average = "+avg);
 }
 
 void sortArray()
 {
  for(int i=0;i<10;i++)
  for(int j=i+1;j<10-i-1;j++)
  if(arr[i]>arr[j])
   {
    int temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
   }
 }
}


class ArrayMain
{
 public static void main(String ar[])
 {
  Array A=new Array();
  A.largestValue();
  A.displayAverage();
  A.sortArray();
  A.displayArray();
 }
}
  