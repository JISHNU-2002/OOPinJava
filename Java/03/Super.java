class A{
    A(){
        System.out.println("A constructor");
    }

    A(int a){
        System.out.println("A constructor with value = "+a);
    }
}

class B extends A{
    B(){
        System.out.println("B constructor");
    }

    B(int b){
        super(100);
        System.out.println("B constructor with value = "+b);
    }
}

class C extends B{
    C(){
        System.out.println("C constructor");
    }

    C(int c){
        super(10);
        System.out.println("C constructor with value = "+c);
    }
}

class Super{
    public static void main(String args[]){
        C obj1 = new C();
        C obj2 = new C(1);
    }
}