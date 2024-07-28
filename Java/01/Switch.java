class Switch{
    public static void main(String args[]){
        char grade = args[0].charAt(0);
        System.out.println("Your grade : "+grade);

        switch(grade){
            case 'A' : System.out.println("Excellent");
                break;
            case 'B' : System.out.println("Great");
                break;
            case 'C' : System.out.println("Very Good");
                break;
            case 'D' : System.out.println("Good");
                break;
            default : System.out.println("Enter something");
                break;
        }
    }
}