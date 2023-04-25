package homework4.task39;


public class Garage<Vehicle> {
    private Car car;
    private Motorcycle motorcycle;

    public  void setCar(Car car) {
        this.car = car;
    }

    public void setMotorcycle(Motorcycle motorcycle) {
        this.motorcycle = motorcycle;
    }
    public void infoCar() {
        System.out.println("В гараже хранится автомобиль: " + car);
    }
    public void infoMoto() {
        System.out.println("В гараже хранится мотоцикл: " + motorcycle);
    }
}

