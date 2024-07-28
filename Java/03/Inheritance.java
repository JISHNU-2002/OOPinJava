class Inheritance{
    public static void main(String args[]){
        A obj1 = new A();
        B obj2 = new B();
        obj1.num1 = 34;
        obj1.num2 = 56;
        obj1.displayA();

        obj2.num1 = 45;
        obj2.num2 = 67;
        obj2.num3 = 78;
        obj2.displayA();
        obj2.displayB();
        obj2.sum();
    }
}

class A{
    int num1,num2;
    A(){
        System.out.println("A constructor");
    }

    void displayA(){
        System.out.println("num1 = "+num1+" num2 = "+num2);
    }
}

class B extends A{
    B(){
        System.out.println("B constructor");
    }

    int num3;
    void displayB(){
        System.out.println("num3 = "+num3);
    }

    void sum(){
        System.out.println("sum = "+(num1+num2+num3));
    }
}