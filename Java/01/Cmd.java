class Cmd{
    public static void main(String [] args){
        System.out.println("Welcome : "+args[0]);

        int num1 = Integer.parseInt(args[1]);
        int num2 = Integer.parseInt(args[2]);
        int sum = num1+num2;
        System.out.println(sum);

        int len = args.length;
        System.out.println(len);
    }
}