package Static;

public class Car_1 {
    static int totalCarsProduced = 0; // Shared by all cars
    private String model;             // Each car has its own model

    public Car_1(String model) {
        this.model = model;
        totalCarsProduced++;  // Increases shared counter
    }

    public void showCarDetails() {
        System.out.println("Car Model: " + model);
    }

    public static void showTotalCars() {
        System.out.println("Total Cars Produced: " + totalCarsProduced);
    }

    public static void main(String[] args) {
        Car_1 c1 = new Car_1("Tata Nexon");
        Car_1 c2 = new Car_1("Hyundai Creta");

        c1.showCarDetails();
        c2.showCarDetails();

        Car_1.showTotalCars(); // Access static method
    }
}
