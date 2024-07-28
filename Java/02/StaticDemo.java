class StaticDemo{
    public static void main(String args[]){
        StaticVariable obj1 = new StaticVariable();
        StaticVariable obj2 = new StaticVariable();
        obj1.setValue(1,2);
        obj1.show();
        obj2.setValue(2,3);
        obj2.show();
        obj1.show();

        System.out.println("main block");
        StaticBlock obj3 = new StaticBlock();
        /*static{
            System.out.println("3rd static block");
        }*/
    }
    static{
            System.out.println("3rd static block");
    }
}

class StaticVariable{
    public static int a;
    private int b;

    void setValue(int num1,int num2){
        a = num1;
        b = num2;
    }

    void show(){
         System.out.println("static a = "+a+"\nnon-static b = "+b);
    }
}

class StaticBlock{
    StaticBlock(){
        System.out.println("Static block class default constructor");
    }

    static{
        System.out.println("\n1st static block");
    }

    static void staticMethod(){
        System.out.println("static block method");      
    }

    static{
        System.out.println("2nd static block");
        staticMethod();
    }
}