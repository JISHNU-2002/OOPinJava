class abstract G{
    public final void testM(){
        System.out.println("test");
    }
}

class Aone{
    public static void main(String args[]){
        G obj = new G();
        obj.testM();
    }
}