import java.io.*;
import java.util.*;
class G{
	int a,b,c;
	void add(int a,int b){
		int sum = a+b;
		System.out.println(sum);
	}
	void add(float a,float b,float c){
		float sum = a+b+c;
		System.out.println(sum);
	}
}
class OOP6{
	public static void main(String args[]){
	G o1 = new G();
	o1.add(1,2);
	o1.add(1,2,5);
}}
