package homework4.task39;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Garage<Car> garageCar = new Garage<>();
        System.out.println("Введите марку автомобиля ");
        garageCar.setVehicle(new Car(scanner.nextLine()));

        garageCar.infoCar();


        Garage<Motorcycle> garageMoto  = new Garage<>();
        System.out.println("Введите марку мотоцикла");
        garageMoto.setVehicle(new Motorcycle(scanner.nextLine()));

        garageMoto.infoMoto();
    }
}
