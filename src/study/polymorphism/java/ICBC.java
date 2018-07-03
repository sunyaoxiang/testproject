package study.polymorphism.java;

/**
 * Created by yaoxiang.sun on 2018/7/3.
 */
public class ICBC extends CNY {
    private String bankName;

    public ICBC(double amount, String bankName) {
        super(amount);
        setBankName(bankName);
    }

    public String toString() {
//        return currency + ":" + String.valueOf(amount) + " from " + bankName;
        return "You have: " + getCurrency() + "|" +String.valueOf(getAmount()) + " Money from " + bankName ;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
}
