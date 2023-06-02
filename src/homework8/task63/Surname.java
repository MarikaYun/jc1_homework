package homework8.task63;

import java.util.Random;

public enum Surname {
    ALI("Ali"), ADAMS("Adams"), SHAHIN("Shahin"), DOGAN("Dogan"), DURAN("Duran"), TURAN("Turan"),
    YURAN("Yuran"), LI("Li"), DILON("Dilon"), JAGGER("Jagger"), SMITH("Smith"), JOHNSON("Johnson"),
    GATES("Gates"), MERPHY("Merphy"), ROTHSHILD("Rothshild"), BJORK("Bjork"), FURKAD("Furkad"),
    NADAL("Nadal"), JOKOVIC("Jokovic"), FEDERER("Federer"), FRITZ("Fritz"), LOTNER("Lotner"),
    MCCLOUD("McCloud"), MCGUIRE("McGuire"), SAZERLEND("Sazerlend"), KARUZO("Karuzo"),KIDMAN("Kidman"),
    RIСHAR("Richar"), BELMONDO("Belmondo"), DELON("Delon"), ALONSO("Alonso"), JACKSON("Jackson"),
    SHUMAHER("Shumaher"), STRUFF("Struff"), BOE("Boe"), OEBERG("Oeberg"), HANEVOLD("Hanevold"),
    ANDERSEN("Andersen"), JOHANSON("Johanson"), DALE("Dale"), KARA("kara"), OSALLIVAN("O'Sallivan"),
    MONFIS("Monfis"), GROSS("Gross"), LUK("Luk"), PAVAROTTI("Pavarotti"), LEONE("Leone"), ROCK("Rock"),
    STALLONE("Stallone"), VIVALDI("Vivaldi"), MOZART("Mozart"), SHUBERT("Shubert"), LIST("List"),
    BACH("Bach"), PAGANINI("Paganini"), DEMIR("Demir"), OZGUR("Ozgur"), GRIG("Grig");
    private String surname;

    Surname(String surname) {
        this.surname = surname;
    }
    public static Surname getRandomSurname() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
    public String getSurname() {
        return surname;
    }
}
