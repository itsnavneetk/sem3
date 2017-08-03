import java.util.*;

class Menu1
{
	String s;
	String p;
	Scanner in=new Scanner(System.in);
	Menu1()
	{
		System.out.println("Enter a string");
		s=in.nextLine();
		p="";
		int i=0, l;
		l=s.length();
		while(i<l)
		{
			p=p+s.charAt(l-i-1);
			i++;
		}
	}
	boolean isPal()
	{
		if(s.equals(p))
		return (true);
		else
		return (false);
	}
	String Rv()
	{
		return (p);
	}
	String cnc()
	{
		System.out.print("length is "+2*s.length()+" and is ");
		return (s+p);
	}
	
	public static void main(String args[])
	{
		Menu1 obj=new Menu1();
		System.out.println("Please enter 1. Reverse string");
		System.out.println("Please enter 2. Check for palindrome");
		System.out.println("Please enter 3. Concatenate with reverse");
		System.out.println("Please enter 4. Print string alphabetically");
		int ch;
		Scanner sc=new Scanner(System.in);
		ch=sc.nextInt();
		switch(ch)
		{
			case 1: 	System.out.println("Reversed string is "+obj.Rv());
				break;
			case 2: 	if(obj.isPal())
				{
				System.out.println("Palindrome");
				break;
				}
				else 
				{
				System.out.println("Not a palindrome");
				break;
				} 
			case 3: 	System.out.print("Concateanted string has "+obj.cnc());
				break;
			case 4: 	break;
		}
	}
}