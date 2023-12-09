import java.io.*;
import java.util.*;
class Thread_Synchronization{
	public static void main(String args[]){
	synchronized public void list(int num){
	try{
		for(i=num;i<num*10;i=i+num){
			System.out.println(i);
			Thread.sleep(1000);
		}
	}catch(InterruptedException e){
		Thread_Synchronization t1;
		Thread1(Thread_Synchronization t1){
			this.t1 = t1;
		}
		public void run(){
			t1.list(2);
		}
	}
	class Thread2 extends Thread{
		Thread_Synchronization t2;
		Thread2(Thread_Synchronization t2){
			this.t2 = t2;
		}
		public void run(){
			t2.list(3);
		}
	}
}}}
		
			
		
		
