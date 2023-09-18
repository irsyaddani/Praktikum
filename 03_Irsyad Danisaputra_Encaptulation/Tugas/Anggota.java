package Tugas;

public class Anggota {
    private String nomorKTP;
    private String nama;
    private double limitPeminjaman;
    private double jumlahPinjaman;

    public Anggota(String nomorKTP, String nama, double limitPeminjaman) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPeminjaman = limitPeminjaman;
        this.jumlahPinjaman = 0.0;
    }

    public String getNama() {
        return nama;
    }
    
    public double getLimitPeminjaman() {
        return limitPeminjaman;
    }
    
    public double getJumlahPeminjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(double ajuPinjam) {
       jumlahPinjaman += ajuPinjam;
       if (jumlahPinjaman > limitPeminjaman) {
        System.out.println("Maaf, pinjaman Anda melebihi limit!");
        jumlahPinjaman -= ajuPinjam;
       } 

    }

    public void angsur(double angsur) {
        double minimalAngsuran = 0.1 * jumlahPinjaman;
        if (angsur < minimalAngsuran) {
            System.out.println("Maaf, minimal angsuran adalah 10% dari jumlah pinjaman");
        } else {
            jumlahPinjaman -= angsur;
            System.out.println("Angsuran berhasil. Jumlah pinjaman saat ini: " + jumlahPinjaman);
        }
    }

}
