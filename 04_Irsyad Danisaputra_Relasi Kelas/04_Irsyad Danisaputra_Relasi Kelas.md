# Praktikum 4 - Relasi Kelas

Nama    : Irsyad Danisaputra <br>
NIM     : 2241720233 <br>
Kelas   : 2C <br>
Absen   : 12 <br>

## Percobaan 1
### A. Output
<img src="../04_Irsyad Danisaputra_Relasi Kelas/img/main1.png" width=200>

### B. Pertanyaan
1. Di dalam class Processor dan class Laptop , terdapat method setter dan getter untuk masing‑masing atributnya. Apakah gunanya method setter dan getter tersebut?<br>
**Jawab:** <br>
- Setter Method: digunakan untuk mengatur atau mengubah nilai properti suatu objek.
- Getter Method: digunakan untuk mengambil atau mengakses nilai properti suatu objek yang telah diset pada method setter

2. Di dalam class Processor dan class Laptop, masing‑masing terdapat konstruktor default dan konstruktor berparameter. Bagaimanakah beda penggunaan dari kedua jenis konstruktor tersebut ?<br>
**Jawab:** <br>
- Konstruktor Default:
    - Konstruktor default secara otomatis dipanggil saat objek dari kelas tersebut dibuat tanpa argumen.
    - Konstruktor default biasanya digunakan untuk melakukan inisialisasi nilai default pada objek.

- Konstruktor Berparameter:
    - Konstruktor berparameter digunakan untuk menginisialisasi objek dengan nilai-nilai yang diberikan.
    - Dengan menggunakan konstruktor berparameter, kita dapat  mengatur nilai awal objek sesuai dengan kebutuhan.
3. Perhatikan class Laptop, di antara 2 atribut yang dimiliki (merk dan proc), atribut manakah yang bertipe object ?<br>
**Jawab:** <br>
Atribut yang bertipe data object adalah proc. Atribut ini memiliki nilai berupa object Processor.

4. Perhatikan class Laptop, pada baris manakah yang menunjukan bahwa class Laptop memiliki relasi dengan class Processor ?<br>
**Jawab**: <br>
Pada baris _private Processor proc_, menunjukkan bahwa class Laptop memiliki suatu hubungan dengan class Processor.

5. Perhatikan pada class Laptop , Apakah guna dari sintaks proc.info() ?<br>
**Jawab:**
Sintaks proc.info() digunakan untuk memanggil metode info() dari objek proc yang merupakan objek dari class Processor. Method ini akan menampilkan  informasi tentang objek Processor yang terkait dengan objek Laptop.

6. Pada class MainPercobaan1, terdapat baris kode:
<br> Laptop l = new Laptop("Thinkpad", p);
<br><br> Apakah p tersebut ? Dan apakah yang terjadi jika baris kode tersebut diubah menjadi: 
<br> Laptop l = new Laptop("Thinkpad", new Processor("Intel i5",
3));
<br><br> Bagaimanakah hasil program saat dijalankan, apakah ada perubahan ?<br>
**Jawab:**
p adalah objek dari class Processor yang telah dideklarasikan dan diinisialisasi sebelumnya dengan merek "Intel" dan model "i5".
Kemudian, objek tersebut digunakan sebagai argumen kedua untuk pembuatan objek Laptop (new Laptop("Thinkpad", p)).
<br><br>
Apabila kode dirubah menjadi: <br>
Laptop l = new Laptop("Thinkpad", new Processor("Intel i5", 3)); <br>
Program akan tetap menampilkan hasil yang sama selama valuenya tidak berubah.


## Percobaan 2
### A. Output
<img src="../04_Irsyad Danisaputra_Relasi Kelas/img/main2.png" width=200>

### B. Pertanyaan
1. Perhatikan class Pelanggan. Pada baris program manakah yang menunjukan bahwa class Pelanggan memiliki relasi dengan class Mobil dan class Sopir ?<br>
**Jawab:**<br>
Pada baris (private Mobil mobil;) dan (private Sopir sopir;) menunjukkan bahwa class Pelanggan memiliki hubungan dengan class Sopir dan class Mobil.

