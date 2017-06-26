import java.util.*;
class PrimeArray{
    public static void main(String[] args){
        int i,j,flag=1,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array : ");
        for(i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Prime nos. in array are: ");
        for(i=0;i<n;i++){
            for(j=2;j<a[i];j++){
                    if(a[i]%j==0){
                        flag=0;
                        break;
                    }
                    else{
                        flag=1;
                    }
                }
            if(flag==1){
                System.out.println(a[i]);
            }       
        }
        
    }
}