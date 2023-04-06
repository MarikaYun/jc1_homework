package lesson7;

import java.util.Scanner;

public class Validator {
    public void validatorWork(double price) {
        System.out.println("You should pay: $" + price);
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        if (payment == price) {
            System.out.println("Thank you for payment");
        } else if (payment > price) {
            double change = payment - price;
            System.out.println("Thank you for payment \nTake your change $" + change);

        }
    }
}
