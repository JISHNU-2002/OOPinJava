interface A{
	void sum();
}
class Q implements A{
	public void sum(int a,int b){
		int sum = a+b;
		System.out.println("Sum = "+sum);
	}
}
class Interface_Demo{
public static void main(String args[]){
	Q obj = new Q();
	obj.sum(1,2);
}}
