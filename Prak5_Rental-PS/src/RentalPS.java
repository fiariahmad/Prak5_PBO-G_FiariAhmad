// RentalPS.java
public abstract class RentalPS {
    protected String namaPenyewa;
    protected int lamaSewa;       // dalam jam
    protected double hargaPerJam;

    public RentalPS(String namaPenyewa, int lamaSewa, double hargaPerJam) {
        this.namaPenyewa = namaPenyewa;
        this.lamaSewa = lamaSewa;
        this.hargaPerJam = hargaPerJam;
    }

    // Method abstrak (harus diimplementasi oleh subclass)
    public abstract double hitungBiayaSewa();
    public abstract void tampilkanInfo();
}
