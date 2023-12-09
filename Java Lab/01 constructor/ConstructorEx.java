class ConstructorEx{
    ConstructorEx(){
        System.out.println("Constructor inside main class");
    }
    public static void main(String args[]){
        ConstructorEx obj1 = new ConstructorEx();
        Demo obj2 = new Demo();
    }
}
class Demo{
    Demo(){
        System.out.println("Constructor inside Demo class");
    }
}