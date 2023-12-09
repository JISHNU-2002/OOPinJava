class D{
	double w,h,d;
	// double width,height,depth;
	double volume(){
		return w*h*d;
	}
	D(double w,double h,double d){
		this.w=w;
		this.h=h;
		this.d=d;
		/*width=w;
		  height=h;
		  depth=d;*/
}}
class OOP4{
	public static void main(String args[]){
	System.out.println("JAVA PROGRAM USING CONSTRUCTORS");
	D o1= new D(10,20,30);
	double vol = o1.volume();
	System.out.println("Volume = "+vol);	
}}	
