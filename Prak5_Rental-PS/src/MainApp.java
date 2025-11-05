// MainApp.java
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Rental PS5 ===");
        System.out.print("Masukkan nama penyewa: ");
        String nama = input.nextLine();

        System.out.print("Masukkan lama sewa (jam): ");
        int lama = input.nextInt();

        System.out.print("Masukkan harga per jam: ");
        double harga = input.nextDouble();

        System.out.print("Apakah pelanggan member lama? (true/false): ");
        boolean member = input.nextBoolean();

        RentalPS5 penyewa = new RentalPS5(nama, lama, harga, member);

        penyewa.tampilkanInfo();
        penyewa.beriBonus();

        input.close();
    }
}
