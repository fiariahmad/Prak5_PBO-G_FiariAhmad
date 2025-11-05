package tokoprinter;

public class LaserPrinter extends Printer {
    private int tonerCapacity;

    public LaserPrinter(String brand, double price, String model, String type, int tonerCapacity) {
        super(brand, price, model, type);
        this.tonerCapacity = tonerCapacity;
    }

    @Override
    public void displayPrinterDetails() {
        super.displayPrinterDetails(); // panggil dari Printer
        System.out.println("Toner Capacity: " + tonerCapacity + " grams");
    }

    public void showLaserDetails() {
        System.out.println("This laser printer uses toner powder and high-speed laser beam technology.");
    }
}
