package tokoprinter;

public class InkjetPrinter extends Printer {
    private int inkCapacity;

    public InkjetPrinter(String brand, double price, String model, String type, int inkCapacity) {
        super(brand, price, model, type);
        this.inkCapacity = inkCapacity;
    }

    @Override
    public void displayPrinterDetails() {
        super.displayPrinterDetails(); // panggil dari Printer
        System.out.println("Ink Capacity: " + inkCapacity + " ml");
    }

    public void showInkDetails() {
        System.out.println("This inkjet printer uses dye-based ink with fine nozzle technology.");
    }
}
