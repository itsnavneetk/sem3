import java.util.*;


class rectangle{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter length \n");
	double l = sc.nextDouble();
	System.out.println("Enter breadth \n");
	double b = sc.nextDouble();

	double area,circum;
	

	area = l*b;
	circum = 2*(l+b);

	System.out.println("area of the entered rectangle is "+ area +"\n" + "circumference =" +circum);
 }
}