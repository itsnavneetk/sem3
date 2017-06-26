import java.util.*;

public class pattern{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
 		System.out.println("Enter a no. ");
 		int n = sc.nextInt();
 		int x=0;
 		for (int j=1; j<=n ;j++ ) {
 			x++;
 			for (int i = 1; i<=j ; i++ ) {
 					System.out.print(x + " ");
 				}
 				System.out.println();
 		}
	}
}