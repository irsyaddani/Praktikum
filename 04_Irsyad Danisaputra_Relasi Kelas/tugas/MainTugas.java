package tugas;

// Class MainProgram
public class MainTugas {
    public static void main(String[] args) {
        Pembeli pembeli = new Pembeli("Naufal");

        Kasir kasir = new Kasir("Falah");

        Barang barang = new Barang("Novel", 150000);
        Stok stok = new Stok(barang, 10);

        Transaksi transaksi = new Transaksi(pembeli, kasir, barang, stok);

        transaksi.pembelian(3);

        System.out.println("Total harga yang harus dibayar oleh " + pembeli.getNama() + "\t: " + pembeli.getTotalHarga());
    }
}
