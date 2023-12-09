import java.util.*;
class Exception{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	try{
		System.out.print("Enter 1st = ");
		int num1 = sc.nextInt();
		System.out.print("Enter 2nd = ");
		int num2 = sc.nextInt();
		System.out.println("num2 = "+num2+" Entering the loop");
		try{
			if(num2 == 1){
				System.out.println("inside 1st loop");
				System.out.print("\nEnter size of array = ");
				int n = sc.nextInt();
				int h[] = { n };
				h[42] = 99;
			}if(num2 == 2){
				System.out.println("inside 2nd loop");				
				int c = num1/(num2-num2);
			}if(num2 > 2){
				try{
					System.out.println("inside 3rd loop 1st section");
					System.out.print("Enter 1st = ");
					int num3 = sc.nextInt();
					System.out.print("Enter 2nd = ");
					int num4 = sc.nextInt();
					int c = num3/num4;
					System.out.println("inside 3rd loop 2nd section");
					System.out.print("\nEnter size of array = ");
					int j = sc.nextInt();
					int k[] = { j };
					k[42] = 99;
				}catch(ArithmeticException e){
					System.out.println(e);
				}catch(ArrayIndexOutOfBoundsException e){
				System.out.println(e);	
			}}
		}catch(ArithmeticException e){
			System.out.println(e);
		}
	}catch(ArrayIndexOutOfBoundsException e){
		System.out.println(e);
	}
	System.out.println("\nRest of code");
	System.out.print("Enter 1st = ");
	int num3 = sc.nextInt();
	System.out.print("Enter 2nd = ");
	int num4 = sc.nextInt();
	float f = num3/num4;
	System.out.println("divided = "+f);
}}
