import java.io.*;
import java.util.*;
class freq{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string = ");
	String str;
	str = sc.nextLine();	
	int i=0;
	System.out.println("Enter the key = ");
	char key =str.charAt(0);	
	int count=0;
	for(i=0;i<str.length();i++){
		if(key==str.charAt(i)){
			count++;;
		}
	}
	if(count>0)	System.out.println("The frequency of key = "+count);
	else		System.out.println("Element not found");
}}
