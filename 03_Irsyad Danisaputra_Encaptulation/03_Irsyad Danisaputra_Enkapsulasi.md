# Praktikum 3 - Enkapsulasi

Nama    : Irsyad Danisaputra <br>
NIM     : 2241720233 <br>
Kelas   : 2C <br>
Absen   : 12 <br>

## Percobaan 1
### A. Output
- Class Motor

```
package motorencapsulation;

public class Motor {
    public int kecepatan = 0;
    public boolean kontakOn = false;

    public void printStatus() {
        if (kontakOn == true) {
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + kecepatan + "\n");
    }
}
```

- Class Motor Demo :

```
package motorencapsulation;

public class MotorDemo {
    public static void main(String[] args) {
        Motor motor = new Motor();
        motor.printStatus();
        motor.kecepatan = 50;
        motor.printStatus();
    }
}
```

## Percobaan 2
### A. Output
- Class Motor

```
package motorencapsulation;

package motorencapsulation;

public class Motor {
    private int kecepatan = 0;
    private boolean kontakOn = false;

    public void nyalakanMesin() {
        kontakOn = true;
    }

    public void matikanMesin() {
        kontakOn = false;
        kecepatan = 0;
    }

    public void tambahKecepatan() {
        if (kontakOn == true) {
            kecepatan += 5;
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
        }
    }

    public void kurangiKecepatan() {
        if (kontakOn == true) {
            kecepatan -= 5;
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
        }
    }

    public void printStatus() {
        if (kontakOn == true) {
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + kecepatan + "\n");
    }
}
```

- Class MotorDemo :

```
package motorencapsulation;

public class MotorDemo {
    public static void main(String[] args) {
        Motor motor = new Motor();
        motor.printStatus();
        motor.tambahKecepatan();

        motor.nyalakanMesin();
        motor.printStatus();

        motor.tambahKecepatan();
        motor.printStatus();

        motor.tambahKecepatan();
        motor.printStatus();

        motor.tambahKecepatan();
        motor.printStatus();

        motor.matikanMesin();
        motor.printStatus();

    }
}
```

### B. Pertanyaan
1. Pada class TestMobil, saat kita menambah kecepatan untuk pertama kalinya, mengapa muncul peringatan “Kecepatan tidak bisa bertambah karena Mesin Off!”? <br>
**Jawab**:
<br> Hal ini dikarenakan method tambahKecepatan() akan memeriksa terlebih dahulu apakah mesinOn bernilai true sebelum ditambahkan kecepatannya. Jika mesinOn bernilai false, maka akan muncul peringatan "Kecepatan tidak bisa bertambah karena Mesin Off!" <br>
```
public void tambahKecepatan() {
        if (kontakOn == true) {
            kecepatan += 5;
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena mesin off!");
        }
    }
``` 

2. Mengapat atribut kecepatan dan kontakOn diset private?<br>
**Jawab**:
<br> Agar tidak dapat diakses oleh class lain, karena dengan menggunakan private kita bisa mengontrol sebuah akses yang dilakukan untuk atribut tersebut.
  
3. Ubah class Motor sehingga kecepatan maksimalnya adalah 100!<br>
```
 public void tambahKecepatan() {
        if (kontakOn == true) {
            if (kecepatan < 100) {
                kecepatan += 5;
            } else {
                System.out.println("Kecepatan Anda sudah melebihi batas!");
            }
            
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena mesin off!");
        }
    }
```

## Percobaan 3
### A. Output
- Class Anggota

```
package koperasigettersetter;

public class Anggota {
    private String nama;
    private String alamat;
    private float simpanan;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public float getSimpanan() {
        return simpanan;
    }

    public void setor(float uang) {
        simpanan += uang;
    }

    public void pinjam(float uang) {
        simpanan -= uang;
    }
}
```

- Class KoperasiDemo :

```
package koperasigettersetter;

public class KoperasiDemo {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota();
        anggota1.setNama("Iwan Setiawan");
        anggota1.setAlamat("Jalan Sukarno Hatta no 10");
        anggota1.setor(100000);
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp " + anggota1.getSimpanan());

        anggota1.pinjam(5000);
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp " + anggota1.getSimpanan());
    }
}
```

## Percobaan 4
### A. Output
- Class Anggota :

```
package koperasigettersetter;

public class Anggota {
    private String nama;
    private String alamat;
    private float simpanan;

    Anggota(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
        this.simpanan = 0;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public float getSimpanan() {
        return simpanan;
    }

    public void setor(float uang) {
        simpanan += uang;
    }

    public void pinjam(float uang) {
        simpanan -= uang;
    }
}
```

