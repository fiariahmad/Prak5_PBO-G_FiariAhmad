// RentalPS5.java
public class RentalPS5 extends RentalPS implements BonusMember {
    private boolean memberLama;

    public RentalPS5(String namaPenyewa, int lamaSewa, double hargaPerJam, boolean memberLama) {
        super(namaPenyewa, lamaSewa, hargaPerJam);
        this.memberLama = memberLama;
    }

    @Override
    public double hitungBiayaSewa() {
        double biaya = lamaSewa * hargaPerJam;
        if (memberLama) {
            biaya *= 0.9; // Diskon 10% untuk member lama
        }
        return biaya;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("\n=== DATA PENYEWA PS5 ===");
        System.out.println("Nama Penyewa : " + namaPenyewa);
        System.out.println("Lama Sewa    : " + lamaSewa + " jam");
        System.out.println("Harga per Jam: Rp" + hargaPerJam);
        System.out.println("Total Biaya  : Rp" + hitungBiayaSewa());
    }

    @Override
    public void beriBonus() {
        if (memberLama) {
            System.out.println("Bonus: Tambahan 1 jam gratis bermain!");
        } else {
            System.out.println("Bonus: Belum tersedia untuk non-member.");
        }
    }
}
