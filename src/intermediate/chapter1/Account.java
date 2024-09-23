package Intermediate.chapter1;

public class Account {
    public Float balance;

    public Float getBalance(){
        return balance;
    }

    public Float Deposit(float amount){
        balance = balance + amount;
        return balance;
    }

    public void withdraw(float amount) throws OverdraftException{
        balance = balance - amount;
        if(balance < 0){
            throw new OverdraftException(balance);
        }
    }

    static class OverdraftException extends Exception {
        public Float deficit;

        public OverdraftException(){

        }

        public OverdraftException(Float amount) {
            super("account deficit: " + amount);
            deficit = amount;
        }
    }

    public static void main(String[] args){
        Account a = new Account();
        a.balance = 100f;
        try{
            a.withdraw(150);
        }catch (OverdraftException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
