import java.util.Scanner;

class Marks
{

static float Average(float m[])
{
 float av=0;
 for(int i=0;i<5;i++)
 {
  av+=m[i]/5;
 }
 return av;
}

static char Grade(float m)
{
 if(m<35) return 'F';
 else if(m<40) return 'E';
 else if(m<50) return 'D';
 else if(m<60) return 'C';
 else if(m<70) return 'B';
 else return 'A';
}
 

public static void main(String[] ar)
{
 float marks[] = new float[5];
 
 Scanner input=new Scanner(System.in);
 
 for(int i=0;i<5;i++)
 {
  System.out.print("Enter marks of Subject"+(i+1)+" - ");
  marks[i]=input.nextFloat();
 }
 
 float av=Average(marks);
 System.out.println("Average of marks = "+av);
 System.out.println("Grade obtained = "+Grade(av));
 
 }
}