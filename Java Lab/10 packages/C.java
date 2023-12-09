package mypackage2;
class Package{
	Package(){
		System.out.println("Package Inheritance program");
	}
	void sum(int a,int b){
		int sum = a+b;
		System.out.println("Sum = "+sum);
	}
}
class D extends Package{
	int c,d;
	D(int num3,int num4){
		c = num3;
		d = num4;
		System.out.println("Inherited class");
		System.out.println("num1 = "+c+"\n"+"num2 = "+d);
	}
	void display(){
		System.out.println("Inherit method");
		Package obj = new Package();
		obj.sum(1,2);
	}
}
class C{
public static void main(String args[]){
	D obj2 = new D(2,3);
	obj2.display();
	obj2.sum(11,22);
}}
