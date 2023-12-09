import java.util.*;

class T1 extends Thread{
    public void run(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a limit = ");
        int l=sc.nextInt();
        Random r=new Random();

        for(int i=0;i<l;i++){
            int num=r.nextInt(100);
            int n=num;

            if(num%2==0){
                T2 t2=new T2(n);
                t2.start();
            }else{
                T3 t3=new T3(n);
                t3.start();
            }
            try{
                sleep(1000);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

class T2 extends Thread {
    int n;
    T2(int num){
        n=num;
    }
    public void run(){
        System.out.println((n+"^2 = "+n*n));
    }
}

class T3 extends Thread{
    int n;
    T3(int num){
        n=num;
    }
    public void run(){
        System.out.println(n+"^3 = "+n*n*n);
    }
}

class multiThread{
    public static void main(String args[]){
        T1 t1=new T1();
        t1.start();
    }
}


