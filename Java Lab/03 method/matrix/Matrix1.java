import java.io.*;
import java.util.*;
class Matrix1{
	public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
	int i,j;
	System.out.print("Enter the no of rows = ");
	int r=sc.nextInt();
	System.out.print("Enter the no of columns = ");
	int c=sc.nextInt();
	int a[][] = new int[r][c];	

	//for reading the matrix elements
	System.out.println("Enter the array elemnts");
	for(i=0;i<r;i++){
		for(j=0;j<c;j++){
			a[i][j]=sc.nextInt();
		}
	}
	
	//for printing the matrix
	System.out.println("The matrix a[i][j]");
	for(i=0;i<r;i++){
		for(j=0;j<c;j++){
			System.out.print( + a[i][j] );
		}
	System.out.println();
	}
}}
