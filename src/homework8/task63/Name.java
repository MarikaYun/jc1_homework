package homework8.task63;

import java.util.Random;

public enum Name {
    ANN("Ann"), ALICE("Alice"), ALBERT("Albert"), ANGELINA("Angelina"), SUZI("Suzi"),SAM("Sam"),
    TOM("Tom"), POL("Pol"), KATTY("Katty"), FRANK("Frank"), JOHN("John"), MARTIN("Martin"),RAFAEL("Rafael"),
    ROGER("Roger"), NOVAK("Novak"), PETER("Peter"), EDDY("Eddy"), BOB("Bob"), ALI("Ali"), KELVIN("Kelvin"),
    SALVATORE("Salvatore"),AYA("Aya"),MAGGY("Maggy"),ESHLEY("Eshley"), LEYLA("Leyla"),RICHARD("Richard"),
    JERZHI("Jerzhi"),STEPHEN("Stephen"),TIM("Tim"),RONNY("Ronny"), STIV("Stiv"), ARTUR("Artur"),
    GAVRIIL("Gavriil"), MIKEL("Mikel"), PAVEL("Pavel"),SANCHO("Sancho"), MIGEL("Migel"), JANE("Jane"),
    ALEX("Alex"),ADOLF("Adolf"), ARNOLD("Arnold"), SOLOMON("Solomon"), DAVID("David"), ALEN("Alen"),
    ZHAN("Zhan"),ZHAK("Zhak"), SKY("Sky"),ELINA("Elina"), GAEL("Gael");
    private String name;
     Name(String name) {
        this.name = name;
    }
    public static Name getRandomName() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
    public String getName() {
         return name;
    }
}
