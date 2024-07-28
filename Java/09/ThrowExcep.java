import java.io.*;
class ThrowExcept{
    static void method() throws FileNotFoundException{
        System.out.println("inside method");
        throw new FileNotFoundException();
    }
    public static void main(String args[]){
        try{
            method();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
    }
}