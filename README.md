# Tugas 1 - Sistem Keanggotaan Gym FitTrack

- Nama: Muhammad Irfan
- NPM: 250810701100023
- Mata Kuliah Praktikum: Praktikum PBO
- Kelas praktikum: A

## Deskripsi Singkat

FitTrack adalah bisnis Gym yang selama ini mencatat data member secara manual. Program ini adalah langkah awal digitalisasi: menyimpan data member di komputer resepsionis dan memastikan setiap data yang masuk valid, supaya kesalahan input seperti nomor telepon yang salah format tidak terulang.

## Fitur Utama

- Staf dapat mencatat member baru lengkap dengan nama, nomor telepon, tanggal daftar, dan jenis paket.
- Jika staf tidak atau lupa memilih paket, member otomatis terdaftar di paket Basic.
- Sistem menolak data yang salah dan tidak sesuai format (nama kosong, nomor telepon tanpa awalan 0 atau kurang dari 10 digit, paket di luar Basic/Premium/VIP, tanggal kosong, salah format, atau melebihi hari ini) dan menampilkan alasan penolakannya.
- Jika satu data ditolak, member tetap tercatat dengan nilai bawaan, dan data yang sudah benar tidak ikut hilang.
- Staf dapat mencetak seluruh member dalam satu daftar yang rapi dan terstruktur.

## Struktur Project

```text
tugas1-fittrack/
  src/
    Member.java
    TesFitTrack.java
  .gitignore
  README.md
```

## Prasyarat

- JDK Version 26.0.2.1
- IDE yang disarankan: Visual Studio Code dengan Extension Pack for Java

## Cara Menjalankan Program

### Lewat IntelliJ IDEA

1. Buka IntelliJ, pilih File, Open, lalu pilih folder `tugas1-fittrack`.
2. Pastikan folder `src` bertanda biru. Kalau belum, klik kanan `src`, pilih Mark Directory as, lalu Sources Root.
3. Buka `TesFitTrack.java`, lalu klik ikon segitiga hijau di samping method `main`.
4. Pilih Run 'TesFitTrack.main()'. Hasilnya muncul di panel Run di bagian bawah.

### Lewat command line

Jalankan dari folder utama project:

```bash
javac -d out src/Member.java src/TesFitTrack.java
java -cp out TesFitTrack
```

Perintah pertama mengompilasi kedua file dan menaruh hasilnya di folder `out`. Perintah kedua menjalankan program.

## Konsep OOP yang Diterapkan

| Konsep | Lokasi | Alasan |
| --- | --- | --- |
| Class dan object | `Member`; objeknya dibuat di `TesFitTrack` | Data member dikemas dalam 1 file class Member agar nantinya data satu member menjadi satu paket |
| Encapsulation | Atribut `private`, getter dan setter di `Member` | perubahan data bisa lewat setter yang memvalidasi atribut tersebut |
| Constructor overloading dan `this(...)` | Dua constructor di `Member` | Pendaftaran member tanpa disertai nama paket akan otomatis dilabelkan dengan basic |
| Validasi di setter, dipanggil constructor | Setter dan constructor di `Member` | Aturan cukup ditulis sekali saja (prinsip DRY) dengan constructor memanggil setter |
| Override `toString()` | `Member` | Menimpa method object sehingga object akan tercetak sebagai teks berlabel, bukan alamat memori |
| Array dan perulangan `for` | `TesFitTrack` | dapat menyimpan dan mencetak data member sekaligus |
| Konstanta `final` | `Member` | Magic number dan magic String akan muncul jika tidak dipakai |