import java.util.*;
class occurence{
    public static void main(String[] args){
        int i,j,n,count=0,ele;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of array : ");
        n = sc.nextInt();
        int[] a = new int[n];
          for(i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
          System.out.println("Enter the element to be searched ");
          ele = sc.nextInt();
          for(i=0;i<n;i++){
               
              if(a[i]==ele){
                  
                  count=count+1;
                  
              }
          }
          if(count!=0){
            System.out.println("Element found - no. of occurence : ");
            System.out.println(count);
          }
          else{
            System.out.println("Element not found ");  
          }
    }
}