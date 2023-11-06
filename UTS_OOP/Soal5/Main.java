package UTS_OOP.Soal5;

public class Main {
    public static void main(String[] args) {
        Penulis P = new Penulis();
        P.setNama("Naufal");
        P.setAlamat("Malang");

        Buku B = new Buku();
        B.setISBN("5678");
        B.setJudul("Rintik Hujan");
        B.setPenulis(P);
        B.setHarga(75000);

        System.out.println("====== Data Buku ======");
        System.out.println("Judul Buku\t: " + B.getJudul());
        System.out.println("ISBN\t\t: " + B.getISBN());
        System.out.println("Penulis\t\t: " + B.getPenulis().getNama());
        System.out.println("Harga\t\t: " + B.getHarga());
        System.out.println("========================");
    }
}