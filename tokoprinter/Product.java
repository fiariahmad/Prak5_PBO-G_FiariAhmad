package tokoprinter;

public class Product {
    protected String brand;
    protected double price;

    public Product(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("=== PRODUCT INFO ===");
        System.out.println("Brand : " + brand);
        System.out.println("Price : Rp" + price);
    }
}
