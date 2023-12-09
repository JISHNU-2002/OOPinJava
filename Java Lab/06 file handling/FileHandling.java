import java.util.*;
import java.io.*;
class FileHandling {
	public static void main(String[] args) {
	try{
		FileWriter fw = new FileWriter("Text.txt");
		fw.write("Hi There...\nwelcome to file handling \n \n");
		fw.close();
		FileReader fr = new FileReader("Text.txt");
		int i=0;
		while((i = fr.read()) !=- 1){
			System.out.print((char)i);
		}
		fr.close();
	}catch(Exception e){
		System.out.println("Exception occured");
	}
}}
