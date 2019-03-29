package Netologia.task_2_4.task_2_4_2;

public class CreditAccount extends Account {
    private int balance;

    public CreditAccount() {
        this(0);
    }

    public CreditAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public void pay(int amount) {
        balance -= amount;
        System.out.println("Оплата по кредитной карте проведена! Баланс на карте: " + this.balance);

    }

    @Override
    public void transfer(Account account, int amount) {
        System.out.println("По кредитной карте нельзя переводить!");
    }

    @Override
    public boolean addMoney(int amount) {
        if ((this.balance + amount) > 0){
            System.out.println("Пополнение кредитной карты не прошло! Сумма пополнения превышает задолжности на карте!");
            return false;
        } else {
            this.balance += amount;
            System.out.println("Пополнение кредитной карты прошло! Баланс на карте: " + this.balance);
            return true;
        }

    }
}