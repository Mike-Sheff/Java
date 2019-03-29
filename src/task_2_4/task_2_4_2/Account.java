package Netologia.task_2_4.task_2_4_2;

public abstract class Account {

    public abstract void pay(int amount);

    public abstract void transfer(Account account, int amount);

    public abstract boolean addMoney(int amount);

    public abstract int getBalance();
}
