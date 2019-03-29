package Netologia.task_2_4.task_2_4_2;

public class SavingsAccount extends Account {
    private int balance;

    public SavingsAccount() {
        this(0);
    }

    public SavingsAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public void pay(int amount) {
        System.out.println("По сберегательной карте нельзя платить");
    }

    @Override
    public void transfer(Account account, int amount) {
        if((this.balance - amount) < 0){
            System.out.println("Сумма перевода превышает баланса на сберегательной карте!");
        } else {
            if (account.addMoney(amount)) {
                this.balance -= amount;
                System.out.println("Перевод по сберегательной карте произведен! Баланс карты: " + this.balance);
            } else {
                System.out.println("Перевод на переводимую карту не прошел! Возврат денежных средств. Баланс карты: " + this.balance);
            }

        }
    }

    @Override
    public boolean addMoney(int amount) {
        this.balance += amount;
        System.out.println("Пополнение счета сберегательной карты произведена! Баланс карты: " + this.balance);
        return true;
    }
}