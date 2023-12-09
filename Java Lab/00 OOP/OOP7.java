import java.io.*;
class H{
	double height,width,depth;
	void volume(double height,double width,double depth){ //method
		double vol = height*width*depth;
		System.out.println(volume);
	}
	H{ // constructor
		double height = 1;
		double width = 1;
		double depth = 1;
	}
	H(double h,double w,double d){
		h = height;
		w = width;
		d = depth;
	}
}
class OOP7{
	public static void main(String args[]){
	System.out.prinln("CONSTRUCTOR OVERLOADING");
	H o1 = new H(1);
	H o2 = new H(1,2,3);
	H o3 = new H(2);
	double vol;
	vol = o1.volume();
	vol = o2.volume();
	vol = o3.volume();
}}
