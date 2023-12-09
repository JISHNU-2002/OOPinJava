import java.io.*;
import java.util.*;
class meth{
    int sum;
    void sum(int num1,int num2){
        int sum = num1+num2;    
        System.out.println("sum = "+sum);
    }
}
class Method{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter s1.a = ");
        int a1 = sc.nextInt();
        System.out.print("Enter s1.b = ");
        int b1 = sc.nextInt();
        System.out.print("Enter s2.a = ");
        int a2 = sc.nextInt();
        System.out.print("Enter s2.b = ");
        int b2 = sc.nextInt();

        meth obj1 = new meth();
        meth obj2 = new meth();

        obj1.sum(a1,b1);
        obj2.sum(a2,b2);
    }
}
