package tokoprinter;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== TOKO PRINTER ===\n");

        Printer epson = new InkjetPrinter("Epson L3210", 2325000, "Epson", "Inkjet Printer", 4);
        Printer brother = new LaserPrinter("Brother HL-L3280CDW", 7040000, "Brother", "Laser Printer", 26);

        System.out.println("Data Produk 1");
        epson.displayInfo();
        epson.displayPrinterDetails();
        epson.setDocuments("Foto Warna", 10);     // overloading
        epson.printDocuments();                   // overriding
        System.out.println();

        System.out.println("Data Produk 2");
        brother.displayInfo();
        brother.displayPrinterDetails();
        brother.setDocuments("Laporan Hitam Putih"); // overloading
        brother.printDocuments();                    // overriding
        System.out.println();
    }
}
