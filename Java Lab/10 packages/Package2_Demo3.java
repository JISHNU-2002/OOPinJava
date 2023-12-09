package mypackage3;
import mypackage5.AB;
class ABC{
	ABC(){
		System.out.println("Package calling another");
	}
	void product(int num1,int num2){
		int p = num1*num2;
		System.out.println("Product = "+p);
	}
	void dif(int num1,int num2){
		int d = num1-num2;
		System.out.println("Difference = "+d);
	}
}
class Package2_Demo3{
public static void main(String args[]){
	mypackage5.AB obj = new mypackage5.AB();
	obj.sum(1,2);
	obj.div(11,22);
	ABC obj2 = new ABC();
	obj2.product(111,222);
	obj2.dif(1111,2222);
}}

