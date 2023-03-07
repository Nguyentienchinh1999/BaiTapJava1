package Java_day4_baitap_Encapsulation.Account;

public class Account {
    private String id;
    private String name;
    private int balance = 0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
    public int credit(int amount){
        return balance = balance + amount;
    }

    public int debit(int amount){
        if(amount <= balance){
           return balance = balance - amount;
        }else System.out.println("amout exeeded balance");
        return balance;
    }
    public int transferTo(Account another, int amout){
        if(amout <= balance){
//           trừ amount trong tài khoản hiện tại
         balance  = balance - amout;
//         tăng amount trong tài khoản còn lại
         another.balance = another.balance + amout;
        }else System.out.println("amout exeeded balance");
        return this.balance;
    }

    @Override
    public String toString() {
        return "Account[" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ']';
    }
}
