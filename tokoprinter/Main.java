package tokoprinter;

public class Main {
    public static void main(String[] args) {
        // Membuat objek InkjetPrinter
        InkjetPrinter inkjet = new InkjetPrinter("Canon", 1250000, "Pixma MG2570S", "Inkjet", 500);
        inkjet.displayInfo();
        inkjet.displayPrinterDetails();
        inkjet.showInkDetails();

        System.out.println("\n--------------------------\n");

        // Membuat objek LaserPrinter
        LaserPrinter laser = new LaserPrinter("HP", 2450000, "LaserJet Pro M15w", "Laser", 250);
        laser.displayInfo();
        laser.displayPrinterDetails();
        laser.showLaserDetails();
    }
}
