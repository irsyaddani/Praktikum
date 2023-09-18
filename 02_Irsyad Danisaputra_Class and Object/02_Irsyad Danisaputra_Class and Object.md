# Praktikum 2 - Class and Object

Nama : Irsyad Danisaputra <br>
NIM : 2241720233 <br>
Kelas : 2C <br>
Absen : 12 <br>

## Percobaan 1

### A. Output

1. UML Diagram<br>
   <img src="JS2_P1.png" width=450>
2. Class: Karyawan, Jabatan
3. Atribut:
   - Class Karyawan: id (int), nama (String), jenisKelamin (char)
   - Class Jabatan: jabatan (String), gaji (long)
4. Method
   - Class Karyawan: tampilBiodata() -> void
   - Class Jabatan: hitungGaji() -> long

## Percobaan 2

### A. Output

<br><img src="P2.png" width=300>

### B. Pertanyaan

1. Jelaskan pada bagian mana proses pendeklarasian atribut pada program diatas!<br>
   **Jawab**:
   <br>Pendeklarasian atribut pada program tersebut ditunjukkan pada kode program: - Public int nim - Public String nama - Public String alamat - Public String kelas

2. Jelaskan pada bagian mana proses pendeklarasian method pada program diatas!<br>
   **Jawab**:
   <br>Pendeklarasian atribut pada program tersebut ditunjukkan pada kode program tampilBiodata()
3. Berapa banyak objek yang di instansiasi pada program diatas!<br>
   **Jawab**:
   <br>Hanya 1 objek, yaitu mhs1.
4. Apakah yang sebenarnya dilakukan pada sintaks program “mhs1.nim=101” ?<br>
   **Jawab**:
   <br>Sintaks tersebut bertujuan untuk mengakses atribut nim dari mhs1 dan sekaligus mengatur value nya menjadi 101
5. Apakah yang sebenarnya dilakukan pada sintaks program “mhs1.tampilBiodata()” ?<br>
   **Jawab**:
   <br>Sintaks tersebut bertujuan untuk mengakses method/ fungsi tampilBiodata() yang berisi informasi biodata dari objek mhs1.
6. Instansiasi 2 objek lagi pada program diatas!<br>
   **Jawab**:

```
public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jl. Vinolia N0. 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodata();
        System.out.println("-------------------------------------");
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nim = 102;
        mhs2.nama = "Nana";
        mhs2.alamat = "Jl. Jakarta No. 18";
        mhs2.kelas = "1A";
        mhs2.tampilBiodata();
        System.out.println("-------------------------------------");
        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.nim = 103;
        mhs3.nama = "Farel";
        mhs3.alamat = "Jl. Semarang No. 13";
        mhs3.kelas = "1A";
        mhs3.tampilBiodata();
    }
}
```

<br><img src="JS2_P2 b.png" width=250>

## Percobaan 3

### A. Output

<br><img src="P3.png" width=300>

### B. Pertanyaan

1. Apakah fungsi argumen dalam suatu method?<br>
   **Jawab**:
   <br>Argumen dalam suatu method adalah nilai atau data yang dikirim ke method saat memanggilnya. Fungsi argumen adalah memberikan input kepada method agar dapat melakukan tindakan atau komputasi yang sesuai dengan nilai-nilai yang diberikan.
2. Ambil kesimpulan tentang kegunaan dari kata kunci return, dan kapan suatu method harus memiliki return!<br>
   **Jawab**:
   <br>
   <br>Return digunakan untuk mengembalikan nilai dari suatu method. Ketika sebuah method dieksekusi, seringkali kita ingin mendapatkan hasil atau nilai dari method tersebut, pada saat inilah kita harus menggunakan return.

## Tugas

1.  Suatu toko persewaan video game salah satu yang diolah adalah peminjaman, dimana data yang dicatat ketika ada orang yang melakukan peminjaman adalah id, nama member, nama game, dan harga yang harus dibayar. Setiap peminjaman bisa menampilkan data hasil peminjaman dan harga yang harus dibayar. Buatlah class diagram pada studi kasus diatas!

        Penjelasan:
        - Harga yang harus dibayar diperoleh dari lama sewa x harga.
        - Diasumsikan 1x transaksi peminjaman game yang dipinjam hanya 1 game saja.<br>

    **Jawab:**
    <br><img src="JS2_T1.png" width=245>

2.  Buatlah program dari class diagram yang sudah anda buat di no 1!<br>
    **Jawab**

```
public class Member {
    public String idMember;
    public String namaMember;

    public void tampilMember() {
        System.out.println("=========================================");
        System.out.println("Data Peminjaman Game oleh Member");
        System.out.println("=========================================");
        System.out.println("Nama Member\t\t: " + namaMember);
        System.out.println("ID Member\t\t: " + idMember);
        System.out.println("-----------------------------------------");
    }
}
```

```
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
```

```
public class VideoGame {
    public String idGame;
    public String namaGame;
    public int harga;

    public void tampilGame() {
        System.out.println("Nama Game\t\t: " + namaGame);
        System.out.println("ID Game\t\t\t: " + idGame);
        System.out.println("Harga\t\t\t: " + "Rp " + harga);
        System.out.println("-----------------------------------------");
    }
}
```

```
public class Tugas1Main {
    public static void main(String[] args) {
        Member memb1 = new Member();
        memb1.namaMember = "Falah";
        memb1.idMember = "10";
        memb1.tampilMember();

        VideoGame game1 = new VideoGame();
        game1.namaGame = "Genshin Impact";
        game1.idGame = "2110";
        game1.harga = 75000;
        game1.tampilGame();

        Peminjaman pinjam1 = new Peminjaman();

        pinjam1.idMember = "10";
        pinjam1.lamaPinjam = 10; //hari
        pinjam1.TampilDataPeminjaman(game1.namaGame, game1.harga);

    }
}
```

<br><img src="JS2_T2 e.png" width=300><br>
<br> 3. Buatlah program sesuai dengan class diagram berikut ini:
<br><img src="SoalT3.png" width=200>

```
public class Lingkaran {
    public double phi;
    public double r;

    public double hitungLuas() {
        return phi * r *r;
    }

    public double hitungKeliling() {
        return phi * 2 * r;
    }
}
```

```
public class LingkaranMain {
    public static void main(String[] args) {
        Lingkaran ling1 = new Lingkaran();
        ling1.phi = 3.14;
        ling1.r = 4; //dalam cm
        System.out.println("Lingkaran 1");
        System.out.println("Luas lingkaran 1 adalah " + ling1.hitungLuas() + " cm");
        System.out.println("Keliling lingkaran 1 adalah " + ling1.hitungKeliling() + " cm");
    }
}
```

<br><img src="JS2_T3 a.png" width=300><br><br> 4. Buatlah program sesuai dengan class diagram berikut ini:
<br>Deskripsi / Penjelasan : - Nilai atribut hargaDasar dalam Rupiah dan atribut diskon dalam % - Method hitungHargaJual() digunakan untuk menghitung harga jual dengan perhitungan berikut ini:
<br>**harga jual = harga dasar – (diskon x harga dasar)**<br>

```
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
```

```
public class BarangT4Main {
    public static void main(String[] args) {
        BarangT4 brg1 = new BarangT4();
        brg1.namaBarang = "Buku Novel";
        brg1.kode = "1012";
        brg1.hargaDasar = 75000;
        brg1.diskon = 0.15f;
        brg1.tampilData();
    }
}
```

<br><img src="JS2_T4.png" width=250>
