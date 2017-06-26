import java.util.*;
class MagicM{
	public static void main(String[] args) {
		int n,m,i,j,sumD=0,sumSd=0,flag=0,flag1=0,flag3=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter dimensions of matrix");
                m = s.nextInt();
		n = s.nextInt();
                
                System.out.println("Enter matrix");
		int[][] a = new int[m][n];
                int[] sumR = new int[m];
                int[] sumC = new int[m];
		for(i = 0; i<m ; i ++){
			for(j=0; j<n; j++){
			a[i][j] = s.nextInt();
			}
		}

		for(i = 0; i<m ; i ++){
			for(j=0; j<n; j++){
                		sumR[i] = sumR[i]+ a[i][j];
			}
                }
        for(i=0; i<m-1; i++){
                if (sumR[i]!=sumR[i+1]){
                    flag1=1;
                    break;
			
                }
        }
		for(i = 0; i<m; i ++){
			
			for(j=0; j<n; j++){
				sumC[i] = sumC[i]+ a[j][i];
				
			}
                }
        
        for(i=0; i<m-1; i++){
                if (sumC[i]!=sumC[i+1]){
                    flag=1;
                    break;
			
                }
        }       
             sumD =0;
                for(i=0;i<m;i++){
                    for(j=0;j<n;j++){
                        if(i==j){
                           sumD = sumD + a[i][j];
                        }
                        sumSd = sumSd + a[i][n-i-1];
                    }
                }        
                if(sumD != sumSd ){
                     flag3 = 1;
                }
                        
                        
	if (flag1 == 0 || flag == 0 || flag3==0) {
		System.out.println("Magic square");
		
	}
	else{
		System.out.println(" not Magic square");
	}
	}
}
       

