package Ctor;

public class Car_1 {
    private String brand;
    private String model;
    private double price;

    // Constructor
    public Car_1(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Getters and Setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Display car details
    public void displayCarInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: ₹" + price);
    }

    public static void main(String[] args) {
        Car_1 car1 = new Car_1("Tata", "Harrier", 2000000);
        car1.displayCarInfo();

        System.out.println("\n--- Updating Car Price ---");
        car1.setPrice(2100000);
        car1.displayCarInfo();
    }
}
