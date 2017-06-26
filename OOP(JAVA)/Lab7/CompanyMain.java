import java.util.*;
interface Company
{
 public void price();
 public double sales();
}
class Hardware implements Company
{
 String item;
 String origmanu;
 double price;
 Scanner in=new Scanner(System.in);
 Hardware()
 {
  item=null;
  origmanu=null;
  price=0.0;
 }
 void category()
 {
  System.out.print("enter the category of an item:");
  item=in.nextLine();
 }
void orimanu()
{
 System.out.print("the original manufacturer of that item is:");
 origmanu=in.nextLine();
}
public void price()
{
 System.out.print("enter the price:");
 price=in.nextDouble();
}
public double sales()
{
 return (3*price);
}
}
class Software implements Company
{
String type;
String os;

double price;
Scanner in=new Scanner(System.in);
Software()
{
	type=null;
	os=null;
	price=0.0;
}

void type()
{
	System.out.print("enter the type of software:");
	type=in.nextLine();
}

void os()
{
	System.out.print("enter the operating system:");
	os=in.nextLine();
}

public void price()
{
	System.out.print("enter the price:");	
	price=in.nextDouble();
}

public double sales()
{
	return (3*price);
}
}

class CompanyMain
{
public static void main(String args[])
{
	Hardware h=new Hardware();
	h.category();
	h.orimanu();
	Company c;
	c=h;
	c.price();
	c.sales();
	System.out.println("sales for hardware is:"+c.sales());
	Software s=new Software();
	s.type();
	s.os();
	c=s;
	c.price();
	c.sales();
	System.out.println("sales for software is:"+c.sales());
}
}