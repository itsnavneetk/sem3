package multiThreading;

import java.util.Scanner;

class call{
 synchronized void display(String msg){
        System.out.print("[");
        System.out.print(msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println("Error");
        }
        System.out.print("]"); } }
class myThread extends Thread{
    call t;
    String msg;
    public myThread(String threadName,call object,String message) {
        super(threadName);
        t=object;
        msg=message;
        start(); }
    public void run(){         
            t.display(msg); }}      
        
public class Synch{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("1. Synch method 2. Synch keyword");
       int ans = sc.nextInt();
    	if(ans==1){
    	call t1=new call();
        myThread obj1=new myThread("Thread 1",t1,"Hello");
        myThread obj2=new myThread("Thread 2",t1,"It-B");
        myThread obj3=new myThread("Thread 3",t1,"OOPs");
    	}else{
        
        
        call2 t2=new call2();
        myThread2 obj6=new myThread2("Thread 1",t2,"Hello");
        myThread2 obj5=new myThread2("Thread 2",t2,"It-B");
        myThread2 obj4=new myThread2("Thread 3",t2,"OOPs");
    	}
    }
}


class call2{
  void display(String msg){
        System.out.print("[");
        System.out.print(msg);
        try {            
            Thread.sleep(1000);
        } catch (InterruptedException ex) { 
            System.out.println("Error");         }
        System.out.print("]");    
  } }
class myThread2 extends Thread{
    call2 t;
    String msg;
    public myThread2(String threadName,call2 object,String message) {
        super(threadName);
        t=object;
        msg=message;
        start();     }
    public void run(){ 
        synchronized(t){
            t.display(msg);
        }         } }

