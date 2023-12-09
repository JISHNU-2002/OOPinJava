import java.io.*;
import java.util.*;
class Matrix2{
	public static void main(String args[]){
	int i,j,p,q;
	Scanner sc=new scanner(System.in);
	System.out.print("Enter the no of rows = ");
	int r=sc.nextInt();
	System.out.print("Enter the no of columns = ");
	int c=sc.nextInt();
	int a[][]=new int[r][c];
	int b[][]=new int[r][c];
	
	System.out.println("Enter the first matrix elements");
	for(i=0;i<r;i++){
		for(j=0;j<c;j++){
			a[i][j]=sc.nextInt();
		}
	}

	System.out.println("Enter the second matrix elements");
	for(p=0;p<r;p++){
		for(q=0;q<c;q++){
			b[p][q];
		}
	}
	
	System.out.println("The matrix a[i][j]");
	for(i=0;i<r;i++){
		for(j=0;j<c;j++){
			System.out.println( + a[i][j]);	
		}
	System.out.print();
	}

