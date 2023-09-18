package Tugas;
import java.util.Scanner;

public class TestKoperasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Anggota donny = new Anggota("111333444", "Donny" , 5000000);
        System.out.println("Nama Anggota\t: " + donny.getNama());
        System.out.println("Limit Pinjaman\t: " + donny.getLimitPeminjaman());

        int pilihan = 0;
        

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Ajukan Pinjaman");
            System.out.println("2. Angsur Pinjaman");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            pilihan = sc.nextInt();
            
            switch (pilihan) {
            case 1:
                System.out.print("Masukkan jumlah pinjaman: ");
                double pinjaman = sc.nextDouble();
                donny.pinjam(pinjaman);
                System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPeminjaman());
                break;
            case 2:
                System.out.print("Masukkan jumlah angsuran: ");
                double angsuran = sc.nextDouble();
                donny.angsur(angsuran);
                System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPeminjaman());
                break;
            case 3:
                System.out.println("Terima kasih!");
                break;
            default:
                System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
                break;
        }
        } while (pilihan != 3);
    }
}
