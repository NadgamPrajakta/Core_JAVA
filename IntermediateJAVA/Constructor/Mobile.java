package Ctor;

public class Mobile {
    private String brand;
    private String model;
    private double price;
    private int storage; // in GB

    // Constructor
    public Mobile(String brand, String model, double price, int storage) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.storage = storage;
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

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    // Display details
    public void displayMobileInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: ₹" + price);
        System.out.println("Storage: " + storage + " GB");
    }

    public static void main(String[] args) {
        Mobile m1 = new Mobile("Samsung", "Galaxy S24", 95000, 256);
        m1.displayMobileInfo();

        System.out.println("\n--- After Updating Storage ---");
        m1.setStorage(512);
        m1.displayMobileInfo();
    }
}
