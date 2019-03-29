package Netologia.task_2_4.task_2_4_2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача: Банковские счета.");
        System.out.println("");

        Account checkingCard = new CheckingAccount(100);
        Account creditCard = new CreditAccount();
        Account savingsCard = new SavingsAccount(100);

        System.out.println("Баланс расчетной карты: " + checkingCard.getBalance());
        System.out.println("Баланс кредитной карты: " + creditCard.getBalance());
        System.out.println("Баланс сберегательной карты: " + savingsCard.getBalance());

        checkingCard.pay(47);
        checkingCard.transfer(creditCard, 13);
        checkingCard.addMoney(6);
        System.out.println("------------------------------");

        System.out.println("Баланс расчетной карты: " + checkingCard.getBalance());
        System.out.println("Баланс кредитной карты: " + creditCard.getBalance());
        System.out.println("Баланс сберегательной карты: " + savingsCard.getBalance());

        creditCard.pay(487);
        creditCard.transfer(checkingCard, 1);
        creditCard.addMoney(488);
        creditCard.addMoney(487);
        System.out.println("------------------------------");

        System.out.println("Баланс расчетной карты: " + checkingCard.getBalance());
        System.out.println("Баланс кредитной карты: " + creditCard.getBalance());
        System.out.println("Баланс сберегательной карты: " + savingsCard.getBalance());

        savingsCard.pay(7);
        savingsCard.transfer(savingsCard, 53);
        savingsCard.addMoney(38);
        System.out.println("------------------------------");

        System.out.println("Баланс расчетной карты: " + checkingCard.getBalance());
        System.out.println("Баланс кредитной карты: " + creditCard.getBalance());
        System.out.println("Баланс сберегательной карты: " + savingsCard.getBalance());

        System.out.println("");
        System.out.println("До свидания!");
    }
}