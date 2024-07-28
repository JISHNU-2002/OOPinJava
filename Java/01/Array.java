import java.io.*;
import java.util.*;
class Array{
    public static void main(String args[]){
        int[] array_1={1,2,3};
        int i=0;
        for(i=0;i<array_1.length;i++){
            System.out.println(array_1[i]);
        }

        int array_2[] = {4,56,6};
        for(int ar : array_2){
            System.out.println(ar);
        }
        
        int t=0;
        for(i=0;i<array_1.length;i++){
            t = t+ array_1[i];
        }
        System.out.println("sum of array_1 = "+t);

        int max=0;
        for(i=0;i<array_2.length;i++){
            if(array_2[i]>max){
                max = array_2[i];
            }
        }
        System.out.println("max value in array_2 = "+max);

        int[] array_4 = new int[]{11,22,33,44};
        for(int x : array_4){
            System.out.println(x);
        }

        /*void display(int array[]){
            for(int i=0;i<array.length;i++){
                System.out.println(array[i]);
            }
            return 0;
        }
        display(array_2);

        public static int binarySearch(int[] a,int key);
        public static boolean equals(int[] a1, int[] a2);
        public static void fill(int[] a, int val);
        public static void sort(int[] a);

        public static int[] reverse(int[] list){
            int result = new int[list.length];
            for(int i=0,j=result.length-1;i<list.length;i++,j--){
                result[j] = list[i];
            }
            return result;
        }*/
    }
}