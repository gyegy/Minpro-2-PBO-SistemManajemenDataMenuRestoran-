# Sistem Manajemen Data Menu Restoran

## 1. Deskripsi Singkat Program

Sistem Manajemen Data Menu Restoran merupakan program berbasis Java yang digunakan untuk mengelola data kategori dan menu restoran. Program ini memiliki fitur untuk menambah, menampilkan, mengubah, dan menghapus data menu serta menambah dan menampilkan data kategori.

## 2. Tujuan Program

Program ini dibuat dengan beberapa tujuan, yaitu:

1. Membuat sistem sederhana untuk mengelola data menu restoran.
2. Menerapkan konsep Pemrograman Berorientasi Objek dalam program Java.
3. Menerapkan konsep encapsulation untuk melindungi data pada setiap object.
4. Menerapkan inheritance melalui hubungan antara class `Menu`, `MenuMakanan`, dan `MenuMinuman`.
5. Menerapkan polymorphism melalui penggunaan method `tampilkanInfo()`.
6. Menggunakan `ArrayList` untuk menyimpan data kategori dan menu.
7. Menerapkan validasi input agar data yang dimasukkan pengguna sesuai dengan aturan program.

---

## 3. Fitur Program

### 3.1 Tambah Kategori

Pengguna dapat menambahkan kategori baru dengan memasukkan:

- ID kategori
- Nama kategori
- Deskripsi kategori

Program akan melakukan pengecekan ID kategori untuk memastikan tidak terdapat ID yang sama dengan data yang sudah tersimpan.

### 3.2 Tampilkan Kategori

Program dapat menampilkan seluruh kategori yang telah tersimpan.

Informasi yang ditampilkan meliputi:

- ID kategori
- Nama kategori
- Deskripsi kategori

### 3.3 Tambah Menu

Pengguna dapat menambahkan menu baru dengan memasukkan:

- ID menu
- Nama menu
- Kategori
- Harga
- Jenis menu

Program menyediakan dua jenis menu, yaitu:

- Menu Makanan
- Menu Minuman

Sebelum menu ditambahkan, program akan memeriksa apakah ID menu sudah digunakan.

### 3.4 Tampilkan Menu

Program dapat menampilkan seluruh menu yang tersimpan.

Informasi menu ditampilkan menggunakan method `tampilkanInfo()` yang disesuaikan dengan jenis menu.

### 3.5 Update Menu

Pengguna dapat memperbarui data menu berdasarkan ID menu.

Data yang dapat diperbarui meliputi:

- Nama menu
- Kategori
- Harga
- Jenis makanan atau jenis minuman

Program terlebih dahulu mencari menu berdasarkan ID yang dimasukkan. Jika menu ditemukan, data akan diperbarui.

### 3.6 Hapus Menu

Pengguna dapat menghapus menu berdasarkan ID menu.

Jika ID menu ditemukan, data akan dihapus dari daftar menu. Jika tidak ditemukan, program akan memberikan informasi bahwa menu tidak tersedia.

### 3.7 Validasi Input

Program memiliki beberapa validasi untuk mencegah kesalahan input, antara lain:

- Input tidak boleh kosong.
- Pilihan menu harus berupa angka.
- Pilihan harus berada pada rentang yang ditentukan.
- Harga harus berupa angka.
- Harga tidak boleh bernilai negatif.
- ID menu tidak boleh duplikat.
- ID kategori tidak boleh duplikat.
- Kategori yang dipilih harus tersedia.

---

## 4. Struktur Program

Program terdiri dari beberapa class yang memiliki fungsi dan tanggung jawab masing-masing. Setiap class digunakan untuk mengelola bagian tertentu dalam sistem sehingga program dapat menjalankan proses pengelolaan data menu restoran.

### 4.1 `SistemManajemenDataMenuRestoran`

Class `SistemManajemenDataMenuRestoran` merupakan class utama yang digunakan untuk menjalankan program.

