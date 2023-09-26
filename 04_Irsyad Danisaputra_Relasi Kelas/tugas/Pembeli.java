package tugas;

public class Pembeli {
    private String namaPembeli;
    private double totalHarga;

    public Pembeli(String namaPembeli) {
        this.namaPembeli = namaPembeli;
        this.totalHarga = 0;
    }

    public void setNama(String nama) {
        this.namaPembeli = namaPembeli;
    }

    public String getNama() {
        return namaPembeli;
    }

    public void setTotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }
    
    public double getTotalHarga() {
        return totalHarga;
    }

    public void hitungTotalHarga(double harga) {
        totalHarga += harga;
    }
}
