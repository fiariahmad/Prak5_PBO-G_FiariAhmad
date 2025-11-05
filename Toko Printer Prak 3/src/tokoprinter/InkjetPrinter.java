package tokoprinter;

public class InkjetPrinter extends Printer {
    int jumlahWarnaFiari;

    public InkjetPrinter(String namaFiari, float hargaFiari, String MerkFiari, String TipeFiari, int jumlahWarnaFiari) {
        super(namaFiari, hargaFiari, MerkFiari, TipeFiari);
        this.jumlahWarnaFiari = jumlahWarnaFiari;
    }

    @Override
    public void displayPrinterDetails() {
        super.displayPrinterDetails();
    }

    @Override
    public void printDocuments() {  // overriding
        System.out.println("Mencetak dokumen berwarna menggunakan " + jumlahWarnaFiari + " tinta...");
    }

    public void showInkDetails() {
        System.out.println("Tinta: " + jumlahWarnaFiari + " warna");
    }
}
