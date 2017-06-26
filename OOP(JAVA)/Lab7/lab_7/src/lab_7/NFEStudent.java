package lab_7;
import java.util.*;

class NFEStudent{
      public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the student's name ");
          String a = sc.next();
            
          System.out.print("roll: ");
                  int roll =sc.nextInt();
                 
          System.out.println("Enter marks in three subjects out of 10 ");       
        /*  int[] marks = new int[3];
          for(int i=0;i<3;i++){
              marks[i] = sc.nextInt();
          }
          */
          String s = sc.next();
             try{
                 
                 int x = Integer.parseInt(s);
            
              
               int total = x;
                System.out.println(total);
              
                 
          }
          catch(NumberFormatException e){
              System.out.println("error"+e);
          }
          
                  }
       
      }