public class ShoppingCart {
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public ShoppingCart(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price    = price;
        this.quantity = quantity;
    }

    // Method to add items (increase quantity)
    public void addItems(int qty) {
        if (qty > 0) {
            quantity += qty;
            System.out.println(qty + " items added. New quantity: " + quantity);
        } else {
            System.out.println("Invalid quantity to add.");
        }
    }

    // Method to remove items (decrease quantity)
    public void removeItems(int qty) {
        if (qty <= 0) {
            System.out.println("Invalid quantity to remove.");
        } else if (qty > quantity) {
            System.out.println("Cannot remove more than current quantity (" + quantity + ").");
        } else {
            quantity -= qty;
            System.out.println(qty + " items removed. New quantity: " + quantity);
        }
    }

    // Method to display total cost (price × quantity)
    public void displayTotalCost() {
        double total = price * quantity;
        System.out.println("Item: " + itemName);
        System.out.println("Unit Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.printf("Total Cost: %.2f%n", total);
    }

    // Main method to test
    public static void main(String[] args) {
        ShoppingCart myCart = new ShoppingCart("USB Cable", 299.00, 1);

        myCart.displayTotalCost();
        System.out.println();

        myCart.addItems(2);
        myCart.displayTotalCost();
        System.out.println();

        myCart.removeItems(1);
        myCart.displayTotalCost();
    }
}
