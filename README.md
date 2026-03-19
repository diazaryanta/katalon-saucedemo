# Automation Testing Project - Katalon Studio

Repositori ini berisi proyek otomatisasi pengujian untuk Web UI (**Saucedemo**) dan API (**Swagger Petstore**) menggunakan **Katalon Studio**. Proyek ini mencakup alur pengujian *end-to-end* mulai dari autentikasi hingga proses transaksi.

## 🚀 Fitur Pengujian

### 1. Web UI Testing (Saucedemo)
Pengujian dilakukan pada website [Saucedemo](https://www.saucedemo.com/) dengan skenario berikut:
* **Login:** Melakukan login dengan *valid credentials* menggunakan konsep *modular test case*.
* **Sorting Produk:** Memverifikasi fungsi pengurutan produk berdasarkan harga (Low to High) menggunakan logika perbandingan *List* dan *Double*.
* **Add to Cart:** Menambahkan produk "Sauce Labs Backpack" ke keranjang dan memverifikasi keberadaan item tersebut di halaman "Your Cart".
* **Checkout Process:** Melakukan proses pengisian informasi pengiriman hingga konfirmasi pesanan selesai.

### 2. API Testing (Swagger Petstore)
Pengujian fungsionalitas REST API pada [Swagger Petstore](https://petstore.swagger.io/):
* **Delete User:** Melakukan penghapusan data pengguna berdasarkan *username*.
* **Multi-level Assertion:** * Verifikasi *Status Code* (200 OK).
    * Verifikasi *Response Body* (Property code, type, dan message).
    * Verifikasi integritas data dengan memastikan data yang dihapus mengembalikan status `404 Not Found` pada pemanggilan berikutnya.

## 🛠️ Tech Stack & Tools
* **Tool:** Katalon Studio
* **Language:** Groovy / Java
* **Library:** Selenium Web Driver (untuk Custom Web Element)
* **Version Control:** Git & GitHub

## 📁 Struktur Proyek
* **`Test Cases/`**: Berisi skrip logika pengujian (Modular & End-to-End).
* **`Object Repository/`**: Penyimpanan terstruktur untuk element locator (XPath & CSS) dan API Request.
* **`Scripts/`**: Kode Groovy yang menggerakkan logika pengujian.

## ⚙️ Cara Menjalankan
1.  *Clone* repositori ini ke komputer lokal:
    ```bash
    git clone [https://github.com/diazaryanta/api-testing.git](https://github.com/diazaryanta/api-testing.git)
    ```
2.  Buka **Katalon Studio** dan pilih **Open Project**.
3.  Arahkan ke folder hasil *clone*.
4.  Buka salah satu *Test Case* (misalnya: `Checkout Process`).
5.  Klik tombol **Run** menggunakan browser pilihan Anda (Chrome/Firefox).

## 💡 Hal Penting yang Dipelajari
Dalam mengerjakan proyek ini, beberapa poin krusial yang diimplementasikan adalah:
* **Synchronization:** Penggunaan `waitForElementVisible` untuk menangani elemen yang dinamis.
* **Custom Assertion:** Penggunaan logika matematika untuk memvalidasi urutan harga produk.
* **Modularization:** Memanggil *Test Case* di dalam *Test Case* lain (`callTestCase`) untuk efisiensi skrip.
* **Git Integration:** Mengelola autentikasi menggunakan *Personal Access Token* (PAT) untuk proses *push* ke GitHub.

---
*Dibuat oleh Diaz Aryanta sebagai bagian dari tugas praktikum Software Quality Assurance.*
