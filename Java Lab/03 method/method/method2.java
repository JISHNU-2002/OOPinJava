import java.io.*;
import java.util.*;
class sample{
    int sum;
    void sum(int num1,int num2){
        System.out.println("Printing in progress");
        sum=num1+num2;
    }
    void display(){
        System.out.println("Sum = "+sum);
    }
}
public class method2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number = ");
        int a=sc.nextInt();
        System.out.print("Enter second number = ");
        int b=sc.nextInt();
        sample obj = new sample();
        obj.sum(a,b);
        obj.display();
    }
}
