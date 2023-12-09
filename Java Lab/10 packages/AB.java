package mypackage5;
public class AB{
	public AB(){
		System.out.println("Package inheriting program");
	}
	public void sum(int num1,int num2){
		int sum = num1+num2;
		System.out.println("Sum = "+sum);
	}
	public void div(int num1,int num2){
		float div = num1/num2;
		System.out.println("Divider = "+div);
	}
}
