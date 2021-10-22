# Modul 2 : Dasar Pemrograman Java

## Dasar Teori
* Keyword dalam Java

  Identifier yang telah dipesan untuk di definisikan sebelumnya oleh Java untuk tujuan tertentu.
* Tipe Dasar

  Java mempunyai 8 tipe dasar, yaitu boolean, char, byte, short, int, long, float, dan juga ada double.
* Variabel

  Ssebagai penanda suatu tipe data ataupun nama pada masing masing identifier.
* Casting dan Promotion

  Biasa diperlukan untuk mengkoversi untuk suatu tipe ke tipe data yang lebih kecil panjang bitnya.

<hr>

## Praktikum
Soal : 
1. Menganalisa batasan maksimum dari suatu tipe
2. Anak Ayam
3. A + B - C

Jawaban :
1. [Jawaban Soal 1](https://github.com/renzien/20104012_Alif-Rizki-Ramdhana_S1SEA_Pemrograman2/blob/modul2/src/modul2/latihan/BigInteger.java)

  ```java
  long p = 2147483648;
  ```
  Syntax diatas akan menampilkan error:
  ```java
  E:\Folder Alif\Folder Kuliah\Semester 3\Folder Praktikum\Praktikum Pemrograman 2\Source Code\Tugas\Github\20104012_Alif-Rizki-Ramdhana_S1SEA_Pemrograman2\out\production\20104012_Alif-Rizki-Ramdhana_S1SEA_Pemrograman2" modul2.latihan.BigInteger error: integer number too large: 2147483648
  ```
  Mengapa error itu bisa terjadi padahal daya tampung tipe data long adalah 2^63-1 ? Error tersebut terjadi karena java akan membaca syntax tersebut dengan tipe data integer   bukan tipe data long. Jika kita ingin menggunakan tipe data long seperti syntax diatas maka kita harus menambah huruf(suffix) "L" dibelakang angka agar java dapat membaca     tipe data yang kita maksud adalah tipe data long.

  Contoh:
  ```java
  long p = 2147483648L;
  ```


2. [Jawaban Soal 2](https://github.com/renzien/20104012_Alif-Rizki-Ramdhana_S1SEA_Pemrograman2/blob/modul2/src/modul2/latihan/AnakAyam.java)
   
   ```java
   Anak ayam turunlah 10, Mati satu tinggalah 9
   Anak ayam turunlah 9, Mati satu tinggalah 8
   Anak ayam turunlah 8, Mati satu tinggalah 7
   Anak ayam turunlah 7, Mati satu tinggalah 6
   Anak ayam turunlah 6, Mati satu tinggalah 5
   Anak ayam turunlah 5, Mati satu tinggalah 4
   Anak ayam turunlah 4, Mati satu tinggalah 3
   Anak ayam turunlah 3, Mati satu tinggalah 2
   Anak ayam turunlah 2, Mati satu tinggalah 1
   Anak Ayam turun 1, Mati satu tinggalah induknya
   ```
   
   Dengan menggunakan perulangan for, pada codingannya untuk mengulang angka yang telah  diinput, contoh seperti ini 
   ```java
   Masukan Jumlah Ayam : 10
   ```
   
3. [Jawaban Soal 3](https://github.com/renzien/20104012_Alif-Rizki-Ramdhana_S1SEA_Pemrograman2/blob/modul2/src/modul2/latihan/Abc.java)
   
   Pertama, user akan diminta untuk menginput berapa jumlah testcase yang akan diuji coba, semisal :
   ```java
   Masukkan Jumlah Testcase : 2
   ```
   
   Kemudian, sistem akan menampilkan list hurun A sampai dengan C, dengan yang dimulai dengan angka 1 dan berganti ke angka 2, seperti :
   ```java
   Masukkan A1 : 2
   Masukkan B1 : 3
   Masukkan C1 : 4
   
   Masukkan A2 : -1
   Masukkan B2 : -3
   Masukkan C2 : -7
   ```
   
   Bagaimana itu bisa terjadi ? Dikarenakan, pada saat pengcodingan, digunakan sebuah perulangan for, yang dimana i = 0,
   maka, akan ditambahkan dengan angka 1. 
   ```java
           for (int i = 0; i < t; i++) {
            System.out.print("\nMasukkan A" + (i + 1) + "\t: ");
            a[i] = sc.nextInt();
            System.out.print("Masukkan B" + (i + 1) + "\t: ");
            b[i] = sc.nextInt();
            System.out.print("Masukkan C" + (i + 1) + "\t: ");
            c[i] = sc.nextInt();
        }
   ```
   Lalu compiler, otomatis membaca, dan sesuai dengan sifatnya dimana, jika i = 0, dan akan di tambahkan dengan angka 1,
   maka, otomatis akan naik menjadi 1. 
   
   
   
<hr>

## Kesimpulan

Kesimpulannya, pada praktikum ini kita sebagai mahasiswa, di ingatkan kembali tentang apa itu java, dan bagaimana pengoperasiannya
