import java.util.*;
class DiagSum{
	public static void main(String[] args) {
		int n,m,i,j,sum1=0,sum2=0;
		Scanner s = new Scanner(System.in);
		m = s.nextInt();
		n = s.nextInt();
		int[][] a = new int[m][n];
		for(i = 0; i<n ; i ++){
			for(j=0; j<m; j++){
			a[i][j] = s.nextInt();
			}
		}
		System.out.println("Entered matrix is : ");
		for(i=0; i<m ; i++){
			for (j=0; j<n; j++ ) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
		for(i=0; i<m ; i++){
			for (j=0; j<n; j++ ) {
			if(i==j){
				sum1 = sum1 +a[i][j];
			}
			else {
				sum2 = sum2 +a[i][j];
			}
		}
	}
		System.out.println("Pricipal sum : "+ sum1);
		System.out.println("Non diagonal sum : "+ sum2);
	}
	
}