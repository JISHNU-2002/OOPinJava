class SuperClass{
    public static void main(String args[]){
        Sub obj = new Sub();
        obj.fill(10,20);
        obj.sum();
    }
}

class Super{
    int a;
    private int b;

    void fill(int a,int b){
        this.a = a;
        this.b = b;
    }

    int getB(){
        return b;
    }
}

class Sub{
    int c;

    void sum(){
        int d = getB();
        c = a + d;
        System.out.println(c);
    }
}