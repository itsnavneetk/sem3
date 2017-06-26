package multiThreading;
class ExceP extends Thread{  
public void run(){  
try{  
Thread.sleep(100);  
System.out.println("task");  
}catch(InterruptedException e){  
System.out.println("Exception handled "+e);  
}  
System.out.println("thread is running...");  
}  
  
public static void main(String args[]){  
ExceP t1=new ExceP();  
t1.start();  
System.out.println(t1);  
t1.setPriority(2);
System.out.println(t1);

t1.interrupt();  
}  
}  