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
   class CreatingImplements implements Runnable{
	Thread t;
        CreatingImplements(String th){
           t =new Thread(this,th); 
          t.start();}      
public void run(){     
 System.out.println(""+ Thread.currentThread());
System.out.println("thread is running..."); 
}
}

class CreatingExtends extends Thread{  
    CreatingExtends(String st){
        super(st); 
    }
public void run(){  
System.out.println("thread is running...");
    System.out.println(""+ Thread.currentThread());
}  
}
class menu1{
public static void main(String args[]){ 
    System.out.println(""+ Thread.currentThread());
    Scanner sc = new Scanner(System.in);
    int ans=0;
    while(true){
        System.out.println("1.create new thread(using thread class) 2.create new thread(using runnable)   elseExit");
        ans = sc.nextInt();
        if(ans==1){
            System.out.println("Enter thread name");
            String th = sc.next();
        CreatingExtends t1=new CreatingExtends(th);  
        t1.start();  
        }
        else if(ans==2){      
            System.out.println("Ente1"
                    + "r thread name");
            String th = sc.next();
            CreatingImplements m1=new CreatingImplements(th);  
        }
        else {
            return ;
        }
     }  
             
}

    }
