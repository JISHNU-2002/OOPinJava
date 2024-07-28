class Constructor{
    public static void main(String args[]){
        Sample obj1 = new Sample();
        Sample obj2 = new Sample(2);
    }
}

class Sample{
    int id;

    Sample(){
        this(4);
        System.out.println("default constructor without any argument");
    }

    Sample(String str){
        System.out.println("constructor with argument as string "+str);
    }

    Sample(int num1){
        System.out.println("Constructor with argument as integer "+num1);
    }

    void setId(int id){
        this.id = id;
    }
}