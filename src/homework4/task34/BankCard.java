package homework4.task34;

public abstract class BankCard {
    private String firstName;
    private String LastName;
    private long cardNumber;
    private int validDate;
    private int cvv;

    public BankCard(String firstName, String lastName, long cardNumber, int validDate, int cvv) {
        this.firstName = firstName;
        LastName = lastName;
        this.cardNumber = cardNumber;
        this.validDate = validDate;
        this.cvv = cvv;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public int getValidDate() {
        return validDate;
    }


    abstract void addBalance();
}
