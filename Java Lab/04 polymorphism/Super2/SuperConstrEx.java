import java.io.*;
import java.util.*;
class SuperConstrEx {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        A a = new A();
        System.out.print("Enter 1st number = ");
        int k = sc.nextInt();
        System.out.print("Enter 2nd number = ");
        int l = sc.nextInt();
        a.sum1(k,l);

        B b = new B();
        b.display();
        System.out.print("Enter 1st number = ");
        int m = sc.nextInt();
        System.out.print("Enter 2nd number = ");
        int n = sc.nextInt();
        b.sum2(m,n);
        b.superDisplay();
        b.sum1(10,15);
    }
}
class A{
    int a = 10;
    A(){
        System.out.println("constructor call of A");
    }
    void display(){
        System.out.println("display function in class A");
    }
    void sum1(int num1,int num2){
        int sum = num1+num2;
        System.out.println("Sum = "+sum);
    }
}
class B extends A{
    int a = 20;
    B(){
        System.out.println("Constructor call of B");
    }
    void display(){
        System.out.println("Value of a = "+a);
        System.out.println("Value of a in super class/class A = "+super.a);
    }
    void sum2(int num1,int num2){
        int sum = num1+num2;
        System.out.println("Sum2 = "+sum);
    }
    void superDisplay(){
        super.display();
        super.sum1(21,345);
    }
}