import java.io.*;
import java.util.*;

class Transpose{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int r1,c1,i,j;
        System.out.print("Enter no of rows = ");
        r1=sc.nextInt();
        System.out.print("Enter no of columns = ");
        c1=sc.nextInt();
        int a[][]=new int[r1][c1];
        System.out.println("Enter the elements of 1st matrix");
        
        for(i=0;i<r1;i++){
            for(j=0;j<c1;j++){
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("The original matrix");
        for(i=0;i<r1;i++){
            for(j=0;j<c1;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("The transpose matrix");
        for(i=0;i<r1;i++){
            for(j=0;j<c1;j++){
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
    }
}
