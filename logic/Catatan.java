package logic;

import data.Pengguna;
import java.util.Scanner;

public class Catatan{

    // Method untuk mengecek validasi identitas pengguna
    public boolean validasiLogin(Pengguna user) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan username: ");
        String userInput = input.nextLine();

        System.out.print("Masukkan password: ");
        String passInput = input.nextLine();

        if (userInput.equals(user.getUsername()) && passInput.equals(user.getPassword())) {
            System.out.println("Login berhasil! Selamat datang, " + user.getNama());
            return true;
        } else {
            System.out.println("Login gagal! Username atau password salah.");
            return false;
        }
    }

    // Method utama untuk menjalankan aplikasi
    public void mulai() {
        // Membuat objek pengguna dengan constructor parameter
        Pengguna user1 = new Pengguna("Fiari Ahmad", "fiari", "12345");

        // Validasi login
        boolean status = validasiLogin(user1);

        // Jika validasi berhasil
        if (status) {
            System.out.println("Akses ke catatan harian diberikan.");
        } else {
            System.out.println("Akses ditolak.");
        }
    }
}
