/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_8;

import java.util.Scanner;

/**
 *
 * @author student
 */

class CreatingExtends1 extends Thread{  
    CreatingExtends1(String st){
        super(st); 
    }
public void run(){  
System.out.println("thread is running...");
    System.out.println(""+ Thread.currentThread());
    System.out.println(isAlive());

    
    
}
}  


public class AliveJoin {
    public static void main(String args[]){ 
    System.out.println(""+ Thread.currentThread());
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter thread name");
        String th = sc.next();
        CreatingExtends1 t1=new CreatingExtends1(th);  
        t1.start();  
        
           
    }
}
