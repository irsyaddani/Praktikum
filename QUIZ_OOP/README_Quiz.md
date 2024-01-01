# Quiz 1 OOP

Nama : Irsyad Danisaputra <br>
NIM : 2241720233 <br>
Kelas : 2C <br>
Absen : 12 <br>

### A. Class dan Object
1. Apa yang dimaksud dengan "class" dalam pemrograman berorientasi objek?<br>
<b>Jawab: </b>
Class adalah blueprint / cetakan dalam membuat sebuah objek. Class berisi state (atribut) dan behavior (method/fungsi) yang menggambarkan suatu entitas.

2. Bagaimana Anda mendefinisikan objek dari suatu class dalam bahasa pemrograman Java?
<b>Jawab: <b>
```
NamaClass namaObjek = new NamaClass();
```

3. Misalkan Anda memiliki class "Barang" dalam sistem informasi inventaris. Bagaimana Anda akan membuat objek "laptop" dari class tersebut?<br>
<b>Jawab: </b>
```
Barang laptop = new Barang();
```

### B. Encapsulation 
1. Jelaskan konsep encapsulation dalam pemrograman berorientasi objek dan mengapa hal ini penting dalam pengembangan sistem informasi inventaris barang.<br>
<b>Jawab: </b>
Encapsulation dapat dijelaskan sebagai pembungkusan atau penyembunyian rincian internal suatu objek dari entitas eksternal. Rincian internal ini melibatkan status (atribut) dan perilaku (metode) objek. Praktik ini memiliki signifikansi karena beberapa alasan, termasuk keamanan data dan mempermudah proses pengembangan. Terkait keamanan data, encapsulation memungkinkan pembatasan akses langsung ke atribut objek, memastikan bahwa hanya metode tertentu yang dapat mengubah nilai atribut. 

2. Dalam konteks sistem informasi inventaris, sebutkan contoh atribut (variabel) yang harus di-encapsulate dan mengapa<br>
<b>Jawab: </b>
1. Jumlah Stok
Menjamin bahwa perubahan pada stok hanya dapat terjadi melalui operasi tertentu, seperti penambahan atau pengurangan yang sesuai, dan memvalidasi agar stok tidak pernah menjadi negatif.
2. Status Barang
Karena perubahan pada status ini bisa memengaruhi proses lain dalam sistem, seperti perhitungan ketersediaan barang atau penyelesaian pesanan, sehingga penting untuk memastikan validitas perubahan status tersebut.

### C. Relasi Kelas
1. Apa yang dimaksud dengan relasi antara kelas dalam pemrograman berorientasi objek?<br>
<b>Jawab: </b>
Hubungan antara kelas dalam pemrograman berorientasi objek merujuk pada keterkaitan yang terjadi antara dua atau lebih kelas. Keterkaitan ini mencerminkan interaksi antar kelas tersebut, baik secara langsung maupun tidak langsung. Terdapat empat jenis relasi umum yang sering dijumpai, yakni asosiasi, komposisi, kebergantungan (dependency), dan pewarisan (inheritance). Pemetaan hubungan antar kelas dapat dilakukan dengan menggunakan diagram kelas.

2. Dalam sistem informasi inventaris barang, bagaimana Anda akan menggambarkan relasi antara kelas "Barang" dan kelas "Kategori"?<br>
<b>Jawab: </b>
Relasi antara Barang dan Kategori dapat digambarkan dengan relasi Asosiasi.

### D. PBL
1. Berdasarkan kasus sistem informasi inventaris barang, coba buat sebuah class sederhana beserta atribut dan metodenya yang menggambarkan suatu entitas
dalam sistem tersebut (misalnya, class "Barang").<br>
<b>Jawab: </b>
<img src="//QUIZ_OOP/lib/pbl_1.png">



2. Bagaimana Anda akan menggunakan encapsulation untuk melindungi atributatribut dalam class tersebut?<br>
<b>Jawab: </b>
Dalam kode tersebut, terlihat bahwa setiap atribut memiliki access modifier private, sehingga tidak dapat diakses secara langsung dari kelas lain tanpa menggunakan metode setter dan getter.

3. Gambarkan hierarki class atau hubungan antar class yang mungkin ada dalam sistem informasi inventaris barang di jurusan Teknologi Informasi. Berikan contoh
relasi antar class (misalnya, inheritance atau association) dalam konteks tersebut.<br>
<b>Jawab: </b>
<img src="//QUIZ_OOP/lib/pbl_2.png">