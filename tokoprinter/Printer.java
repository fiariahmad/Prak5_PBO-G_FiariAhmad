package tokoprinter;

public class Printer extends Product {
    protected String model;
    protected String type;

    public Printer(String brand, double price, String model, String type) {
        super(brand, price);
        this.model = model;
        this.type = type;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // dari Product
        System.out.println("=== PRINTER INFO ===");
        System.out.println("Model : " + model);
        System.out.println("Type  : " + type);
    }

    public void displayPrinterDetails() {
        System.out.println("Printer details from base Printer class.");
    }
}
