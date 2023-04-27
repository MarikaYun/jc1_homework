package homework4.task34;

import java.util.Scanner;

public class Belcard extends BankCard {
    private String rubl = "RUB";
    private String paySystem;

    public Belcard(String firstName, String lastName, long cardNumber, int validDate, int CVV,
                   String paySystem) {
        super(firstName, lastName, cardNumber, validDate, CVV);
        this.paySystem = paySystem;
    }

    public String getPaySystem() {
        return paySystem;
    }

    public void addBalance() {
        System.out.println("Введите сумму для пополнения балланса");
        Scanner sc = new Scanner(System.in);
        double addMoney = sc.nextDouble();
        System.out.println("Вы пополнили балланс на " + addMoney + " " + rubl);
    }
}
