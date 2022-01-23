package JavaSE.多线程;

public class ThreadSafetyTest01 {
}
class Acount {
    private String number;  //银行账户
    private double balance;    //余额

    public Acount(String number, int balance) {
        this.number = number;
        this.balance = balance;
    }

    public Acount() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void withdraw(double money){
        double before=this.balance;
        double after=before-money;
        this.balance=after;

    }
}