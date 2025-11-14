public class Main {
    public static void main(String[] args) {

        // Data awal jasa
        String[] barangTersedia = {"Tas", "Sepatu Sneaker", "Jaket", "Dompet"};
        JasaLukis jasa = new JasaLukis("Fiari Art Studio", "Jl. Melati No.25, Jakarta", barangTersedia);

        // Tampilkan info jasa
        jasa.tampilkanInfoJasa();

        // Contoh 2 pemesanan
        JasaLukis.Pemesanan pesanan1 = jasa.buatPemesanan(
                "Fiari Ahmad",
                "Tas",
                "Motif Batik Modern",
                180000
        );

        JasaLukis.Pemesanan pesanan2 = jasa.buatPemesanan(
                "Rizky Ramadhan",
                "Sepatu Sneaker",
                "Desain Graffiti",
                230000
        );

        // Tampilkan detail pemesanan
        pesanan1.tampilkanDetailPemesanan();
        pesanan2.tampilkanDetailPemesanan();

        // Hitung total
        double total = pesanan1.getHarga() + pesanan2.getHarga();
        System.out.println("Total biaya seluruh pemesanan : Rp " + total);
    }
}
