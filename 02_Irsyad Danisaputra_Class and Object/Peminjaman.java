public class Peminjaman {
    public int lamaPinjam;
    public String idMember;

    public int sewa(int harga) {
        return this.lamaPinjam * harga;
    } 

    public void TampilDataPeminjaman(String namaGame, int harga) {
        System.out.println("Lama peminjaman\t\t: " + lamaPinjam + " hari");
        System.out.println("Total harga sewa\t: " + "Rp " + sewa(harga));
        System.out.println("-----------------------------------------");
    }
}