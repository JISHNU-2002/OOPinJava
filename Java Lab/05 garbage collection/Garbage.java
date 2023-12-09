import java.io.*;
class GC{
    public void finalize(){
    System.out.println("Garbage collected");
    System.out.println();
}}
class Garbage{
    public static void main(String args[]){
    GC obj1 = new GC();
    obj1 = null;
    System.gc();
}}
