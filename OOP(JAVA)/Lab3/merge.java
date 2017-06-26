import java.util.*;
class mergeArray{
    public static void main(String[] args){
        int n,m,i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dimensions of matrix: ");
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] a = new int[m][n];
        int[][] b = new int[m][n];
        int[][] c = new int[m+m][n+n];
        System.out.println("Enter matrix one: ");
        for(i = 0; i<m ; i ++){
		for(j=0; j<n; j++){
			a[i][j] = sc.nextInt();
			}
		}
        System.out.println("Enter matrix two: ");
        for(i = 0; i<m ; i ++){
		for(j=0; j<n; j++){
			b[i][j] = sc.nextInt();
			}
		}

System.out.println("Entered arrays :");

for(i = 0; i<m ; i ++){
			for(j=0; j<n; j++){
                            System.out.print(a[i][j]+ " ");
			}
                        System.out.println();
		}

for(i = 0; i<m ; i ++){
			for(j=0; j<n; j++){
                            System.out.print(b[i][j]+ " ");
			}
                        System.out.println();
		}


System.out.println("Merged matrix: ");

                for(i = 0; i<m ; i ++){
			for(j=0; j<n; j++){
                            c[i][j] = a[i][j];
                            c[i+m][j+n] = b[i][j];
			}
		}
                
System.out.println("Merged sorted matrix: ");

for(i = 0; i<m+m ; i ++){
			for(j=0; j<n+n; j++){
                            
                            System.out.print(c[i][j]+ " ");
			}
                        System.out.println();
		}


    }
}