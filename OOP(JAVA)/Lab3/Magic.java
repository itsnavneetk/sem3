import java.util.*;
class MagicM{
	public static void main(String[] args) {
		int n,m,i,j,sumR=0,sumC=0,sumD=0,flag=0;
		Scanner s = new Scanner(System.in);
		m = s.nextInt();
		n = s.nextInt();
		int[][] a = new int[m][n];
		for(i = 0; i<m ; i ++){
			for(j=0; j<n; j++){
			a[i][j] = s.nextInt();
			}
		}

		for(i = 0; i<m ; i ++){
			sumR = 0;
			for(j=0; j<n; j++){
					sumR = sumR+ a[i][j];
			}
			    flag = 1;
      else {
         flag = 0;
         break;
      }
   }
			}
		}
		for(i = 0; i<m; i ++){
			sumC = 0;
			for(j=0; j<n; j++){
					sumC = sumC+ a[i][j];
				
			}
			    flag = 1;
      else {
         flag = 0;
         break;
      }
	if (flag == 1) {
		System.out.println("Magic square");
		
	}
	else{
		System.out.println(" not Magic square");
	}
	}
