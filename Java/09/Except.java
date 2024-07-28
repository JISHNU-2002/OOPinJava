class Except{
    public static void main(String args[]){
        try{
            System.out.println("try");
        }catch(Exception e){
            System.out.println(e);
        }catch(ArithmeticException a){
            System.out.println(a);
        }finally{
            System.out.println("fianlly");
        }
    }
}