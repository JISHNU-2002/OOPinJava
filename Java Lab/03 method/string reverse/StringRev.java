import java.io.*;
import java.util.*;

class StringRev{
    public static void main(String args[]){
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        str = sc.nextLine();
        int l = str.length();
        String Reverse = "";

        for(int i=l-1;i>=0;i--){
            Reverse = Reverse + str.charAt(i);
        }

        System.out.print("Reversed String : "+Reverse);
        System.out.println();
    }
}
