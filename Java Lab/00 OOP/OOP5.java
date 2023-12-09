import java.io.*;
import java.util.*;
class F{
	int a,b,c; //inst variables
	Scanner sc =new Scanner(System.in); 
	void sum(//int a, int b){ //1st method
		System.out.print("Enter a = "+ a);
		int a = sc.nextInt();
		System.out.print("Enter b = " +b);
		int b = sc.nextInt();
		int sum = a+b;
		System.out.println("The sum in 1st = " + sum);
	}
	void sum(//int a,int b,int c){ //2nd same method
		System.out.print("Enter a = "+ a);
		int a = sc.nextInt();
		System.out.print("Enter b = "+ b);
		int b = sc.nextInt();
		Systm.out.print("Enter c = "+ c);
		int c = sc,nextInt();
		int sum=a+b+c;
		System.out.println("The sum in 2nd = " + sum);
	}
}
class OOP5{
	public static void main(String args[]){
		System.out.println("METHOD OVERLOADING");
		System.out.println("We can call two or more dif methods in same name but with dif arguments");
		F o1= new F();
		o1.sum();
}}
