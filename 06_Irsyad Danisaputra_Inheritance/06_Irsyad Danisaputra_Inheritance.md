# Praktikum 6 - Inheritance

Nama    : Irsyad Danisaputra <br>
NIM     : 2241720233 <br>
Kelas   : 2C <br>
Absen   : 12 <br>

## Percobaan 1
1. Pada percobaan 1 diatas program yang dijalankan terjadi error, kemudian perbaiki sehingga program tersebut bisa dijalankan dan tidak error!
2. Jelaskan apa penyebab program pada percobaan 1 ketika dijalankan terdapat error!

## Percobaan 2
1. Pada percobaan 2 diatas program yang dijalankan terjadi error, kemudian perbaiki sehingga program tersebut bisa dijalankan dan tidak error!
2. Jelaskan apa penyebab program pada percobaan 1 ketika dijalankan terdapat error

## Percobaan 3
1. Jelaskan fungsi “super” pada potongan program berikut di class Tabung!
```
public void setSuperPhi(double phi) {
    super.phi = phi;
}

public void setSuperR(int r) {
    super.r = r;
}
```

2. Jelaskan fungsi “super” dan “this” pada potongan program berikut di class Tabung!
```
public void volume() {
    System.out.println("Volume Tabung adalah: " + (super.phi * super.r * super.r + this.t));
}
```

3. Jelaskan mengapa pada class Tabung tidak dideklarasikan atribut “phi” dan “r” tetapi class tersebut dapat mengakses atribut tersebut!

## Percobaan 4
1. Pada percobaan 4 sebutkan mana class yang termasuk superclass dan subclass, kemudian jelaskan alasannya!
2. Ubahlah isi konstruktor default ClassC seperti berikut: 
```
```
Tambahkan kata super() di baris Pertaman dalam konstruktor defaultnya. Coba jalankan kembali class Percobaan4 dan terlihat tidak ada perbedaan dari hasil outputnya!

3. Ublah isi konstruktor default ClassC seperti berikut:
Ketika mengubah posisi super() dibaris kedua dalam kontruktor defaultnya dan terlihat ada error. Kemudian kembalikan super() kebaris pertama seperti sebelumnya, maka errornya akan hilang.
Perhatikan hasil keluaran ketika class Percobaan4 dijalankan. Kenapa bisa tampil output
seperti berikut pada saat instansiasi objek test dari class ClassC.

Jelaskan bagaimana urutan proses jalannya konstruktor saat objek test dibuat!