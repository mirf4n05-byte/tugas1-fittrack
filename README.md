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