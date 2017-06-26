package multiThreading;

class Run1 implements Runnable{
	public void run(){
		
		System.out.println("inside thread");
		
	}
}


public class Meth {

	public static void main(String[] args) {
		
		Run1 obj2 = new Run1(); 
		Thread t1 = new Thread(obj2);
		t1.start();
		System.out.println(t1.isAlive());
		System.out.println(" new :"+t1);
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(t1.isAlive());

	}

}
