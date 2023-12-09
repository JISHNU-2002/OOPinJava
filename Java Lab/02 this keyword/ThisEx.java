import java.io.*;
import java.util.*;
class ThisEx {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    ThisEx(int c,int d){
        System.out.println("Constructor inside main class testing this keyword");
        System.out.println("Local variables inside main class constructor assigning the values of global variables in main class");
        c = this.a;
        d = this.b;
        System.out.println("value of c = "+c +"\nvalue of d = "+this.b);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of c local variable inside main class constructor = ");
        int k = sc.nextInt();
        System.out.print("Enter value of d local variable inside main class constructor = ");
        int l = sc.nextInt();
        System.out.println("Enter two values of Global vriables in Main class");
        ThisEx obj1 = new ThisEx(k,l);

        System.out.print("Enter value of num1 local variable inside Demo class constructor = ");
        int m = sc.nextInt();
        System.out.print("Enter value of num2 local variable inside Demo class constructor = ");
        int n = sc.nextInt();
        System.out.println("Enter two values of Global variables in Demo class");
        Demo obj2 = new Demo(m,n);
    }
}
class Demo{
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    Demo(int num1,int num2){
        System.out.println("Constructor inside Demo class testing this keyword");
        System.out.println("Global variables in Demo class assigning the values of local variables in Demo class constructor");
        this.x = num1;
        this.y = num2;
        System.out.println("value of x = "+this.x+"\nvalue of y = "+num2);
    }    
}