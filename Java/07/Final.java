class Sample{
    final double pi;
    
    Sample(){
        pi = 3.14;
    }

    Sample(double pi){
        this.pi = pi;
    }
}

class Final{
    public static void main(String args[]){
        Sample obj2 = new Sample();
        System.out.println(obj2.pi);
        Sample obj = new Sample(49/7);
        System.out.println(obj.pi);
    }
}