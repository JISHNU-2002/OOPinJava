import java.io.*;
import java.util.*;
class String_Tokenizer{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the numbers(with space)");
	String num = sc.nextLine();
	System.out.println();
	int sum = 0;
	StringTokenizer s = new StringTokenizer(num," ");
	while(s.hasMoreTokens()){
		int b = Integer.parseInt(s.nextToken());
		System.out.println(b);
		sum = sum + b;
	}
	System.out.println("\nSum = "+sum);
}}