- Class KoperasiDemo :

```
package koperasigettersetter;

public class KoperasiDemo {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota("iwan", "Jalan Mawar");
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp " + anggota1.getSimpanan());

        anggota1.setNama("Iwan Setiawan");
        anggota1.setAlamat("Jalan Sukarno Hatta no 10");
        anggota1.setor(100000);
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp " + anggota1.getSimpanan());

        anggota1.pinjam(5000);
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp " + anggota1.getSimpanan());
    }
}
```

### B. Pertanyaan: Percobaan 3 dan 4
1. Apa yang dimaksud getter dan setter?<br>
**Jawab**: 
    - Getter adalah public method dan memiliki tipe data return, yang berfungsi untuk mendapatkan nilai dari atribut private
    - Setter adalah public method yang tidak memliki tipe data return,
yang berfungsi untuk memanipulasi nilai dari atribut private

2. Apa kegunaan dari method getSimpanan()?<br>
**Jawab**:
<br> Untuk mengetahui nilai dari atribut simpanan

3. Method apa yang digunakan untuk menambah saldo?<br>
**Jawab**:
<br> Method yang digunakan untuk menambah saldo adalah setor()
```
public void setor(float uang) {
        simpanan += uang;
    }
```

4. Apa yand dimaksud konstruktor?<br>
**Jawab**:
<br> Konstruktor memiliki cara deklarasi yang mirip dengan method, akan tetapi tidak memiliki tipe return. Konstruktor dieksekusi ketika instansiasi dari objek dibuat. Jadi setiap kali sebuat objek dibuat dengan keyword new() maka konstruktor akan dieksekusi. 

5. Sebutkan aturan dalam membuat konstruktor?<br>
**Jawab**:
<br>  Cara untuk membuat konstruktor adalah sebagai
berikut: 
    - Nama konstruktor harus sama dengan nama class
    - Konstruktor tidak memiliki tipe data return
    - Konstruktor tidak boleh menggunakan modifier abstract, static final, dan syncronized static, final, dan syncronized

6. Apakah boleh konstruktor bertipe private?<br>
**Jawab**:
<br> Boleh, konstruktor dapat memiliki akses modifier private. Ketika sebuah konstruktor dideklarasikan sebagai private, itu berarti konstruktor tersebut tidak dapat diakses atau dipanggil dari luar kelas tersebut.

7. Kapan menggunakan parameter dengan passsing parameter?<br>
**Jawab**:
<br> Ketika method tersbeut membutuhkan parameter untuk memanipulasi suatu nilai, biasanya berbentuk konstruktor.
8. Apa perbedaan atribut class dan instansiasi atribut?<br>
**Jawab**:
<br> 
    - Atribut Class:

        - Terkait dengan kelas itu sendiri, bukan dengan objek individu.
        - Dapat diakses langsung melalui nama kelas.
        - Perubahan nilai atribut mempengaruhi semua objek yang terkait dengan kelas.
        - Digunakan untuk menyimpan data yang bersifat umum dari kelas yang sama.

    - Instansiasi Atribut :
        - Terkait dengan objek individu yang dibuat dari kelas.
        - Hanya dapat diakses melalui objek yang dibuat.
        - Perubahan nilai atribut hanya mempengaruhi objek yang terkait.
        - Digunakan untuk menyimpan data yang unik atau berbeda untuk setiap objek individu.
9. Apa perbedaan class method dan instansiasi method?<br>
**Jawab**:
<br>
    - Class method:
        - Terkait dengan kelas itu sendiri, bukan dengan objek individu.
        - Dapat diakses langsung melalui nama kelas, tanpa perlu objek.
    - Instansiasi method:
        - Terkait dengan objek individu yang dibuat dari kelas.
        - Hanya dapat diakses melalui objek yang dibuat dari kelas tersebut.

## Tugas
1. Cobalah program dibawah ini dan tuliskan hasil outputnya<br>
**Jawab**:

2. Pada program diatas, pada class EncapTest kita mengeset age dengan nilai 35, namun pada saat ditampilkan ke layar nilainya 30, jelaskan mengapa!<br>
**Jawab**:
```
public void setAge(int newAge) {
        if (newAge > 30) {
            age = 30;
        } else {
            age = newAge;
        }
    }
```

3. Ubah program diatas agar atribut age dapat diberi nilai maksimal 30 dan minimal 18.<br>
**Jawab**:
```
public void setAge(int newAge) {
        if (newAge >= 18 && newAge <= 30) {
            age = newAge;
        } else {
            System.out.println("Umur minimal adalah 18 dan maksimal 30!  ");
        }
    }
```

