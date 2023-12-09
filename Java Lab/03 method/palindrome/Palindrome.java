import java.io.*;
import java.util.*;
class Palindrome{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	String str;
	System.out.println("Enter the string = ");
	str = sc.nextLine();
	int n=str.length();
	for(int i=0;i<n;i++){
		if(str.charAt(i) != str.charAt(n-1-i)){
			System.out.println("The string is not palindrome");
			break;		
		}
		else{
			System.out.println("The string is palindrome");
			break;
		}
	}
}}
