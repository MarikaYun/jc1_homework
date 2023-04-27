package homework4.task34;

public class AlfabankCard extends Visa {
    private String bankName;

    public AlfabankCard(String bankName, String firstName, String lastName, long cardNumber, int validDate,
                        int cvv, String paySystem) {
        super(firstName, lastName, cardNumber, validDate, cvv, paySystem);
        this.bankName = bankName;
    }
    public void getCard() {
        System.out.println("Вы получили карту банка " + bankName + " локальной платежной системы " + getPaySystem() +
                " на имя " + getFirstName() + " " + getLastName() + ".\nНомер карты: " + getCardNumber() +
                " срок действия до: " + getValidDate());
    }
}
