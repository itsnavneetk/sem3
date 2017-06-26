import java.util.*;

class Data{
	public static void main(String[] args) {
		int i,i1,i2;
		double d,d1;
		char c,c1;
		byte b,b1,b2;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a integer");
		i = sc.nextInt();
		System.out.println("Enter a double");
		d = sc.nextDouble();
		System.out.println("Enter a character");
		c = sc.next().charAt(0);

		 b1 =(byte)i ;
		System.out.println(i +" type casted in byte is "+b1);
		i1 = (char)c;
		System.out.println(c +" type casted in int is "+i1);
		b2 = (byte)d;
		System.out.println(d +" type casted in byte is "+b2);
		i2 = (int)d;
		System.out.println(d +" type casted in byte is "+i2);

	}
}