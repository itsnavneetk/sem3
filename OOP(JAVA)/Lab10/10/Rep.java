import java.util.*;

class Rep
{
	Scanner in=new Scanner(System.in);
	String s;
	String r;
	String c;
	
	Rep()
	{
	System.out.println("Please enter a string");
	s=in.nextLine();
	
	System.out.println("Enter the letter whose repetitions you want replaced, and the string to replace it with");
	c=in.next();
	r=in.next();
	}
	
	void Find()
	{
		c=c+c;
		int i=0, l;
		l=s.length();
		int count=0;
		s=s.replaceAll(c,r);
	}
	void display()
	{
	System.out.println("The modified string is -"+s+"-");
	}
	
	public static void main(String args[])
	{
		Rep a=new Rep();
		a.Find();
		a.display();
	}
}