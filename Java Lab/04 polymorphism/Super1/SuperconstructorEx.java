import java.io.*;
class A{
    A(){
        System.out.println("Inside class A non argument constructor");
    }
    A(int a){
        int d = a+20;
        System.out.println("d = "+d);
    }
}
class B extends A{
    B(){
        System.out.println("Inside class B non argument constructor");
    }
    B(int b){
        int c =b+25;
        System.out.println("c = "+c);
    }
}
class SuperconstructorEx{
    public static void main(String args[]){
        B obj1 = new B();
        B obj2 = new B(10);
        A obj3 = new A();        
        A obj4 = new A(10);

    }
}