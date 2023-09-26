package tugas;

public class Stok {
    private Barang barang;
    private int jumlahBarang;

    public Stok(Barang barang, int jumlahBarang) {
        this.barang = barang;
        this.jumlahBarang = jumlahBarang;
    }

    public void setBarang(Barang barang) {
        this.barang = barang;
    }

    public Barang getBarang() {
        return barang;
    }

    public void setJumlahBrg(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }

    public int getJumlahBrg() {
        return jumlahBarang;
    }

    public void tampilStok() {
        System.out.println("Nama Barang\t: " + barang.getNamaBarang());
        System.out.println("Harga \t\t: " + barang.getHarga());
        System.out.println("Jumlah Barang\t: " + jumlahBarang);
    }

    public void kurangiStok(int jumlahBeli) {
        if (jumlahBarang >= jumlahBeli) {
            jumlahBarang -= jumlahBeli;
        } else {
            System.out.println("Maaf, stok barang tidak cukup");
        }
    }
}
