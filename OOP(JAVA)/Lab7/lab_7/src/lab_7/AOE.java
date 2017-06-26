package lab_7;
import java.util.*;


class ArrayOverflowException extends Exception{  
 ArrayOverflowException(String i){  
  super(i);  
 }  
}  

public class AOE {
    
    
       static void validate(int size)throws ArrayOverflowException{  
     if(size<5)  
      throw new ArrayOverflowException("not valid");  
     else  
      System.out.println(" ");  
        }    
    public static void main(String args[]){
        int size=4;
        int[] data = {10,20,30,40};
        System.out.println(data[0]+" "+data[3]);
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter data after 40 : ");
            int x = sc.nextInt();
            data[4]=x;
            size++;
            validate(size);
            System.out.println("data after 40 : "+data[4]);
        }
        catch(Exception e){
            System.out.println("overflow ");
        }
        finally{
            System.out.println("Exit");
        }
    }
            
}
