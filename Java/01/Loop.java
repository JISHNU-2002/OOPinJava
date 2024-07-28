class Loop{
    public static void main(String args[]){
        int numbers[] = {1,2,3,4,5};
        for(int i:numbers){
            System.out.println(i);   
        }
        
        //2+4==5?System.out.println("true") : System.out.println("false");   
        boolean b = true;
        if(b){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        int num1 = 10;
        do{
            System.out.println(num1);
            num1++;
        }while(num1<5);

        int num2 = 25;
        while(num2<30){
            if(num2 == 28){
                continue;
            }  
            System.out.println(num2);
            num2++; 
        }

        int num3 = 90;
        for(int j=0;j<10;j++){
            if(num3 == 99){
                continue;
            }  
            System.out.println(num3);
            num3++; 
        }
    }
}