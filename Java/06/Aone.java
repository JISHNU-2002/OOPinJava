//abstract 
class abstract G{
    //abstract void test();
    public void testM(){
        System.out.println("test");

    }
}

class Aone extends G{
    /*void test(){
            System.out.println("test");
        }*/

    public static void main(String args[]){
        Aone obj = new Aone();
        //obj.test();
        obj.testM();
    }
}