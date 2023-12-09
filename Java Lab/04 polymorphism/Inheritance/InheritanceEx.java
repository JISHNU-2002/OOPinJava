import java.io.*;
import java.util.*;
class InheritanceEx{
    Scanner sc = new Scanner(System.in);
    int a3 = sc.nextInt();
    int b3 = sc.nextInt();
    InheritanceEx(int x,int y){
        System.out.println("Main class constructor checking this key word");
        System.out.println("a3 GV assigning value of LV x");        
        this.a3 = x;
        System.out.println("a3 = "+this.a3);

        System.out.println("y LV assigning value of GV b3");
        y= this.b3;
        System.out.println("y = "+this.b3);
    }
    void product(int num5,int num6){
        int p = num5*num6;
        System.out.println("Product = "+p);
    }
    void div(int num7,int num8){
        int div = num7/num8;
        System.out.println("Quoscient = "+div);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of x in constructor Main = ");
        int x = sc.nextInt();
        System.out.print("Enter value of y in constructor Main = ");
        int y = sc.nextInt();
        System.out.println("Enter values of Global variables in class A");
        InheritanceEx obj = new InheritanceEx(x,y);

        System.out.print("Enter value of a in constructor A = ");
        int k = sc.nextInt();
        System.out.print("Enter value of b in constructor A = ");
        int l = sc.nextInt();
        System.out.println("Enter values of Global variables in class A");
        A a = new A(k,l);

        System.out.print("Enter value of c in constructor B = ");
        int m = sc.nextInt();
        System.out.print("Enter value of d in constructor B = ");
        int n = sc.nextInt();
        System.out.println("Enter values of Global variables in class B");
        B b = new B(m,n);

        System.out.println("Enter the numbers to find sum");
        System.out.print("Enter first number = ");
        int q = sc.nextInt();
        System.out.print("Enter second number = ");
        int w = sc.nextInt();
        a.sum(q,w);

        System.out.println("Enter the numbers to find difference");
        System.out.print("Enter first number = ");
        int e  = sc.nextInt();
        System.out.print("Enter second number = ");
        int r = sc.nextInt();
        b.difference(e,r);

        System.out.println("Enter the numbers to multiply");
        System.out.print("Enter first number = ");
        int t  = sc.nextInt();
        System.out.print("Enter second number = ");
        int u = sc.nextInt();
        obj.product(t,u);

        System.out.println("Enter the numbers to divide");
        System.out.print("Enter first number = ");
        int i  = sc.nextInt();
        System.out.print("Enter second number = ");
        int o = sc.nextInt();
        obj.div(i,o);

        C c = new C();
        System.out.println("Enter two numbers to find modulus");
        System.out.print("Enter first number = ");
        int p  = sc.nextInt();
        System.out.print("Enter second number = ");
        int s = sc.nextInt();
        c.modulus(p,s);

        D ob = new D();
        ob.modulus(32,4);
    }
}
class A{
    Scanner sc = new Scanner(System.in);
    int a1 = sc.nextInt();
    int b1 = sc.nextInt();
    A(int a,int b){
        System.out.println("constructor A checking this key word");
        System.out.println("LV in constructor A assigning GV in class A");
        a = this.a1;
        b = this.b1;
        System.out.println("a = "+this.a1+"\nb = "+b);
    }
    void sum(int num1,int num2){
        int sum = num1+num2;
        System.out.println("Sum = "+sum);
    }
}
class B{
    Scanner sc = new Scanner(System.in);
    int a2 = sc.nextInt();
    int b2 = sc.nextInt();
    B(int c,int d){
        System.out.println("constructor B checking this key word");
        System.out.println("GV in class B assigning LV in constructor B");
        this.a2 = c;
        this.b2 = d;
        System.out.println("a2 = "+a2+"\nb2 = "+this.b2);
    }
    void difference(int num3,int num4){
        int dif = num3-num4;
        System.out.println("Difference = "+dif);
    }
}
class C{
    C(){
        System.out.println("Do you want to know my name...?");
    }
    C(int n1){
        System.out.println("Inside class C argument constructor");
    }
    void modulus(int num9,int num10){
        int mod = num9 % num10;
        System.out.println("Modulus = "+mod);
    }
}
class D extends C{
    D(){
        System.out.println("My name is Spiderman");
    }
    D(int n2){
        System.out.println("Inside class D argument constructor");
    }
}