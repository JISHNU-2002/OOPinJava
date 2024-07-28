class Aone{
    int i = 10;
    Aone(int i){
        this.i = i;
        System.out.println(this.i);
    }

    public static void main(String args[]){
        //System.out.println(i);
        //a static method cannot access a non-static variable

        Aone obj = new Aone();
    }
}