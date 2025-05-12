# Aplikasi Katalog Produk Sederhana

Aplikasi Java sederhana ini mendemonstrasikan konsep pewarisan (inheritance) dalam pemrograman berorientasi objek (OOP) untuk mengelola informasi produk. Aplikasi ini memiliki struktur kelas dasar `Product` dan dua kelas turunan, `Electronics` dan `Clothing`, yang mewarisi atribut dan perilaku dari kelas `Product` sambil menambahkan atribut spesifik mereka sendiri.

## Struktur Proyek

Proyek ini terdiri dari beberapa file Java:

* `Product.java`: Kelas dasar yang mendefinisikan atribut umum untuk semua produk (nama, harga, ID produk) dan metode untuk mendapatkan informasi dasar produk.
* `Electronics.java`: Kelas turunan dari `Product` yang menambahkan atribut `warrantyMonths` dan meng-override metode `getInfo()` untuk menyertakan informasi garansi.
* `Clothing.java`: Kelas turunan dari `Product` yang menambahkan atribut `size` dan meng-override metode `getInfo()` untuk menyertakan informasi ukuran.
* `MainApp.java`: Kelas utama yang membuat instance dari kelas `Electronics` dan `Clothing` dan mencetak informasi produk ke konsol.

## Cara Menjalankan Aplikasi

1.  Pastikan Anda telah menginstal Java Development Kit (JDK) di sistem Anda.
2.  Simpan semua file `.java` di direktori yang sama.
3.  Buka terminal atau command prompt, arahkan ke direktori tempat Anda menyimpan file.
4.  Kompilasi file-file Java menggunakan perintah:
    ```bash
    javac *.java
    ```
5.  Jalankan aplikasi utama (`MainApp`) menggunakan perintah:
    ```bash
    java MainApp
    ```
