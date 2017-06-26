import java.util.Scanner;

class Result
{
 int res[]= new int[3];
 int marks[][]=new int[3][3]; 
  
 void acceptMarks()
 {
  Scanner sc=new Scanner(System.in); 
  
  System.out.println("Enter Marks::\n");
  for(int i=0;i<3;i++)
	{
	 System.out.print("Student "+(i+1)+"\n");
	 for(int j=0;j<3;j++)
	  {
	   System.out.print("Subject "+(j+1)+" - ");
		marks[i][j]=sc.nextInt();
	  }
	}
 }
 
 void totalMarks()
 {
  for(int i=0;i<3;i++)
   for(int j=0;j<3;j++)
	res[i]+=marks[i][j];
 }
 
 void highestPerSubject()
 {
  for(int j=0;j<3;j++)
   {
    System.out.println("Student"+(j+1));
	int highest=marks[0][j];
	int rno=1;
	for(int i=1;i<3;i++)
	 if(highest<marks[i][j])
		{
		 highest=marks[i][j];
		 rno=i+1;
		}
	System.out.println("Highest in Subject "+(j+1)+" is "+highest+" by roll number "+rno+".");
   }
 }
 
 void highestTotalMarks()
 {
  int highest=res[0],rno=1;
  for(int i=1;i<3;i++)
   if(highest<res[i])
    {
	 highest=res[i];
	 rno=i+1;
	}
 System.out.println("Highest total marks are "+highest+" by roll number "+rno+".");
 }
}

class ResultMain
{
 public static void main(String[] ar)
 {
  Result R=new Result();
  R.acceptMarks();
  R.totalMarks();
  R.highestPerSubject();
  R.highestTotalMarks();
 }
}
 
 
 
   