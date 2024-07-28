class First{
    public final void display(String s){
        System.out.println(s);
    }
}

class FinalMethod extends First{
    public void display(String s){
        System.out.println(s);
    }
    public static void main(String args[]){
        FinalMethod obj = new FinalMethod();
        obj.display("Hello World");
    }
}