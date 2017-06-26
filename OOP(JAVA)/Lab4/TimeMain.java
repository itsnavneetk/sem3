import java.util.Scanner;

class Time
{
	int hr,min,sec;

	Time()
	{
		hr=min=sec=0;
	}

	Time(int h, int m, int s)
	{
		hr=h;
		min=m;
		sec=s;
	}

	void display()
	{
		System.out.print(hr+":"+min+":"+sec);
	}

	void add(Time T1, Time T2)
	{
		sec=T1.sec+T2.sec;
		if(sec/60!=0)
		{
			min+=sec/60;
			sec%=60;
		}
		min=min+T1.min+T2.min;
		if(min/60!=0)
		{
			hr+=min/60;
			min%=60;
		}
		hr=hr+T1.hr+T2.hr;
	}
}

class TimeMain
{
	public static void main(String[] ar)
	{
		Scanner in=new Scanner(System.in);
		int hr,min,sec;
		System.out.println("Enter Time 1:");
		System.out.print("H:\t"); hr=in.nextInt();
		System.out.print("M:\t"); min=in.nextInt();
		System.out.print("S:\t"); sec=in.nextInt();
		Time T1=new Time(hr,min,sec);

		System.out.println("Enter Time 2:");
		System.out.print("H:\t"); hr=in.nextInt();
		System.out.print("M:\t"); min=in.nextInt();
		System.out.print("S:\t"); sec=in.nextInt();
		Time T2=new Time(hr,min,sec);

		Time T3=new Time();
		T3.add(T1,T2);

		System.out.print("\nTime 3 = ");
		T3.display();
	}
}
