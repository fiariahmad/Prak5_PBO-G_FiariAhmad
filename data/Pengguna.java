package data;

public class Pengguna {
    private String nama;
    private String username;
    private String password;

    // Constructor 1: default (tanpa parameter)
    public Pengguna() {
        this.nama = "Tidak Diketahui";
        this.username = "Fiariahmad";
        this.password = "12345";
    }

    // Constructor 2: dengan parameter
    public Pengguna(String nama, String username, String password) {
        this.nama = nama;
        this.username = username;
        this.password = password;
    }

    // Setter dan Getter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Method untuk menampilkan data pengguna
    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("Username: " + username);
    }
}
