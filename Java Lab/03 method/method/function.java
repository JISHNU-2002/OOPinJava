import java.io.*;
import java.util.*;
public class function {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("JAVA PROGRAM USING FUNCTION WITH ARGUMENT AND RETURN TYPE");    
        System.out.println("---------------------------------------------------------");
        System.out.print("Enter first number = ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number = ");
        int num2 = sc.nextInt();
        int result = sum(num1,num2);
        System.out.println("The sum = "+result);

    }
    static int sum(int a,int b){
        int sum = a+b;
        return sum;
    }
}
