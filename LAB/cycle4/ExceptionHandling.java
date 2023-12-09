import java.io.*;
import java.util.*;
class A{
	double n1,n2,q,p;
	A(double a,double b){
		n1=a;
		n2=b;
	}
	void divide() throws ArithmeticException{
		q=n1/n2;
		System.out.println(n1+"/"+n2+"="+q);
	}
	void multiply(){
		p=n1*n2;
		System.out.println(n1+"*"+n2+"="+p);
	}
}
class ExceptionHandling{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter first number  = ");
		double x=sc.nextDouble();
		System.out.print("enter second number = ");
		double y=sc.nextDouble();
		A obj=new A(x,y);
		try{
			obj.divide();
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		finally{
			obj.multiply();
		}
	}
}
