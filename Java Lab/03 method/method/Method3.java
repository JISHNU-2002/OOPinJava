public class Method3 {
    public static void main(String args[]){
    First f1 = new First();
    System.out.println("Direct to First");
    f1.displayFirst();
    }
}
class First{
    void displayFirst(){
        System.out.println("Redirecting to Final");
        Final f99 = new Final();
        f99.displayFinal();
    }
}
class Final{
    void displayFinal(){
        System.out.println("The final one says...Hello world !!!");
    }
}