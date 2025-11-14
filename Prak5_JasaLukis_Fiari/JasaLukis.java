public class JasaLukis {

    private String namaJasa;
    private String alamat;
    private String[] daftarBarang;

    // Constructor kelas utama
    public JasaLukis(String namaJasa, String alamat, String[] daftarBarang) {
        this.namaJasa = namaJasa;
        this.alamat = alamat;
        this.daftarBarang = daftarBarang;
    }

    // Menampilkan info jasa
    public void tampilkanInfoJasa() {
        System.out.println("=== INFORMASI JASA LUKIS ===");
        System.out.println("Nama Jasa   : " + namaJasa);
        System.out.println("Alamat      : " + alamat);
        System.out.print("Barang yang bisa dilukis : ");
        for (String barang : daftarBarang) {
            System.out.print(barang + ", ");
        }
        System.out.println("\n---------------------------------------");
    }

    // ======================= INNER CLASS ==========================
    public class Pemesanan {
        private String namaPelanggan;
        private String jenisBarang;
        private String desainLukisan;
        private double harga;

        public Pemesanan(String namaPelanggan, String jenisBarang, String desainLukisan, double harga) {
            this.namaPelanggan = namaPelanggan;
            this.jenisBarang = jenisBarang;
            this.desainLukisan = desainLukisan;
            this.harga = harga;
        }

        public void tampilkanDetailPemesanan() {
            System.out.println("=== DETAIL PEMESANAN ===");
            System.out.println("Jasa         : " + namaJasa); // akses outer class
            System.out.println("Pelanggan    : " + namaPelanggan);
            System.out.println("Jenis Barang : " + jenisBarang);
            System.out.println("Desain       : " + desainLukisan);
            System.out.println("Harga        : Rp " + harga);
            System.out.println("---------------------------------------");
        }

        public double getHarga() {
            return harga;
        }
    }
    // ===============================================================

    // Membuat objek pemesanan
    public Pemesanan buatPemesanan(String nama, String barang, String desain, double harga) {
        return new Pemesanan(nama, barang, desain, harga);
    }
}
