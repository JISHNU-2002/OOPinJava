class Bank{
    public static void main(String args[]){
        Account obj = new Account();
        obj.deposit(1666);
        obj.deposit(5000);
        obj.withdraw(5666);
    }
}

class Account{
    double balance;
    double min_balance = 1000.0;

    void currentBalance(){
        System.out.println("current balance = "+balance);
    }

    void deposit(double amount){
        balance+=amount;
        System.out.println(amount+" deposited\nTotal balance = "+balance);
    }

    void withdraw(double wamount){
        currentBalance();
        if(balance >= wamount+min_balance){
            balance-=wamount;
            System.out.println("withdraw success & balance = "+balance);
            currentBalance();
        }else{
            System.out.println("insufficient balance");
        }
    }
}