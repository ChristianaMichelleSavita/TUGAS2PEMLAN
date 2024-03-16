// Christiana Michelle Savita_235150401111014

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Mahasiswa> mahasiswas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean next = true;
        
        while (next) {
            System.out.print("Masukkan nim : ");
            String nim = scanner.nextLine();

            System.out.print("Masukkan nama : ");
            String nama = scanner.nextLine();

            System.out.print("Masukkan alamat: ");
            String alamat = scanner.nextLine();

            Mahasiswa mahasiswa = new Mahasiswa(nim, nama, alamat);
            mahasiswas.add(mahasiswa);

            System.out.print("Tambah lagi? (yes/no) ");
            String tambah = scanner.nextLine();

            if (!tambah.equalsIgnoreCase("yes")) {
                next = false;
            }
        }

        scanner.close();

        System.out.println("==================================");
        System.out.println("Daftar Mahasiswa:");
        for (Mahasiswa mhs : mahasiswas) {
            System.out.println("NIM    : " + mhs.getNim());
            System.out.println("Nama   : " + mhs.getNama());
            System.out.println("Alamat : " + mhs.getAlamat());
            System.out.println("----------------------------------");
        }
    }
}