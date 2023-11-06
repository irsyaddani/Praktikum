package UTS_OOP.Soal4;

public class MahasiswaMain {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("2241720233", "Irsyad", "Malang", 'L');

        System.out.println ("NIM: \t\t: " + mahasiswa.nim);
        System.out.println ("Nama\t\t: " + mahasiswa.nama);
        System.out.println("Alamat\t\t: " + mahasiswa.alamat);
        System.out.println("Jenis Kelamin\t: " + mahasiswa.jenisKelamin);
    }
}
