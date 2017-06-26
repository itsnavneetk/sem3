import java.util.*;

 class series{

	static int fact(int n){
		int res=1;
		for(int i=1; i<=n; i++){
			res=res*i;
		}
		return res;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
 		System.out.println("Enter a no. ");
 		int x = sc.nextInt();
 		int n = sc.nextInt();
 		double result=0;
 		for (int i=0;i<n ;) {
 			for (int j=1;j<i ;j++ ) {
 				result = result + ((-1)^(i))*(x^(i+1)/fact(i+1));
 				i = i+2;
 			}
 		}

 		System.out.println("  " + result);


	}
}
