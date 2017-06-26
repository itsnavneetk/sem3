import java.util.*;


abstract class area{

	int l, b, r;
	float area;

	final static float pi = 3.14f;

	abstract void disp();
	

}

class circle extends area{

	circle(int r)
	{
		this.r = r;
	}

	void disp()
	{	
		area = pi*r*r;
		System.out.println("Area ="+area);
	}

}

class rect extends area{

	rect(int i, int j)
	{
		l = i;
		b = j;
	}

	void disp()
	{
		area = l*b;
		System.out.println("Area ="+area);
	}	

}

class p2{

	public static void main(String ar[])
	{	
		Scanner in = new Scanner(System.in);

		int l, b, r;

		String shape;

		System.out.println("Enter the shape");

		shape = in.next();

		area a1;

		if(shape.equals("circle"))
		{
			System.out.println("Enter the radius");

			r = in.nextInt();

			a1 = new circle(r);

		}
		else
		{
			System.out.println("Enter length and breath");

			l = in.nextInt();
			b = in.nextInt();

			a1 = new rect(l, b);

		}

		a1.disp();
	

	
	}





}