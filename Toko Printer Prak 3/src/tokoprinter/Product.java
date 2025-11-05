package tokoprinter;

import java.text.NumberFormat;
import java.util.Locale;

public class Product {
    protected String namaFiari;
    protected float hargaFiari;

    public Product(String namaFiari, float hargaFiari) {
        this.namaFiari = namaFiari;
        this.hargaFiari = hargaFiari;
    }

    public void displayInfo() {
        NumberFormat nf = NumberFormat.getNumberInstance(new Locale("id", "ID"));
        nf.setMaximumFractionDigits(0);
        String hargaFormat = nf.format(hargaFiari);

        System.out.println("Nama Produk: " + namaFiari);
        System.out.println("Harga: Rp " + hargaFormat);
    }
}
