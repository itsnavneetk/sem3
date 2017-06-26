//Program to merge two arrays in a third array
//and to also sort it in Ascending order

import java.util.Scanner;

class ArrayMerge
{
 static int a[]=new int[5];
 static int b[]=new int[5];
 static int c[]=new int[10];
 
 void accept(int a[])
 {
 Scanner in=new Scanner(System.in);
  for(int i=0;i<a.length;i++)
	a[i]=in.nextInt();
 }
 
 void display(int a[])
 {
 for(int i=0;i<a.length;i++)
 System.out.print(a[i]+" ");
 } 
 
 void merge(int a[],int b[],int c[])
 {int i,j;
  for(i=0;i<a.length;i++)
  c[i]=a[i];
  
  for(j=i,i=0;i<b.length;j++,i++)
  c[j]=b[i];
 } 
 
 void sort(int a[])
 {int n=a.length;
  for(int i=0;i<n;i++)
  for(int j=i+1;j<n;j++)
  if(a[i]>a[j])
  {
   int temp=a[i];
   a[i]=a[j];
   a[j]=temp;
  }
 }
 
  
 public static void main(String[] ar)
 {
  ArrayMerge AM = new ArrayMerge();
  
  System.out.println("Enter 1D array A::");
  AM.accept(a);
  
  System.out.println("Enter 1D array B::");
  AM.accept(b);
  
  AM.merge(a,b,c);
  AM.sort(c);
  System.out.println("Merged and sorted Array C::");
  AM.display(c);
 }
}