import java.io.*;
class Input_Reader{
	public static void main(String args[]){
	String text;
	InputStreamReader a = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(a);
	text = br.readLine() throws IOException;
	System.out.println(text);
}}
