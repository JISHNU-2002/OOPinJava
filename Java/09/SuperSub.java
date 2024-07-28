import java.io.*;
class ThrowExcept{
    public static void main(String args[]){
        Sub obj1 = new Sub();
        obj1.method();
    }
}

class Super{
    void method() throws IOException{
        System.out.println("inside method Superclass");
        FileInputStream fs = new FileInputStream("Super.txt");
    }
}

class Sub extends Super{
    void method() throws FileNotFoundException{
        System.out.println("inside method Subclass");
        FileInputStream fs = new FileInputStream("Sub.txt");
    }
}
 