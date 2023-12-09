import java.io.*;
import java.util.*;
class Charfreq{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	String str;
	System.out.print("Enter the string = ");
	str=sc.nextLine();
	System.out.print("Enter the character = ");
	int key = sc.next().charAt(0);
	int count=0;
	for(int i=0;i<str.length();i++){
		if(key==str.charAt(i)){
			count++;
		}
	}
	System.out.println("Frequency of the character = "+count);
}}
