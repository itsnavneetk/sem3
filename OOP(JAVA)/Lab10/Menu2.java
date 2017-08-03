import java.util.*;

class Menu2
{
	Scanner in=new Scanner(System.in);
	String s,c;
	
	Menu2()
	{
		System.out.println("Enter two strings");
		s=in.nextLine();
		c=in.nextLine();
	}	
	void comp()
	{
		int i=s.compareTo(c);	
		if(i>0)
		System.out.println(s+" less than "+c);	
		if(i==0)
		System.out.println(s+" equal to "+c);	
		if(i<0)
		System.out.println(s+" greater than "+c);
	}
	void Up()
	{
		s=s.toUpperCase();
	}
	void Low()
	{
		s=s.toLowerCase();
	}
	boolean FindSub()
	{
		System.out.println("Enter the string to be found");
		c=in.nextLine();
		int l1=c.length();
		int l2=s.length();
		int i=0;
		while(i<l2-l1)
		{
		if(s.regionMatches(true, i, c, 0, l1))
		{
			System.out.println("Found!");
			return true;
		}
		else
		{
			i++;
			continue;
		}
		}
		return false;
	}
	void Hello()
	{
		if(FindSub())
		s=s.replaceFirst(c,"Hello");
	}
	void display()
	{
		System.out.println(s);
	}
	public static void main(String args[])
	{
		Menu2 obj=new Menu2();
		int ch;
		Scanner sc=new Scanner(System.in);
		char c='y';
		do
		{
		System.out.println("1.Compare");
		System.out.println("2.Convert to Lower");
		System.out.println("3.Convert to Upper");
		System.out.println("4.Find substring");
		System.out.println("5.Replace substring with Hello");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1: obj.comp(); break;
			case 2: obj.Low(); obj.display(); break;
			case 3: obj.Up(); obj.display(); break;
			case 4: boolean x=obj.FindSub(); break;
			case 5: obj.Hello(); obj.display(); break;
		}
		System.out.println("Do you wish to continue? y/n");
		c=sc.next().charAt(0);
		}while(c=='y');
	}
}