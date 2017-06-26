import java.util.*;

class BitOp{
	public static void main(String[] args) {
		int n,res=0,res1=0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		res = n>>1;
		System.out.println(n +" divided by 2 "+res);
		res1 = n<<1;
		System.out.println(n +" multiplied by 2 "+res1);
	}
}