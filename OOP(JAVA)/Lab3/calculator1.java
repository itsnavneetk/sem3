import java.util.*;
class Calc{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a,b; 
		System.out.println("Enter two numbers");
		a = sc.nextFloat();
		b = sc.nextFloat();
		char c;
		System.out.println("Enter operation or '$' to exit " );
		
		
loop: while(true){
		c = sc.next().charAt(0);

		switch (c) {
			case '+' :{
				System.out.println("Sum of two nos. are : "+ (a+b));
				break ;
			}

			case '-' :{
				System.out.println("Diff of two nos. are : "+ (a-b));
				break;
			}

			case '*' :{
				System.out.println("Product of two nos. are : "+(a*b));
				break;
			}
			
			case '/' :{
				System.out.println("Division of two nos. are : "+(a/b));
				break;
			}
			case '$' :{
				System.out.println(" ");
				break loop;
			}
			
			default:{
				System.out.println("Invalid operation. Please try again");
			}
				
		}		
}
	}
}