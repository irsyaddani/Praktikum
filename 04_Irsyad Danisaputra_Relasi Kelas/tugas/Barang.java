package tugas;

public class Barang {
    private String namaBarang;
    private double harga;

    public Barang(String namaBarang, double harga) {
        this.namaBarang = namaBarang;
        this.harga = harga;
    }

    public void setNamaBarang(String namaBarang, double harga) {
        this.namaBarang = namaBarang;
        this.harga = harga;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public double getHarga() {
        return harga;
    }
}