Class ini berisi method `main()` sebagai titik awal program. Di dalam class ini terdapat proses inisialisasi data awal, pembuatan object, menu utama, input pengguna, serta proses pemanggilan fitur tambah, tampil, update, dan hapus data.

Class ini juga menangani proses validasi input melalui beberapa method bantuan seperti `inputString()`, `inputPilihan()`, dan `inputHarga()`.

### 4.2 `Restoran`

Class `Restoran` digunakan untuk mengelola data yang terdapat pada sistem restoran.

Class ini menyimpan daftar menu dan daftar kategori menggunakan `ArrayList`. Beberapa proses yang ditangani oleh class ini meliputi:

- Menambahkan kategori.
- Mencari kategori.
- Menambahkan menu.
- Mencari menu.
- Memperbarui menu.
- Menghapus menu.

Class `Restoran` juga melakukan pengecekan terhadap ID menu dan ID kategori agar tidak terjadi data dengan ID yang sama.

Selain itu, class ini menggunakan `Collections.unmodifiableList()` pada getter daftar menu dan daftar kategori untuk menjaga data internal agar tidak dapat dimodifikasi secara langsung dari luar class.

### 4.3 `Kategori`

Class `Kategori` digunakan untuk merepresentasikan data kategori menu restoran.

Class ini memiliki beberapa attribute, yaitu:

- `idKategori`
- `namaKategori`
- `deskripsi`

Data tersebut digunakan untuk memberikan informasi mengenai kategori yang digunakan pada menu restoran.

### 4.4 `Menu`

Class `Menu` merupakan superclass yang digunakan sebagai dasar untuk jenis-jenis menu yang terdapat pada program.

Class ini menyimpan informasi umum yang dimiliki oleh setiap menu, yaitu:

- `idMenu`
- `namaMenu`
- `kategori`
- `harga`

Class `Menu` juga menyediakan method `tampilkanInfo()` yang kemudian dapat dioverride oleh subclass.

### 4.5 `MenuMakanan`

Class `MenuMakanan` merupakan subclass dari `Menu` yang digunakan untuk merepresentasikan menu makanan.

Selain menggunakan attribute dan method yang diwariskan dari `Menu`, class ini memiliki attribute khusus berupa `jenisMakanan`.

Class `MenuMakanan` juga melakukan overriding terhadap method `tampilkanInfo()` untuk menampilkan informasi menu makanan sesuai dengan karakteristiknya.

### 4.6 `MenuMinuman`

Class `MenuMinuman` merupakan subclass dari `Menu` yang digunakan untuk merepresentasikan menu minuman.

Class ini memiliki attribute khusus berupa `jenisMinuman` selain attribute yang diwariskan dari `Menu`.

Class `MenuMinuman` juga melakukan overriding terhadap method `tampilkanInfo()` sehingga informasi menu minuman dapat ditampilkan sesuai dengan jenisnya.

---

## 5. Alur Program

### 5.1 Inisialisasi Data

Ketika program dijalankan, sistem terlebih dahulu membuat object `Restoran`.

Setelah itu, program membuat beberapa kategori awal yang digunakan sebagai data awal sistem, yaitu kategori makanan dan minuman.

Program juga membuat dummy data menu berupa:

- `M001 - Nasi Goreng`
- `M002 - Es Teh`

Data tersebut dimasukkan ke dalam `ArrayList` sehingga program sudah memiliki data yang dapat ditampilkan ketika pertama kali dijalankan.

### 5.2 Menu Utama

Setelah proses inisialisasi selesai, program menampilkan menu utama yang terdiri dari:

1. Tambah Kategori
2. Tampilkan Kategori
3. Tambah Menu
4. Tampilkan Menu
5. Update Menu
6. Hapus Menu
7. Keluar

Pengguna dapat memilih salah satu operasi dengan memasukkan nomor pilihan.

