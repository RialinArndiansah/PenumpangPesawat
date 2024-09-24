package penumpangPesawat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Flight flight = new Flight();
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Penumpang");
            System.out.println("2. Hapus Penumpang");
            System.out.println("3. Tampilkan Penumpang");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi (1-4): ");
            choice = scanner.nextLine();

            if (choice.equals("1")) {
                System.out.print("Masukkan nama penumpang: ");
                String nameToAdd = scanner.nextLine();
                flight.addPassenger(nameToAdd);
                System.out.println(nameToAdd + " telah ditambahkan.");
            } else if (choice.equals("2")) {
                System.out.print("Masukkan nama penumpang yang ingin dihapus: ");
                String nameToRemove = scanner.nextLine();
                flight.removePassenger(nameToRemove);
                System.out.println(nameToRemove + " telah dihapus jika ada.");
            } else if (choice.equals("3")) {
                System.out.println("Daftar Penumpang:");
                flight.displayPassengers();
            } else if (choice.equals("4")) {
                System.out.println("Keluar dari program.");
            } else {
                System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        } while (!choice.equals("4"));

        scanner.close();
    }
}
