# UTS OOP

Nama : Irsyad Danisaputra <br>
NIM : 2241720233 <br>
Kelas : 2C <br>
Absen : 12 <br>

## SOAL 1: Penulisan Class
Berdasarkan contoh class ClassA di bawah ini, jelaskan apakah penulisan source code pada contoh class tersebut sudah benar. Jika tidak, apa yang perlu diperbaiki?
```
public class ClassA { 
    float f1 = 0.15f;
    
    float hitung() { 
        float x = 2f * f1;
    }
}

```
#### Jawab
Terdapat kesalahan pada bagian method hitung() karena tidak ada sintaks untuk mengembalikan nilai. Berikut source code yang telah diperbaiki:
```
package UTS_OOP.Soal1;

public class ClassA {
    float f1 = 0.15f;

    float hitung() {
        // float x = 2f * f1; // this code was error
        return 2f * f1;
    }
}
```

## SOAL 2: Perhitungan Jumlah Elemen Array 2 Dimensi
Pada class SoalArray1, terdapat array 2 dimensi dengan ukuran 3x3. Tuliskan code Java untuk menghitung jumlah total elemen array tersebut dengan menggunakan perulangan.
```
public class SoalArray1 {
    public static void main(String[] args) {
        int[][] arrayInt = {{1, 1, 4}, {2, 1, 2}, {3, 2, 1}};
        // hitung jumlah elemen array 2 dimensi
        // gunakan perulangan
    }
}
```
#### Jawab
```
package UTS_OOP.Soal2;

public class SoalArray {
    public static void main(String[] args) {
        int[][] arrayInt = {{1, 1, 4}, {2, 1, 2}, {3, 2, 1}};
        int total = 0;

        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = 0; j < arrayInt [i].length; j++) { 
                total += arrayInt[i][j];
            }
        }
        System.out.println ("Jumlah total elemen array: " + total);
    }
}
```

## Soal 3: Pewarisan Atribut dan Method
Pada source code yang diberikan, class ClassY merupakan turunan dari class Class. Sebutkan atribut dan method apa saja yang diwarisi oleh ClassY dari kelas induknya (class Class). Jelaskan juga apa output dari code yang ditulis pada class ClassY dan bagaimana nilai tersebut diperoleh.

```
public class Class {
    int a = 2;
    int x = 0;

    int hitung() {
        x = x + 5 * a;
        return x;
    }
}

public class ClassY extends Class {
    int b = 5;
    int y = 0;

    int hitungY() {
        y = hitung() * b;
        return y;
    }

    public static void main(String[] args) {
        ClassY cy = new ClassY();
        System.out.println(cy.hitungY());
    }
}
```
#### Jawab

Source Code:
1. class Class
```
package UTS_OOP.Soal3;

public class Class {
    int a = 2;
    int x = 0;

    int hitung() {
        x = x + 5 * a;
        return x;
    }
}
```
2. class ClassY
```
package UTS_OOP.Soal3;

public class ClassY extends Class {
    int b = 5;
    int y = 0;

    int hitungY() {
        y = hitung() * b;
        return y;
    }
}
```
3. class ClassMain
```
package UTS_OOP.Soal3;

public class ClassMain {
    public static void main(String[] args) {
        ClassY cy = new ClassY();
        System.out.println(cy.hitungY());
    }
}
```
Semua atribut dari class Class yaitu int a, int x, dan int hitung() akan diwariskan ke class ClassY. Output akan menghasilkan 50 yang berasal dari penghitungan dari method hitungY() yang mana akan mengalikan hasil dari method hitung() dengan b.  Method hitung() memiliki nilai kembalian x + 5 * a yang hasilnya adalah 10.

## Soal 4: Class Mahasiswa dengan Constructor
Dalam class Mahasiswa, lengkapi code dengan:
1.	Menambahkan constructor untuk mengisi atribut nim, nama, alamat, dan jenisKelamin.
2.	Membuat objek mahasiswa dan mengisi atribut nim, nama, alamat, dan jenisKelamin melalui constructor.

```
public class Mahasiswa { String nim, nama, alamat; char jenisKelamin;

// a. Tambahkan constructor
// Gunakan constructor untuk
// mengisi atribut nim, nama, alamat, jenisKelamin

public static void main(String[] args) {
// b. Buat objek mahasiswa
// Isi atribut nim, nama, alamat, jenisKelamin
// lewat constructor
}
}

```
#### Jawab
1. class Mahasiswa
```
package UTS_OOP.Soal4;

public class Mahasiswa {
        String nim, nama, alamat;
        char jenisKelamin;

    public Mahasiswa (String nim, String nama, String alamat, char jenisKelamin) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
    }
}
```
2. class MahasiswaMain
```
package UTS_OOP.Soal4;

public class MahasiswaMain {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("2241720233", "Irsyad", "Malang", 'L');

        System.out.println ("NIM: \t\t: " + mahasiswa.nim);
        System.out.println ("Nama\t\t: " + mahasiswa.nama);
        System.out.println("Alamat\t\t: " + mahasiswa.alamat);
        System.out.println("Jenis Kelamin\t: " + mahasiswa.jenisKelamin);
    }
}
```

## Soal 5: OOP Buku -> Penulis
Perhatikan class diagaram berikut dan Buatlah Source code dalam Bahasa java berdasarkan class diagram tersebut

#### Jawab
1. class Buku
```
package UTS_OOP.Soal5;

public class Buku {
    private String ISBN, judul;
    private Penulis penulis;
    private int harga;

    String getISBN() {
        return ISBN;
    }

    void setISBN(String iSBN) {
        this.ISBN = iSBN;
    }

    String getJudul() {
        return judul;
    }

    void setJudul(String judul) {
        this.judul = judul;
    }

    int getHarga() {
        return harga;
    }

    void setHarga(int harga) {
        this.harga = harga;
    }

    Penulis getPenulis() {
        return penulis;
    }

    void setPenulis(Penulis penulis) {
        this.penulis = penulis;
    }
}

```

2. class Penulis
```
package UTS_OOP.Soal5;

public class Penulis {
    private String nama, alamat;

    String getNama() {
        return nama;
    }

    void setNama(String nama) {
        this.nama = nama;
    }

    String getAlamat() {
        return alamat;
    }

    void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
```

3. class Main
```
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
```