### 5.3 Tambah Kategori

Pada proses tambah kategori, pengguna diminta memasukkan ID kategori, nama kategori, dan deskripsi.

Sebelum kategori ditambahkan, program melakukan pengecekan terhadap ID kategori. Jika ID sudah digunakan, data tidak akan ditambahkan.

### 5.4 Tampilkan Kategori

Program mengambil seluruh kategori yang tersimpan kemudian menampilkannya satu per satu.

Informasi yang ditampilkan terdiri dari ID kategori, nama kategori, dan deskripsi.

### 5.5 Tambah Menu

Pada proses tambah menu, pengguna memasukkan ID menu, nama menu, kategori, harga, dan jenis menu.

Pengguna dapat memilih jenis menu berupa makanan atau minuman.

Jika memilih makanan, program akan membuat object `MenuMakanan`. Jika memilih minuman, program akan membuat object `MenuMinuman`.

Sebelum data ditambahkan, program melakukan pengecekan terhadap ID menu untuk memastikan ID tersebut belum digunakan.

### 5.6 Tampilkan Menu

Program mengambil seluruh data menu dari daftar menu kemudian menampilkan informasi setiap menu menggunakan method `tampilkanInfo()`.

Karena method tersebut dioverride oleh `MenuMakanan` dan `MenuMinuman`, informasi yang ditampilkan akan menyesuaikan jenis object menu.

### 5.7 Update Menu

Pada proses update, pengguna memasukkan ID menu yang ingin diperbarui.

Jika menu ditemukan, pengguna dapat memasukkan data baru berupa:

- Nama menu
- Kategori
- Harga
- Jenis makanan atau jenis minuman

Setelah seluruh data dimasukkan, program memperbarui object menu yang dipilih.

### 5.8 Hapus Menu

Pada proses hapus, pengguna memasukkan ID menu yang ingin dihapus.

Program akan mencari menu berdasarkan ID tersebut. Jika ditemukan, menu akan dihapus dari daftar menu. Jika tidak ditemukan, program akan memberikan pesan bahwa menu tidak tersedia.

### 5.9 Keluar Program

Jika pengguna memilih pilihan nomor 7, nilai variabel program akan diubah sehingga perulangan utama berhenti dan program selesai dijalankan.

---

## 6. Penerapan Konsep PBO

### 6.1 Class dan Object

Program menggunakan beberapa class untuk merepresentasikan bagian-bagian dari sistem restoran.

Object dibuat berdasarkan class yang telah didefinisikan. Salah satu contohnya adalah pembuatan object kategori:

```java
Kategori kategoriMakanan = new Kategori(
    "K001",
    "Makanan",
    "Kategori makanan restoran"
);

noted: untuk kode readme (```java) saya cari tau sendiri bang dari ai

Contoh tersebut menunjukkan bahwa `kategoriMakanan` merupakan object dari class `Kategori`.

Program juga membuat object dari subclass seperti:

