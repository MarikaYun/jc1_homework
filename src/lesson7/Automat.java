package lesson7;

import java.util.Scanner;

public class Automat {
    Product[] products = {
            new Product("Lays", 5, 2),
            new Product("Snickers", 3, 1.50),
            new Product("Bonaqua", 7, 1),
            new Product("Oreo", 4, 2.5),
            new Product("Orbit", 6, 1),
    };

    public void printMainMenu() {
        //print products
        int num = 1;
        for (Product product : products) {
            if (product.count > 0)
                System.out.println(num + ": " + product.name + "[" + product.count + "]" + "  $" + product.price);
            num++;
        }
        System.out.println("Please select product number: ");
    }

    public int readProductNumber() {
        Scanner scanner = new Scanner(System.in);
        boolean isNumberCorrect;
        int productNumber;
        do {
            productNumber = scanner.nextInt();
            isNumberCorrect = productNumber >= 1 && productNumber <= products.length;
            if (isNumberCorrect) {
                Product product = products[productNumber - 1];
                isNumberCorrect = product.count > 0;
            }
            if (!isNumberCorrect) {
                System.out.println("No such product number. \nPlease select product number:");
            }
        }
        while (!isNumberCorrect);
        String name = products[productNumber - 1].name;
        System.out.println("You have selected product " + name);
        Validator validator = new Validator();
        validator.validatorWork(products[productNumber -1].price);
        return productNumber;
    }

    public void takeProduct(int productNum) {
        Product product = products[productNum - 1];
        product.count--;
        System.out.println("Please take product " + product.name);

    }
}

