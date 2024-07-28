class InterfaceDemo{
    public static void main(String args[]){
        One obj1 = new One();
        obj1.add(2,3);
        obj1.display();

        Two obj2 = new Two();
        obj2.sub(9,8);
        obj2.display();

        Demo obj3;
        obj3 = new One();
        obj3.display();

        obj3 = new Two();
        obj3.display();
    }
}

interface Demo{
    void display();
}

class One implements Demo{
    public int add(int x,int y){
        return x+y;
    }

    public void display(){
        System.out.println("interface method");
    }
}

class Two implements Demo{
    public int sub(int x,int y){
        return x-y;
    }

    public void display(){
        System.out.println("interface method java");
    }
}