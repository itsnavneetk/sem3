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


class CreatingExtends2 extends Thread{  
    CreatingExtends2(String st){
        super(st); 
    }
public void run(){  
System.out.println("thread is running...");
    System.out.println(""+ Thread.currentThread());
}  
}

public class multiple {
    public static void main(String args[]){ 
    System.out.println(""+ Thread.currentThread());
    Scanner sc = new Scanner(System.in);
    int ans=0;
    while(true){
        System.out.println("1.create new thread(using thread class)   elseExit");
        ans = sc.nextInt();
        if(ans==1){
            System.out.println("Enter thread name");
            String th = sc.next();
        CreatingExtends2 t1=new CreatingExtends2(th);  
        t1.start();  }
          else {
            return ;
        }
     }  
             
}

}