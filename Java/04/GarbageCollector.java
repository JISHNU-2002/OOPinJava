import java.util.*;
class GarbageCollector{
    public static void main(String args[]) throws Exception{
        Runtime rs = Runtime.getRuntime();
        System.out.println("Free memory in JVM = "+rs.freeMemory());
        rs.gc();
        System.out.println("Free memory in JVM = "+rs.freeMemory());
    }
}
