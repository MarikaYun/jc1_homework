package homework4.season;

import java.util.Scanner;
//не придумала как в одной папке написать 3 enum Season, потому всё делала в одном энаме
public enum Season {
    SPRING(92),
    SUMMER(92),
    AUTUMN(91),
    WINTER(90);
    private Season description;
    private int countOfDays;

    Season(int countOfDays) {
        this.countOfDays = countOfDays;
    }

    int getCountOfDays() {
        return countOfDays;
    }

    public static void printSeasons() {//Вывести названия сезонов

        for (Season season : Season.values()) {
            System.out.println(season);
        }
    }

    public static void printNextSeason() {//следующий сезон
        Season[] seasons = Season.values();
        System.out.println("Enter the name of season");
        Scanner scanner = new Scanner(System.in);
        String ssn = scanner.nextLine();
        for (int i = 0; i < seasons.length - 1; i++) {
            if (ssn.equalsIgnoreCase(seasons[i].toString())) {
                System.out.println("The next season is: " + seasons[i + 1]);
            }
        }
        if (ssn.equalsIgnoreCase(seasons[seasons.length - 1].toString())) {
            System.out.println("The next season is: " + seasons[0]);
        }
    }

    public static void seasonDays() {//количество дней в сезоне
        System.out.println("Enter the name of the season");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        switch (s) {
          //  case "spring" -> System.out.println("Spring continues " + Season.SPRING.getCountOfDays() + " days");
            //case "summer" -> System.out.println("Summer continues " + Season.SUMMER.getCountOfDays() + " days");
          //  case "autumn" -> System.out.println("Autumn continues " + Season.AUTUMN.getCountOfDays() + " day");
            //case "winter" -> System.out.println("Winter contunues " + Season.WINTER.getCountOfDays() + " days");
        }
    }
}
