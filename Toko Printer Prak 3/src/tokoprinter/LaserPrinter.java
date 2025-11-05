package tokoprinter;

public class LaserPrinter extends Printer {
    int kecepatanCetakFiari;

    public LaserPrinter(String namaFiari, float hargaFiari, String MerkFiari, String TipeFiari, int kecepatanCetakFiari) {
        super(namaFiari, hargaFiari, MerkFiari, TipeFiari);
        this.kecepatanCetakFiari = kecepatanCetakFiari;
    }

    @Override
    public void displayPrinterDetails() {
        super.displayPrinterDetails();
    }

    @Override
    public void printDocuments() {  // overriding
        System.out.println("Mencetak dokumen hitam putih dengan kecepatan " + kecepatanCetakFiari + " ppm...");
    }

    public void showLaserDetails() {
        System.out.println("Kecepatan Cetak: " + kecepatanCetakFiari + " Halaman (ppm)");
    }
}
