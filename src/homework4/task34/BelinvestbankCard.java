package homework4.task34;

import java.util.Scanner;

public class BelinvestbankCard extends Belcard{
    private String bankName;
    private double balance;

    public BelinvestbankCard(String bankName, String firstName, String lastName, long cardNumber, int validDate, int CVV, String paySystem) {
        super(firstName, lastName, cardNumber, validDate, CVV, paySystem);
        this.bankName = bankName;
    }

    public void getCard() {
        System.out.println("Вы получили карту банка " + bankName + " локальной платежной системы " + getPaySystem() +
                " на имя " + getFirstName() + " " + getLastName() + ".\nНомер карты: " + getCardNumber() +
                " срок действия до: " + getValidDate());
    }

}
