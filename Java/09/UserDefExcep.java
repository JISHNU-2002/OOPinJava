class UserDef extends Exception{
    public UserDef(){
        System.out.println("User Defined Exception thrown");
    }

    public String toString(){
        return "User Defined Exception : Number should be >10";
    }
}

class UserDefExcep{
    static int flag = 0;
    public static void main(String args[]){
        try{
            int num = Integer.parseInt(args[0]);
            if(num <= 10){
                throw new UserDef();
            }
        }catch(ArrayIndexOutOfBoundsException a){
            flag = 1;
            System.out.println(a);
        }catch(NumberFormatException b){
            flag = 1;
            System.out.println(b);
        }catch(UserDef c){
            flag = 1;
            System.out.println(c);
        }finally{
            if(flag == 0){
                System.out.println("Everything is fine");
            }else{
                System.out.println("Exception handled");
            }
        }
    }
}