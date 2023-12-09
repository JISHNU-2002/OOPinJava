//import java.io.*;
import java.util.*;
class A{
	double width,height,depth; //instance variables
	double volume;
	void volume(){
		//method
		//double volume; - local variable
		volume = width*height*depth;
		System.out.println("Volume is = "+volume); 
}}
class OOP1{
	//main class
	public static void main(String args[]){
	System.out.println("OOP JAVA PROGRAM USING CLASS AND METHOD");	
	A obj1 = new A(); //creating object 1
	A obj2 = new A(); //creating object 2
	obj1.width = 10; //initializing variables
	obj1.height = 20;
	obj1.depth = 30;
	obj1.volume(); //method call for finding volume of first object 
	
	obj2.width = 40; 
	obj2.height = 50;
	obj2.depth = 60;
	obj2.volume(); //method call for finding volume of second object
}}


	
