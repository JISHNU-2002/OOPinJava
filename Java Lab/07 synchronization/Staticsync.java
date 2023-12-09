class Table{   	
	synchronized static void printTable(int n){  
		for(int i=1;i<=10;i++){  
			System.out.println(n*i);  
			try{   	
				Thread.sleep(400);  
			}catch(Exception e){
			}    	
		}
	}
}  

class MyThread1 extends Thread{
	Table t;
	MyThread1(Table obj){
		this.t=obj;
	}
	public void run(){  
		t.printTable(1);  
	}
}  

class MyThread2 extends Thread{
	Table t;
	MyThread2(Table obj){
		this.t=obj;
	}
	public void run(){  
		t.printTable(10);  
	}
}  

class MyThread3 extends Thread{  
		Table t;
		MyThread3(Table obj){
			this.t=obj;
		}
		public void run(){  
			t.printTable(100);  
		} 
}  

class MyThread4 extends Thread{  
	Table t;
	MyThread4(Table obj){
		this.t=obj;
	}
	public void run(){  
		t.printTable(1000);  
	}
}  
		
public class Staticsync{  
	public static void main(String t[]){
		Table obj1=new Table();
		Table obj2=new Table();
		MyThread1 t1=new MyThread1(obj1);  
		MyThread2 t2=new MyThread2(obj1);  
		MyThread3 t3=new MyThread3(obj2);  
		MyThread4 t4=new MyThread4(obj2);  
		t1.start();  
		t2.start();  
		t3.start();
		t4.start();
	
	}  
} 


