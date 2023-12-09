import java.io.*;
import java.util.*;
import java.lang.*;
class Thread_Random extends Thread{
	int i,num = 0;
	public void run(){
	try{
		for(i=0;i<=5;i++){
			num = (int)(Math.random()*10);
			System.out.print("Random number = "+num+"and the corresponding output\n");
			if(num%2 !=0){
				Thread_Odd obj1 = new Thread_Odd();
				obj1.start();
			}else{
				Thread_Even obj2 = new Thread_Even();
				obj2.start();
			}
			Thread.sleep(1000);
		}
	}catch(InterruptedException e){
		System.out.println(e);
		System.out.println("exception handled");
	}
}}
