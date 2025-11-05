package tokoprinter;

public class Printer extends Product {
    protected String MerkFiari;
    protected String TipeFiari;
    protected String dokumenFiari;

    public Printer(String namaFiari, float hargaFiari, String MerkFiari, String TipeFiari) {
        super(namaFiari, hargaFiari);
        this.MerkFiari = MerkFiari;
        this.TipeFiari = TipeFiari;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
    }

    public void displayPrinterDetails() {
        System.out.println("Merk: " + MerkFiari);
        System.out.println("Tipe: " + TipeFiari);
    }

    // === POLIMORFISME ===
    // Overridable method
    public void printDocuments() {
        System.out.println("Mencetak dokumen standar...");
    }

    // Overloading - variasi parameter
    public void setDocuments(String dokumenFiari) {
        this.dokumenFiari = dokumenFiari;
        System.out.println("Dokumen yang akan dicetak: " + dokumenFiari);
    }

    public void setDocuments(String dokumenFiari, int jumlahHalamanFiari) {
        this.dokumenFiari = dokumenFiari;
        System.out.println("Dokumen \"" + dokumenFiari + "\" sebanyak " + jumlahHalamanFiari + " halaman disiapkan untuk dicetak.");
    }
}
