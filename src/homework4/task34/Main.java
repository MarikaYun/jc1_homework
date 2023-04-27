package homework4.task34;

public class Main {
    public static void main(String[] args) {
        BelinvestbankCard invest = new BelinvestbankCard("Belinvestbank", "Maria",
                "Yuran", 2169_0000_0007_1889L, 1124, 123, "Belcard");
        invest.getCard();
        System.out.println();
        invest.addBalance();
        System.out.println("---------------------------");

        AlfabankCard alfa = new AlfabankCard("AlfaBank", "Nikolay", "Morozov",
                4343_0000_0000_6223L, 1025, 901, "Visa");
        alfa.getCard();
        System.out.println();
        alfa.addBalance();
    }
}