```java
Menu makananAwal = new MenuMakanan(
    "M001",
    "Nasi Goreng",
    kategoriMakanan,
    25000,
    "Makanan Utama"
);

Contoh tersebut menunjukkan bahwa object `makananAwal` dibuat menggunakan class `MenuMakanan`, tetapi dapat disimpan menggunakan tipe `Menu`.

### 6.2 Constructor

Constructor digunakan untuk memberikan nilai awal ketika sebuah object dibuat.

Pada program ini constructor terdapat pada beberapa class seperti `Kategori`, `Menu`, `MenuMakanan`, `MenuMinuman`, dan `Restoran`.

Dengan constructor, object dapat langsung dibuat dengan data yang diperlukan sehingga proses pembuatan object menjadi lebih terstruktur.

### 6.3 Access Modifier

Program menggunakan access modifier `private` pada attribute untuk membatasi akses langsung dari luar class.

Contohnya:

```java
private String namaMenu;
private double harga;
```

Attribute tersebut tidak dapat diakses secara langsung dari class lain dan harus menggunakan method yang telah disediakan.

Penggunaan access modifier tersebut membantu membatasi akses terhadap data internal object.

### 6.4 Encapsulation

Encapsulation diterapkan dengan menyembunyikan data internal object dan menyediakan getter serta setter sebagai perantara untuk mengakses atau mengubah data.

Contohnya:

```java
public String getNamaMenu() {
    return namaMenu;
}
```

dan:

```java
public void setNamaMenu(String namaMenu) {
    this.namaMenu = namaMenu;
}
```

Selain menggunakan getter dan setter, class `Restoran` juga menjaga daftar internalnya dengan menggunakan:

```java
Collections.unmodifiableList(daftarMenu)
```

dan:

```java
Collections.unmodifiableList(daftarKategori)
```

Hal tersebut membuat daftar internal tidak dapat dimodifikasi secara langsung dari luar class.

### 6.5 Inheritance

Inheritance diterapkan melalui class `Menu` sebagai superclass dan `MenuMakanan` serta `MenuMinuman` sebagai subclass.

Implementasinya terdapat pada:

```java
public class MenuMakanan extends Menu
```

dan:

```java
public class MenuMinuman extends Menu
```

Dengan inheritance, kedua subclass dapat menggunakan attribute dan method yang berasal dari class `Menu`.

Selain itu, masing-masing subclass memiliki attribute khusus sesuai dengan jenis menu, yaitu `jenisMakanan` pada `MenuMakanan` dan `jenisMinuman` pada `MenuMinuman`.

### 6.6 Polymorphism

Polymorphism diterapkan dengan menggunakan tipe superclass untuk menyimpan object dari subclass.

Pada class `Restoran`, daftar menu menggunakan:

```java
private ArrayList<Menu> daftarMenu;
```

Daftar tersebut dapat menyimpan object `MenuMakanan` maupun `MenuMinuman`.

Ketika program menjalankan:

```java
for (Menu menu : restoran.getDaftarMenu()) {
    menu.tampilkanInfo();
}
```

method `tampilkanInfo()` akan dijalankan sesuai dengan jenis object sebenarnya.

`MenuMakanan` dan `MenuMinuman` melakukan overriding terhadap method `tampilkanInfo()` sehingga masing-masing dapat memberikan informasi tambahan sesuai dengan jenis menu.

---

## 7. Validasi Program

Program menerapkan validasi untuk mengurangi kesalahan input dari pengguna.

### 7.1 Validasi Input Kosong

Program tidak menerima input berupa string kosong.

Jika pengguna tidak memasukkan data, program akan menampilkan pesan:

```text
>> Input tidak boleh kosong
```

### 7.2 Validasi Pilihan

Pilihan menu harus berupa angka dan harus berada dalam rentang yang telah ditentukan.

Jika pengguna memasukkan karakter atau angka di luar rentang, program akan meminta input kembali.

### 7.3 Validasi Harga

Harga harus berupa angka dan tidak boleh bernilai negatif.

Jika pengguna memasukkan harga negatif, program akan menampilkan pesan:

```text
>> Harga tidak boleh negatif
```

### 7.4 Validasi ID Menu

Program melakukan pengecekan terhadap ID menu sebelum data ditambahkan.

Jika ID sudah digunakan, program akan menampilkan pesan:

```text
>> ID Menu sudah digunakan
```

### 7.5 Validasi ID Kategori

Program juga melakukan pengecekan terhadap ID kategori.

Jika ID kategori sudah digunakan, program akan menampilkan pesan:

```text
>> ID Kategori sudah digunakan
```

### 7.6 Validasi Kategori

Pada saat menambahkan atau memperbarui menu, pengguna harus memilih kategori yang tersedia.

Jika ID kategori yang dimasukkan tidak ditemukan, program akan memberikan pesan:

```text
>> Kategori tidak ditemukan
```

---

## 8. Nilai Tambah

Nilai tambah yang diterapkan pada program adalah **polymorphism**.

Polymorphism digunakan melalui hubungan antara superclass `Menu` dengan subclass `MenuMakanan` dan `MenuMinuman`.

Selain polymorphism, program juga menerapkan beberapa pengembangan tambahan, seperti:

- Validasi input untuk berbagai kondisi.
- Pengecekan ID menu agar tidak terjadi duplikasi.
- Pengecekan ID kategori agar tidak terjadi duplikasi.
- Penggunaan `Collections.unmodifiableList()` untuk menjaga daftar internal.
- Update menu yang dapat mengubah nama, kategori, harga, dan jenis menu.

---

## 9. Dokumentasi Program

Dokumentasi program digunakan untuk menunjukkan hasil penggunaan fitur yang telah dibuat.

### 9.1 Tampilan Menu Utama

Menampilkan pilihan fitur yang dapat digunakan oleh pengguna.

**Dokumentasi:**

<img width="363" height="190" alt="image" src="https://github.com/user-attachments/assets/e286c8cb-4a6e-4417-bf8e-50fd823727d7" />


### 9.2 Menampilkan Kategori

Menampilkan data kategori yang telah tersedia di dalam sistem.

**Dokumentasi:**

<img width="371" height="393" alt="image" src="https://github.com/user-attachments/assets/644f190c-293c-4bdf-8a8f-df0889cdf249" />


### 9.3 Menampilkan Menu

Menampilkan data menu yang telah tersedia, termasuk dummy data yang diberikan pada saat program dijalankan.

<img width="359" height="467" alt="image" src="https://github.com/user-attachments/assets/24e06034-6533-448d-8ef5-21a356f7dfdf" />

---

<img width="355" height="212" alt="image" src="https://github.com/user-attachments/assets/046e69f0-4e60-4a7e-a87f-8669f6067f50" />


### 9.4 Menambahkan Kategori

Menampilkan proses ketika pengguna menambahkan kategori baru.

**Dokumentasi:**

<img width="359" height="319" alt="image" src="https://github.com/user-attachments/assets/9b331b88-60d6-437e-a75b-db2b01c49c03" />


### 9.5 Menambahkan Menu

Menampilkan proses penambahan menu baru dengan memilih kategori dan jenis menu.

**Dokumentasi:**

<img width="361" height="569" alt="image" src="https://github.com/user-attachments/assets/4fec72c1-fd7d-444e-b223-84da828bb3b6" />


### 9.6 Memperbarui Menu

Menampilkan proses perubahan data menu yang meliputi nama, kategori, harga, dan jenis menu.

**Dokumentasi:**

<img width="359" height="640" alt="image" src="https://github.com/user-attachments/assets/3dbadf98-e7d6-4f7a-ac08-cc526dd8f5e3" />

### 9.7 Menghapus Menu

Menampilkan proses penghapusan data menu berdasarkan ID menu.

**Dokumentasi:**

<img width="355" height="277" alt="image" src="https://github.com/user-attachments/assets/36ee38a1-c040-4272-9ba8-2670bcd9f3aa" />

### 9.8 Validasi Input

Menampilkan contoh ketika program menangani input yang tidak sesuai, seperti input kosong, harga negatif, atau input bukan angka.

**Dokumentasi:**

<img width="368" height="230" alt="image" src="https://github.com/user-attachments/assets/66fc279f-fc7b-497f-baac-06e3c7769eec" />

---

<img width="362" height="274" alt="image" src="https://github.com/user-attachments/assets/2c455e39-1725-474f-9ed6-c905e7b48c02" />

---

<img width="357" height="652" alt="image" src="https://github.com/user-attachments/assets/2e3aba16-bc94-40f1-80f6-cfe5d800e89c" />

---
