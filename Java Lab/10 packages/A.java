package mypackage;
class B{
	int x,y;
	B(int num1,int num2){
		x=num1;
		y=num2;
		System.out.println("Package Program example");
	}
	int sum(){
		return (x+y);
		//System.out.println("Sum = "+sum);
}}
class A{
public static void main(String args[]){
	B obj = new B(1,2);
	System.out.println(obj.sum());
}}

