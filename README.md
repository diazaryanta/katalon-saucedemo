# Automation Testing Project - Katalon Studio

Repositori ini berisi proyek otomatisasi pengujian untuk Web UI (**Saucedemo & AutomationBookstore**) menggunakan **Katalon Studio**. Proyek ini mencakup alur pengujian *end-to-end* mulai dari autentikasi hingga proses transaksi.

## 🚀 Fitur Pengujian

### 1. Web UI Testing (Saucedemo)
Pengujian dilakukan pada website [Saucedemo](https://www.saucedemo.com/) dengan skenario berikut:
* **Login:** Melakukan login dengan *valid credentials* menggunakan konsep *modular test case*.
* **Sorting Produk:** Memverifikasi fungsi pengurutan produk berdasarkan harga (Low to High) menggunakan logika perbandingan *List* dan *Double*.
* **Add to Cart:** Menambahkan produk "Sauce Labs Backpack" ke keranjang dan memverifikasi keberadaan item tersebut di halaman "Your Cart".
* **Checkout Process:** Melakukan proses pengisian informasi pengiriman hingga konfirmasi pesanan selesai.

### 2. WEB UI Testing (demo qa)
Pengujian dilakukan pada website [DemoQA](https://demoqa.com/) dengan skenario berikut:
* **Alert Handling:** Menangani pop-up dengan explicit wait.
* **Handling iframe:** Menangani iframe berlapis dan memverifikasi iframe bahwa sudah sesuai.

### 3. WEB UI Testing (Automation Bookstore)
Pengujian dilakukan pada website [Automation booksore](https://automationbookstore.dev/) dengan skenario berikut:
* **Agile Books:** Mencari buku lalu memvalidasi bahwa apa yang di cari sesuai dengan search key. 

## 🛠️ Tech Stack & Tools
* **Tool:** Katalon Studio
* **Language:** Groovy
* **Library:** Web Driver (untuk Custom Web Element)
* **Version Control:** GitHub

## 📁 Struktur Proyek
* **`Test Cases/`**: Berisi skrip logika pengujian (Modular & End-to-End).
* **`Object Repository/`**: Penyimpanan terstruktur untuk element locator (XPath).
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

---

# REFLECTION QUESTION
## 1. Bagian Tersulit dalam Automation Testing di Katalon
Menurut pengalaman saya, bagian yang paling sulit adalah menangani sinkronisasi antara skrip dan elemen web, serta logika pengujian pada fitur pengurutan (*sorting*).

* **Kendala:** Sering kali terjadi error seperti *Element Not Found* atau *Step Failed* karena skrip berjalan terlalu cepat sebelum halaman web selesai memuat elemen secara sempurna. Selain itu, membuat *assertion* untuk memastikan harga benar-benar terurut dari yang terkecil ke terbesar memerlukan logika tambahan yang lebih kompleks daripada sekadar klik tombol.

* **Cara Mengatasi:** Saya mencoba mengatasinya dengan mempelajari penggunaan *Wait Command* seperti `waitForElementVisible` alih-alih hanya mengandalkan *fixed delay*. Untuk fitur *sorting*, saya belajar menggunakan *List* dan *Collections* di Groovy untuk membandingkan urutan harga yang ada di layar dengan urutan yang seharusnya. Saya juga lebih mendalami *Inspect Element* untuk membuat *Custom XPath* agar objek lebih stabil.

* **Apa yang Dipahami:** Dari proses ini, saya menyadari bahwa *automation testing* bukan hanya soal menjalankan perintah secara otomatis, melainkan tentang membangun skrip yang tangguh (*robust*) terhadap perubahan kecepatan muat halaman dan memastikan logika bisnis aplikasi benar-benar terverifikasi dengan valid.

---

## 2. Keterampilan Paling Penting untuk Pekerjaan di Dunia Nyata
Setelah menyelesaikan seluruh rangkaian *test case* mulai dari Login hingga Checkout, menurut saya keterampilan yang paling penting di dunia nyata adalah **Logika Analisis Troubleshooting** dan **Ketelitian dalam Manajemen Data**.

* **Analisis Troubleshooting**
Dalam pekerjaan nyata, aplikasi akan terus berkembang dan perubahan kecil pada kode developer bisa mematahkan skrip pengujian yang sudah kita buat. Kemampuan membaca *Log Viewer* dan memahami *Root Cause* dari sebuah error sangat krusial agar kita bisa memperbaiki skrip dengan cepat tanpa harus bingung mencari letak kesalahannya.

* **Manajemen Object Repository**
Pengalaman mengerjakan tugas ini mengajarkan saya bahwa kerapian dalam mengelola *Object Repository* sangatlah penting. Jika folder dan penamaan objek tidak rapi sejak awal, skrip akan sulit dikelola saat jumlah *test case* bertambah banyak. Di dunia kerja, kolaborasi tim sangat bergantung pada seberapa rapi dan terstruktur kodingan yang kita buat agar mudah dipahami oleh rekan kerja lainnya.
