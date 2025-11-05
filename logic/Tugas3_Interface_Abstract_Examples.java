package logic;

abstract class Kereta {
    protected String nama;
    public Kereta(String nama) { this.nama = nama; }
    public abstract void tujuan();
    public void status() {
        System.out.println("Kereta " + nama + " siap berangkat.");
    }
}

class Kereta1 extends Kereta {
    public Kereta1(String nama) { super(nama); }
    public void tujuan() {
        System.out.println("Tujuan Kereta1: Semarang Pasarturi");
    }
}

interface Kendaraan {
    int JUMLAH_RODA_MINIMAL = 2;
    void bergerak();
    default void nyalakanMesin() {
        System.out.println("Mesin dinyalakan.");
    }
}

class Mobil implements Kendaraan {
    public void bergerak() {
        System.out.println("Mobil bergerak dengan nyaman.");
    }
}

abstract class Burung {
    protected String nama;
    public Burung(String nama) { this.nama = nama; }
    public abstract void bersuara();
}

interface DapatTerbang { void terbang(); }

class Elang extends Burung implements DapatTerbang {
    public Elang(String nama) { super(nama); }
    public void bersuara() {
        System.out.println("Elang bersuara: Miiiaaaaooo");
    }
    public void terbang() {
        System.out.println("Elang terbang tinggi di udara.");
    }
}
