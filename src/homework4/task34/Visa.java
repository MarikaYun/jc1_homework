package homework4.task34;

import homework4.task35.Ingeneer;

import java.util.Scanner;

public class Visa extends BankCard{
    private final String dollar = "USD";
    private final String euro = "EUR";

    public String getPaySystem() {
        return paySystem;
    }

    private String paySystem;
    public Visa(String firstName, String lastName, long cardNumber, int validDate, int cvv,String paySystem) {
        super(firstName, lastName, cardNumber, validDate, cvv);
        this.paySystem = paySystem;
    }

    @Override
    void addBalance() {
        System.out.println("Выберите валюту для пополнения балланса карты:\n 1 - "+ dollar +"\t2 - " + euro);
        Scanner sc = new Scanner(System.in);
        int currency = sc.nextInt();
        System.out.println("Введите сумму для пополнения балланса");
        int sum = sc.nextInt();
        System.out.print("Вы пополнили балланс на " + sum);
        switch (currency){
            case 1:
                System.out.println(" " + dollar);
                break;
            case 2:
                System.out.println(" " + euro);
                break;
        }

    }
}
