import java.io.*;
import java.util.*;
class Sumarray{
public static void main(String args[]){
	Scanner sc =new Scanner(System.in);
	int i,sum=0;
	System.out.print("How many elements do you need = ");
	int n=sc.nextInt();
	int a[]=new int[n];
	for(i=0;i<n;i++){
		System.out.print("Enter the array element at index position a"+i);
		a[i] = sc.nextInt();
		sum=sum+a[i];
	}
	System.out.println("Sum of the array = "+sum);
}}