4. Pada sebuah sistem informasi koperasi simpan pinjam, terdapat class Anggota yang memiliki atribut antara lain nomor KTP, nama limit peminjaman, dan jumlah pinjaman. Anggota dapat meminjam uang dengan batas limit peminjaman yang ditentukan. Anggota juga dapat mengangsur pinjaman. Ketika Anggota tersebut mengangsur pinjaman, maka jumlah pinjaman akan berkurang sesuai dengan nominal yang diangsur. Buatlah class Anggota tersebut, berikan atribut, method dan konstruktor sesuai dengan kebutuhan. Uji dengan TestKoperasi berikut ini untuk memeriksa apakah class Anggota yang anda buat telah sesuai dengan yang diharapkan.<br>
**Jawab**:
```
package Tugas;

public class Anggota {
    private String nomorKTP;
    private String nama;
    private double limitPeminjaman;
    private double jumlahPinjaman;

    public Anggota(String nomorKTP, String nama, double limitPeminjaman) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPeminjaman = limitPeminjaman;
        this.jumlahPinjaman = 0.0;
    }

    public String getNama() {
        return nama;
    }
    
    public double getLimitPeminjaman() {
        return limitPeminjaman;
    }
    
    public double getJumlahPeminjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(double ajuPinjam) {
       jumlahPinjaman += ajuPinjam;
       if (jumlahPinjaman > limitPeminjaman) {
        System.out.println("Maaf, pinjaman Anda melebihi limit!");
        jumlahPinjaman -= ajuPinjam;
       } 

    }

    public void angsur(double angsur) {
        jumlahPinjaman -= angsur;
    }

}

```
```
package Tugas;

public class TestKoperasi {
    public static void main(String[] args) {
        Anggota donny = new Anggota("111333444", "Donny" , 5000000);
        System.out.println("Nama Anggota\t: " + donny.getNama());
        System.out.println("Limit Pinjaman\t: " + donny.getLimitPeminjaman());

        System.out.println("\nMeminjam uang 10.000.000...");
        donny.pinjam(10000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPeminjaman());
        
        System.out.println("\nMeminjam uang 4.000.000...");
        donny.pinjam(4000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPeminjaman());
        
        System.out.println("\nMembayar angsuran 1.000.000...");
        donny.angsur(1000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPeminjaman());
        
        System.out.println("\nMembayar angsuran 3.000.000...");
        donny.angsur(3000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPeminjaman());
    }
}
```

5. Modifikasi soal no. 4 agar nominal yang dapat diangsur minimal adalah 10% dari jumlah pinjaman saat ini. Jika mengangsur kurang dari itu, maka muncul peringatan “Maaf, angsuran harus 10% dari jumlah pinjaman”.<br>
**Jawab**:
```
    public void angsur(double angsur) {
        double minimalAngsuran = 0.1 * jumlahPinjaman;
        if (angsur < minimalAngsuran) {
            System.out.println("Maaf, minimal angsuran adalah 10% dari jumlah pinjaman");
        } else {
            jumlahPinjaman -= angsur;
            System.out.println("Angsuran berhasil. Jumlah pinjaman saat ini: " + jumlahPinjaman);
        }
    }

```

6. Modifikasi class TestKoperasi, agar jumlah pinjaman dan angsuran dapat menerima input dari console.<br>
**Jawab**:
```
package Tugas;
import java.util.Scanner;

public class TestKoperasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Anggota donny = new Anggota("111333444", "Donny" , 5000000);
        System.out.println("Nama Anggota\t: " + donny.getNama());
        System.out.println("Limit Pinjaman\t: " + donny.getLimitPeminjaman());

        int pilihan = 0;
        

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Ajukan Pinjaman");
            System.out.println("2. Angsur Pinjaman");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            pilihan = sc.nextInt();
            
            switch (pilihan) {
            case 1:
                System.out.print("Masukkan jumlah pinjaman: ");
                double pinjaman = sc.nextDouble();
                donny.pinjam(pinjaman);
                System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPeminjaman());
                break;
            case 2:
                System.out.print("Masukkan jumlah angsuran: ");
                double angsuran = sc.nextDouble();
                donny.angsur(angsuran);
                System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPeminjaman());
                break;
            case 3:
                System.out.println("Terima kasih!");
                break;
            default:
                System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
                break;
        }
        } while (pilihan != 3);
    }
}
```