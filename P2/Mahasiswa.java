public class Mahasiswa {
    String nama, nim, kelas;
    int noAbsen;

    Mahasiswa(String nim, String nam, String kls, int abs) {
        nim = nim;
        nama = nam;
        kelas = kls;
        noAbsen = abs;
    }

    public void TampilData() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Kelas: " + kelas);
        System.out.println("Nomor Absen: " + noAbsen);
    }
}

