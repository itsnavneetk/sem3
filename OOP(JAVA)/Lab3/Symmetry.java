import java.util.*;
class Symm{
	public static void main(String[] args) {
		int n,m,i,j,flag=0;
		Scanner s = new Scanner(System.in);
		m = s.nextInt();
		n = s.nextInt();
		int[][] a = new int[m][n];
		for(i = 0; i<n ; i ++){
			for(j=0; j<m; j++){
			a[i][j] = s.nextInt();
			}
		}
			for(i = 0; i<n ; i ++){
			for(j=0; j<m; j++){
				if (a[i][j] != a[j][i]) {
					flag =1;
				}
			}
		}
		if (flag == 0){
			System.out.println("Entered matrix is symmetric");
		}
		else{
			System.out.println("Entered matrix is not symmetric");
		}

	}
}