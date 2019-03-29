package Netologia.task_2_4.task_2_4_2;

public class CheckingAccount extends Account {
    private int balance;

    public CheckingAccount() {
        this(0);
    }

    public CheckingAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return this.balance;
    }

    @Override
    public void pay(int amount) {
        if(this.balance - amount < 0) {
            System.out.println("Оплата по расчетной карте не прошла! Сумма оплаты превышает баланс на карте!");
        } else {
          this.balance -= amount;
            System.out.println("Оплата по расчетной карте проведена! Баланс на карте: " + this.balance);

        }
    }

    @Override
    public void transfer(Account account, int amount) {
        if (this.balance - amount < 0){
            System.out.println("Перевод по расчетной катре не прошел! Сумма перевода превышает баланс на карте!");
        } else {
            if(account.addMoney(amount)) {
                this.balance -= amount;
                System.out.println("Перевод по расчетной карте проведен! Баланс на карте: " + this.balance);
            } else {
                System.out.println("Перевод на переводимую карту не прошел! Возврат денежных средств. Баланс карты: " + this.balance);
            }
        }
    }

    @Override
    public boolean addMoney(int amount) {
        this.balance += amount;
        System.out.println("Пополнение баланса расчетной карты произведено! Баланс на карте: " + this.balance);
        return true;
    }
}
