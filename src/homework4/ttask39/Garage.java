package homework4.ttask39;

public class Garage<T extends Vehicle> {
    private T vehicle;

    public  void setVehicle(T vehicle) {
        this.vehicle = vehicle;
    }
    public T getVehicle(){
        return vehicle;
    }


    public void infoCar() {
        System.out.println("В гараже хранится автомобиль: " +getVehicle());
    }
    public void infoMoto() {
        System.out.println("В гараже хранится мотоцикл: " + getVehicle());
    }
}
