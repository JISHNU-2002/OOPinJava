import java.util.*;
public class AbstractEx2 {
    public static void main(String args[]){
        B b = new B();
        b.sum();
        C c = new C();
        c.sum();
        D d = new D();
        d.display();
        E e = new E();
        e.display();
    }
}
abstract class A{
    abstract void sum();
}
class B extends A{
    B(){
        System.out.println("class A is abstract - single inheritance - B from C\ninside class B\n");
    }
    void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number = ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number = ");
        int b = sc.nextInt();
        int sum1 = a+b;
        System.out.println("Sum1 = "+sum1+"\n");
    }
}
class C extends A{
    C(){
        System.out.println("class A is absract - single inheritance - C from A\nHierarchial inheritance - B and C from A\ninside class C\n");
    }
    void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number = ");
        int k = sc.nextInt();
        System.out.print("Enter the 2nd number = ");
        int l = sc.nextInt();
        int sum2 = k+l;
        System.out.println("Sum = "+sum2+"\n");
    }
}
class D extends C{
    D(){
        System.out.println("single inheritance D from C - inside class D");
    }
    void display(){
        System.out.println("calling super class/class C method sum() using super keyword");
        super.sum();
    }
}
class E extends D{
    E(){
        System.out.println("single inheritance - class E from D\nMultilevel inheritance - E from D from C from A\ninside class E\n");
    }
    void display(){
        System.out.println("calling super class/class D method display() using super keyword");
        super.display();
    }
}