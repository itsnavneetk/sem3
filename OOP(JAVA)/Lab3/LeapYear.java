import java.util.*;

class LeapYear{
	public static void main(String[] args) {
		int year,i,j;
		boolean flag=false;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year");
		year = sc.nextInt();
		if(year%4==0 || year%100==0 || year%400==0){
			flag = true;

		}
		if(flag){
			System.out.println(year+" is a leap year");
		}
		else{
			System.out.println(year + " is not a leap year");
		}
	}


}