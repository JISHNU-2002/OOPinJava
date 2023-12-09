import java.io.*;
import java.util.*;
class Matrix3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter the order of 1st matrix: (row and column)");
		int r1 = sc.nextInt();
		int c1 = sc.nextInt();
		System.out.println("Enter the order of 2nd matrix: (row and column)");
		int r2 = sc.nextInt();
		int c2 = sc.nextInt();
		if(c1!=r2){
			System.out.println("Matrix multiplication not possible.\nExiting the program...");
			System.exit(0);
		}
		int a[][]=new int[r1][c1];
		int b[][]=new int[r2][c2];
		int c[][]=new int[r1][c2];
		System.out.println("Enter the first matrix row by row: ");
		for(int i=0;i<r1;i++){
			for(int j=0;j<c1;j++){
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the second matrix row by row: ");
		for(int i=0;i<r2;i++){
			for(int j=0;j<c2;j++){
				b[i][j]=sc.nextInt();
			}
		}

		for(int i=0;i<r1;i++){
			for(int j=0;j<c2;j++){
				c[i][j]=0;
				for(int k=0;k<r2;k++){
					c[i][j]+=a[i][k]*b[k][j];
				}			
			}
		}
		System.out.println("The product of 2 matrices is: ");
		for(int i=0;i<r1;i++){
			for(int j=0;j<c2;j++){
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

}
}
