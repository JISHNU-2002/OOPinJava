import java.io.*;

class Buffered_Reader{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        char c=(char)br.read();
        System.out.println(c);
    }
}
