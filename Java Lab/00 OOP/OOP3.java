import java.io.*;
import java.util.*;
class C{
	double width,height,depth;
	double volume(){
		return width*height*width;

	}
	C(double w, double h,double d){
	//void setDim(double w, double h,double d){ //setDim is basically a constructor
		width=w;
		height=h;
		depth=d;
}}
class OOP3{
	public static void main(String args[]){
	System.out.println("OOP JAVA PROGRAM USING METHOD THAT TAKING PARAMETERS");
	C a=new C(10.0,20.0,30.0);
	C b=new C(40.0,50.0,60.0);
	double vol;
	//a.setDim(10.0,20.0,30.0);
	vol=a.volume();
	System.out.println("The volume of the 1st object = "+vol);
	
	//b.setDim(40.0,50.0,60.0);
	vol=b.volume();
	System.out.println("The volume of the 2nd object = "+vol);
}}
