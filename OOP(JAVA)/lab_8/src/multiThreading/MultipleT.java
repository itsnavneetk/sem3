package multiThreading;

 class A implements Runnable {
	A(String s){
		Thread t = new Thread(s);
		t.start();
		System.out.println(" new :"+t);
	}
	public void run(){
		
	}
	
}

 class MultipleT {

	public static void main(String[] args) {
		 new A("1");
		 new A("2");
		 new A("3");
		 new A("4");
		
		

	}

}
