package lab_7;
import java.util.*;

class NFE{
      public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter a string");
          String a = sc.next();
        
          try{
             int x = Integer.parseInt(a);
          }
          catch(NumberFormatException e){
              System.out.println("error"+e);
          }
          
          System.out.println("rest of the program...");              
          }
        

      }
