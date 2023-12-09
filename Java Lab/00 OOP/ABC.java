//import java.io.*;
import java.util.*;
class Q{
	double width;
	double height;
	double depth;
	double Volume; //instance variables
	void volume(double a, double b, double c){
		a = this.width;
		b = this.height;
		c = this.depth;
		//method
		//double volume; - local variable
		Volume = a*b*c;
		System.out.println("Volume is = "+Volume); 
}}
class ABC{
	//main class
	public static void main(String args[]){
	System.out.println("OOP JAVA PROGRAM USING CLASS AND METHOD");	
	Q obj1 = new Q(); //creating object 1
	Q obj2 = new Q(); //creating object 2
	obj1.width = 10; //initializing variables
	obj1.height = 20;
	obj1.depth = 30;
	obj1.volume(); //method call for finding volume of first object 
	
	obj2.width = 40; 
	obj2.height = 50;
	obj2.depth = 60;
	obj2.volume(); //method call for finding volume of second object
}}


	
