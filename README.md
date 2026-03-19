# Automation Testing Project - Katalon Studio

Repositori ini berisi proyek otomatisasi pengujian untuk Web UI (**Saucedemo & AutomationBookstore**) menggunakan **Katalon Studio**. Proyek ini mencakup alur pengujian *end-to-end* mulai dari autentikasi hingga proses transaksi.

## 🚀 Fitur Pengujian

### 1. Web UI Testing (Saucedemo)
Pengujian dilakukan pada website [Saucedemo](https://www.saucedemo.com/) dengan skenario berikut:
* **Login:** Melakukan login dengan *valid credentials* menggunakan konsep *modular test case*.
* **Sorting Produk:** Memverifikasi fungsi pengurutan produk berdasarkan harga (Low to High) menggunakan logika perbandingan *List* dan *Double*.
* **Add to Cart:** Menambahkan produk "Sauce Labs Backpack" ke keranjang dan memverifikasi keberadaan item tersebut di halaman "Your Cart".
* **Checkout Process:** Melakukan proses pengisian informasi pengiriman hingga konfirmasi pesanan selesai.

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
    git clone https://github.com/diazaryanta/katalon-saucedemo.git
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

## Reflection Question
1. Bagian Tersulit dalam Automation Testing di Katalon.
   Menurut pengalaman saya, bagian yang paling sulit adalah menangani sinkronisasi antara skrip dan elemen web, serta logika pengujian pada fitur pengurutan (sorting).
* **Kendalanya:** Sering kali terjadi error seperti Element Not Found atau Step Failed karena skrip berjalan terlalu cepat sebelum halaman web selesai memuat elemen secara sempurna. Selain itu, membuat assertion untuk memastikan harga benar-benar terurut dari yang terkecil ke terbesar memerlukan logika tambahan yang lebih kompleks daripada sekadar klik tombol.
* **Cara Mengatasinya:** Saya mencoba mengatasinya dengan mempelajari penggunaan Wait Command seperti waitForElementVisible alih-alih hanya mengandalkan fixed delay. Untuk fitur
sorting, saya belajar menggunakan List dan Collections di Groovy untuk membandingkan urutan harga yang ada di layar dengan urutan yang seharusnya. Saya juga lebih mendalami Inspect Element untuk membuat Custom XPath agar objek lebih stabil.
* **Apa yang Dipahami:** Dari proses ini, saya menyadari bahwa automation testing bukan hanya soal menjalankan perintah secara otomatis, melainkan tentang membangun skrip yang tangguh (robust) terhadap perubahan kecepatan muat halaman dan memastikan logika bisnis aplikasi benar-benar terverifikasi dengan valid.
