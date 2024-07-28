/*import java.io.*;
class GB{
    public static int count = 0;
    Test(){
        count+=1;
    }

    Runtime rs = Runtime.getRuntime();
    System.out.println("Free memory in JVM = "+rs.freeMemory());
    rs.gc();
    System.out.println("Free memory in JVM = "+rs.freeMemory());

    Test obj1 = new Test();
    System.out.println("No of objects = "+(Test.count));
    Test obj2 = new Test();
    System.out.println("No of objects = "+(Test.count));

    obj1 = null;
    obj2 = null;
    rs.gc();

    protected void finalize(){
        System.out.println("program to terminate");
    }
}
*/
class Garbage{
    public void finalize(){
        System.out.println("Garbage collected");
        System.out.println();
}}

class GC{
    public static void main(String args[]){
        Garbage obj1 = new Garbage();
        obj1 = null;
        System.gc();
}}
