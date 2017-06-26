import java.util.*;

public class pattern1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
 		System.out.println("Enter a no. ");
 		int n = sc.nextInt();
 		int x=1;
 		for (int j=1; j<=n ;j++ ) {
 			for (int i = 1; i<=j ; i++ ) {
 					System.out.print(x + " ");
 					x++;
 				}
 				System.out.println();
 		}
	}
}