import java.util.*;
class M{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	try{
		System.out.print("Enter 1st number = ");
		int a = sc.nextInt();
		System.out.print("Enter 2nd number = ");
		int b = sc.nextInt();
		int c = a/b;
	}catch(ArithmeticException e){
		System.out.println(e);
		System.out.println("Rest of code...");
	}
	System.out.print("Enter another number = ");
	int c = sc.nextInt();
	System.out.print("Enter another number = ");
	int d = sc.nextInt();
	int f = c/d;
	System.out.println("Div = "+f);	
}}
		
