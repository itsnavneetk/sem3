import java.util.*;

public class prime{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int flag =0;
		if (m<3) {
					System.out.println("2");
				}
				
		for(int i=m; i<n; i++){
			for(int j=2; j<i; j++){
				if(i%j==0){
					flag = 0;
					break;
				}
				else{
					flag =1;
				}

			}
			if (flag==1) {
				
				System.out.println(i);

			}
		}
	}
} 