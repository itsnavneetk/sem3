package multiThreading;

import java.util.Scanner;

class inherit extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("in class inherit");
		}
	}
	
}

class Run implements Runnable{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("in Run");
		}
		
	}
}


public class MT {
	public static void main(String[] args) {
		
		System.out.println("Create thread \n 1.Inheriting thread class 2.Runnable interface");
		Scanner sc = new Scanner(System.in);
		int ans = sc.nextInt();
		if(ans==1){
		inherit obj1 = new inherit();
		obj1.start();
		}
		else{
		Run obj2 = new Run(); 
		Thread t1 = new Thread(obj2);
		t1.start();
		}		

	}

}
