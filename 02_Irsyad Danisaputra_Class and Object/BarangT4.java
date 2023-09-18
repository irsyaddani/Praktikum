public class BarangT4 {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;

    public int hitungHargaJual() {
        return  (int) (hargaDasar - (diskon * hargaDasar));
    }

    public void tampilData() {
        System.out.println("===========================");
        System.out.println("Struk Toko Naufal");
        System.out.println("===========================");
        System.out.println("Nama Barang\t: " + namaBarang);
        System.out.println("Kode Barang\t: " + kode);
        System.out.println("Harga\t\t: " + "Rp " + hargaDasar);
        System.out.println("Diskon\t\t: " + (int) (diskon * 100) + "%");
        System.out.println("---------------------------");
        System.out.println("Harga Total\t: " + "Rp " + hitungHargaJual());
    }
}