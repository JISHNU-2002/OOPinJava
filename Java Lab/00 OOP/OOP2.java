import java.io.*;
import java.util.*;
class B{
	double w,h,d;//inst variable
	double volume(){
	//method that returns a value
	return w*h*d;
}}
class OOP2{
	public static void main(String args[]){
	System.out.println("OOP JAVA PROGRAM USING METHOD THAT RETURNS A VALUE");
	double vol;

	B o1 = new B();
	o1.w=10;
	o1.h=20;
	o1.d=30;
	vol=o1.volume();
	System.out.println("The volume of first object = "+vol);
	
	B o2 = new B();
	o2.w=40;
	o2.h=50;
	o2.d=60;
	vol=o2.volume();
	System.out.println("The volume of second object = "+vol);
}}
