class Cloning{
    public static void main(String args[]){
        Test obj1 = new Test();
        Test obj2;

        obj1.a = 1;
        obj1.b = 9;

        obj2 = obj1.cloneTest();
        System.out.println("obj1 a = "+obj1.a+" obj1 b = "+obj1.b);
        System.out.println("obj2 a = "+obj2.a+" obj2 b = "+obj2.b);

        obj1.a = 11;
        obj1.b = 99;

        System.out.println("obj1 a = "+obj1.a+" obj1 b = "+obj1.b);
        System.out.println("obj2 a = "+obj2.a+" obj2 b = "+obj2.b);
    }
}

class Test implements Cloneable{
    int a;
    double b;

    Test cloneTest(){
        try{
            return (Test)super.clone();
        }catch(CloneNotSupportedException e){
            System.out.println(e);
            return this;
        }
    }
}