2. Perhatikan method hitungBiayaSopir pada class Sopir, serta method hitungBiayaMobil pada class Mobil. Mengapa menurut Anda method tersebut harus memiliki argument hari ?<br>
**Jawab:**<br>
Method tersebut harus memiliki argumen hari karena biaya mobil dan sopir bergantung pada lama hari dalam penggunaan.

3. Perhatikan kode dari class Pelanggan. Untuk apakah perintah
mobil.hitungBiayaMobil(hari) dan sopir.hitungBiayaSopir(hari) ?<br>
**Jawab:**
Perintah mobil.hitungBiayaMobil(hari) akan menghitung biaya penggunaan mobil berdasarkan jumlah hari. Sedangkan, sopir.hitungBiayaSopir(hari) digunakan untuk menghitung biaya penggunaan sopir sesuai jumlah hari.
Lalu, pada method hitungBiayaTotal() digunakan untuk memberikan total biaya yang harus dibayarkan oleh pelanggan secara keseluruhan dengan menjumlahkan biaya mobil dan biaya sopir.

4. Perhatikan class MainPercobaan2. Untuk apakah sintaks p setMobil(m) dan p.setSopir(s) ?<br>
**Jawab:**<br>
sintaks p.setMobil(m) dan p.setSopir(s) digunakan untuk mengatur objek m sebagai mobil yang digunakan oleh objek p dari class Pelanggan, dan mengatur objek s sebagai sopir yang digunakan oleh objek p.

5. Perhatikan class MainPercobaan2. Untuk apakah proses p hitungBiayaTotal() tersebut ?<br>
**Jawab:**<br>
Proses p.hitungBiayaTotal() digunakan untuk menghitung biaya total yang harus dibayarkan oleh objek p dari class Pelanggan. Total biaya di sini adalah total biaya dari penjumlahan biaya mobil dan biaya sopir pada class Pelanggan.

6. Perhatikan class MainPercobaan2, coba tambahkan pada baris terakhir dari method main dan amati perubahan saat di‑run!
<br> System.out.println(p.getMobil().getMerk());<br>
<br> Jadi untuk apakah sintaks p.getMobil().getMerk() yang ada di dalam method main tersebut?<br>
**Jawab:**<br>
Sintaks p.getMobil().getMerk() digunakan untuk menampilkan merk mobil yang digunakan oleh objek p dari class Pelanggan.


## Percobaan 3
### A. Output
<img src="../04_Irsyad Danisaputra_Relasi Kelas/img/main3.png" width=200>

### B. Pertanyaan
1. Di dalam method info() pada class KeretaApi, baris this.masinis.info() dan this.asisten.info() digunakan untuk apa ?<br>
**Jawab:**
- this.masinis.info() digunakan untuk memanggil method info() pada objek masinis yang akan menampilkan info terkait masinis. 
- this.asisten.info() digunakan untuk memanggil method info() pada objek asisten yang akan menampilkan info terkait asisten. 

