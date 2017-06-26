import java.util.*;
class array{
    public static void main(String[] args) {
        int i,temp=0,m,temp1;
      
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        m = sc.nextInt();
        int[] a = new int[m];
        
        for(i=0;i<m;i++){
            a[i] = sc.nextInt();
        }
        
        temp=a[0];
        temp1=a[0];
        for(i=1;i<m;i++){
            if(a[i]>temp){
               temp=a[i];
            }      
            if(a[i]<temp1){
                temp1 = a[i];
            }
        }
            System.out.println("Largest number: ");
            System.out.println(temp);
            System.out.println("Smallest number: " + temp1);
        
        
        
    }
}