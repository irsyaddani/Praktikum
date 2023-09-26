package tugas;

public class Transaksi {
    private Pembeli pembeli;
    private Kasir kasir;
    private Barang barang;
    private Stok stok;

    public Transaksi(Pembeli pembeli, Kasir kasir, Barang barang, Stok stok) {
        this.pembeli = pembeli;
        this.kasir = kasir;
        this.barang = barang;
        this.stok= stok;
    }

    public void pembelian(int jumlahBeli) {
        System.out.println("Pembelian Berhasil");
        System.out.println("=============================================");
        System.out.println("Pembeli\t\t\t\t: " + pembeli.getNama());
        System.out.println("Kasir\t\t\t\t: " + kasir.getNama() );
        System.out.println("Barang yang dibeli\t\t: " + barang.getNamaBarang());
        System.out.println("Jumlah barang yang dibeli\t: " + jumlahBeli);

        double total = jumlahBeli * barang.getHarga();
        pembeli.hitungTotalHarga(total);
        stok.kurangiStok(jumlahBeli);
        System.out.println("Total harga yang harus dibayar\t: " + pembeli.getTotalHarga());

        System.out.println("=============================================");
        System.out.println("---------------------------------------------");
        System.out.println("Sisa stok " + stok.getBarang().getNamaBarang() + " saat ini: " + stok.getJumlahBrg());
    }
}