2. Buatlah main program baru dengan nama class MainPertanyaan pada package yang sama. Tambahkan kode berikut pada method main()
<br> Pegawai masinis = new Pegawai("1234", "Spongebob
Squarepants");
<br> KeretaApi keretaApi = new KeretaApi("Gaya Baru", "Bisnis",
masinis);
<br> System.out.println(keretaApi.info());<br>
**Jawab:**<br>
```
public class MainPertanyaan {
    public static void main(String[] args) {
        Pegawai masinis = new Pegawai("1234", "Spongebob Squarepants");
        KeretaApi keretaApi = new KeretaApi("Gaya Baru", "Bisnis", masinis);
        System.out.println(keretaApi.info());
    }
}
```

3. Apa hasil output dari main program tersebut ? Mengapa hal tersebut dapat terjadi ?<br>
**Jawab:**<br>
Pada method info() program diminta untuk menampilkan asisten, namun pada class MainPertanyaan asisten tidak diinisialisasi, hasilnya error karena asisten bersifat tidak boleh null.<br>
<img src="../04_Irsyad Danisaputra_Relasi Kelas/img/soal no 2_percobaan 3.png" width=500>

4. Perbaiki class KeretaApi sehingga program dapat berjalan!<br>
**Jawab:**<br>
```
public String info() {
        String info = "";
        info += "Nama: " + this.nama + "\n";
        info += "Kelas: " + this.kelas + "\n";
        info += "Masinis: " + this.masinis.info() + "\n";
        // info += "Asisten: " + this.asisten.info() + "\n";

        // Soal no 4 - Percobaan 3
        if (this.asisten != null) {
            info += "Asisten: " + this.asisten.info() + "\n";
        } else {
            info += "Asisten: Tidak ada\n";
        }
        return info;
    }
```
<img src="../04_Irsyad Danisaputra_Relasi Kelas/img/soal no 4_percobaan 3.png" width=200>

## Percobaan 4
### A. Output
<img src="../04_Irsyad Danisaputra_Relasi Kelas/img/main4.png" width=150>

### B. Pertanyaan
1. Pada main program dalam class MainPercobaan4, berapakah jumlah kursi dalam Gerbong A ?<br>
**Jawab:**
Jumlah kursi yang telah diinisialisasi adalah sebanyak 10 kursi

2. Perhatikan potongan kode pada method info() dalam class Kursi. Apa maksud kode tersebut ?
```
if (this.penumpang != null) {
info += "Penumpang: " + penumpang.info() + "\n";
}
```
**Jawab:**
Pada kode tersebut, terdapat kondisi if (this.penumpang != null) yang memeriksa apakah objek penumpang dalam objek Kursi tidak bernilai null. Jika kondisi tersebut terpenuhi, maka baris info += "Penumpang: " + penumpang.info() + "\n"; akan dieksekusi.  Baris ini akan menambahkan string "Penumpang: " ke dalam string info yang berisi informasi mengenai penumpang yang diperoleh dari pemanggilan method info() pada objek penumpang

Jika objek penumpang tidak bernilai null, artinya terdapat penumpang yang mengisi kursi tersebut.

3. Mengapa pada method setPenumpang() dalam class Gerbong, nilai nomor dikurangi dengan angka 1 ?<br>
**Jawab:**
Karena pada Java indeks array dimulai dari 0, sedangkan penomoran kursi dimulai dari 1. Sehingga agar mendapatkan indeks yang sesuai dalam array arrayKursi, kita perlu mengurangi nomor dengan 1. 

4. Instansiasi objek baru budi dengan tipe Penumpang, kemudian masukkan objek baru tersebut pada gerbong dengan gerbong.setPenumpang(budi, 1). Apakah yang terjadi ?<br>
**Jawab:**<br>
Meskipun penumpang Mr Krab dan Budi memesan kursi yang sama, yaitu kursi nomor 1, program tetap berjalan lalu mencetak informasi bahwa keduanya memesan kursi nomor 1. Padahal, seharusnya 1 kursi hanya bisa dipesan oleh 1 orang. Hal ini disebabkan karena pada program belum terdapat pengecekan apakah sebuah kursi sudah dipesan atau belum.<br><br>
<img src="../04_Irsyad Danisaputra_Relasi Kelas/img/soal no 4_percobaan 4.png" width=150>

5. Modifikasi program sehingga tidak diperkenankan untuk menduduki kursi yang sudah ada penumpang lain !<br>
**Jawab:**<br>
```
public void setPenumpang(Penumpang penumpang, int nomor) {
        if (this.arrayKursi[nomor - 1].getPenumpang() == null) {
            this.arrayKursi[nomor - 1].setPenumpang(penumpang);
        } else {
            System.out.println("Maaf, kursi nomor " + nomor + " sudah terisi");
        }
    }
```
<img src="../04_Irsyad Danisaputra_Relasi Kelas/img/soal no 5_percobaan 4.png" width=150>

## TUGAS
```
package tugas;

public class Kasir {
    private String namaKasir;

    public Kasir(String namaKasir) {
        this.namaKasir = namaKasir;
    }

    public void setNama(String nama) {
        this.namaKasir = namaKasir;
    }

    public String getNama() {
        return namaKasir;
    }
}

```

```
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
```

```
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

```

```
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
```

```
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
```

```
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
```
<img src="../04_Irsyad Danisaputra_Relasi Kelas/img/tugas.png" width=350>

