import java.io.*;
class TwoDArray{
    public static void main(String args[]){
        int[][] array= new int[3][];
        array[0] = new int[]{1,2,3};
        array[1] = new int[]{1,2,3,4};
        array[2] = new int[]{1,2};

        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        
        int[][] b = new int[10][];
        System.out.println(b[4][0]);
    }
}