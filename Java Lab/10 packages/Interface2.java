import java.util.*;
interface A{
	void sum();
}interface B{
	void dif(int num1, int num2);
}
class Q implements A{
	public void sum(){
		Scanner sc = new Scanner(System.in);
		System.out.print("num1 = ");
		int a = sc.nextInt();
		System.out.print("num2 = ");
		int b = sc.nextInt();
		int sum = a+b;
		System.out.println("Sum = "+sum);
	}
}
class P implements A,B{
	public void sum(){
		Scanner sc = new Scanner(System.in);
		System.out.print("num1 = ");
		int a = sc.nextInt();
		System.out.print("num2 = ");
		int b = sc.nextInt();
		int sum = a+b;
		System.out.println("Sum = "+sum);
	}
	public void dif(int x,int y){
		int d = x-y;
		System.out.println("Difference = "+d);
	}
}
class Interface2{
public static void main(String args[]){
	Q obj = new Q();
	obj.sum();
	P obj2 = new P();
	obj2.sum();
	obj2.dif(2,1);
}}
