package homework6.task45;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the month's number to get description");
        try {
            findMonth();
        } catch (MonthNumberException e) {
            e.printStackTrace();
        }
    }

    public static void findMonth() throws MonthNumberException {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        if (month < 1 || month > 12) throw new MonthNumberException("The number of month" +
                " must be from 1 to 12 ");
        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("Winter month");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring month");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer month");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn month");
                break;
        }

    }
}
