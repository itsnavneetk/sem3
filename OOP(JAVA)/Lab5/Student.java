/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_5;
import java.util.*;
/**
 *
 * @author student
 */
public class Student {
    String regNo,name;
    int age;
    Scanner sc = new Scanner (System.in);
    
    void getData(){
        System.out.println("Enter student name ");
        name = sc.next();
        System.out.println("Enter registration no. ");
        regNo = sc.next();
        System.out.println("Enter age");
        age = sc.nextInt();
    }
    void disp(){
      
        System.out.println("Entered data : \n"+name+regNo+age);
        
    }
}

class UG extends Student{
    int fees=400000;
        int sem = sc.nextInt();
        Student ob = new Student();
        ob.disp(); 
     
}

class PG extends Student{
    int fees=800000;
  int sem;    
    void disp(){
        System.out.println("Enter semester : ");
        int sem = sc.nextInt();
        System.out.println("Entered data : \n"+name+regNo+age+"\n PG"+sem+"Rs."+fees);
        
    }

}

class MainS{
    public static void main(String args[]){
        Student ob = new Student();
        ob.getData();
        UG ob1 = new UG();
        PG ob2 = new PG();
                
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Course ");
        String course = s.next();
        if("UG".equals(course)){
              ob1.disp();
          }
        else{
            ob2.disp();
        }
    }
}
