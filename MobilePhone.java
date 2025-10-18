// MobilePhone.java
public class MobilePhone {
    private String brand;
    private String model;
    private double price;

    // Constructor to initialize the phone’s data
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display all the details
    public void displayDetails() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
    }

    // Main method to demonstrate usage
    public static void main(String[] args) {
        MobilePhone phone1 = new MobilePhone("Samsung", "Galaxy S21", 699.99);
        MobilePhone phone2 = new MobilePhone("Apple",   "iPhone 13",    999.99);

        System.out.println("Phone 1 details:");
        phone1.displayDetails();

        System.out.println("\nPhone 2 details:");
        phone2.displayDetails();
    }
}

