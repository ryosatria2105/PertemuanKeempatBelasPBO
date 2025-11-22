# 🖥️📚 TUGAS PBO – Pertemuan Keempat Belas  

**Pengembangan Keamanan + Download CSV + Normalisasi Database**  

---

## 📄 Deskripsi  
Proyek ini merupakan pengembangan dari aplikasi manajemen data **Ryo’s Gym**.  Fokus utama pada praktikum ini adalah :

- 🔐 Reset password dengan verifikasi **Security Question**
- 🧠 2 Opsi Security Question: **Choose from List** / **Custom Question**
- ✔ Validasi Confirm Password dan Unique Username
- 👁 Show Password pada Register & Forgot Password
- 📥 Download CSV untuk backup & restore data
- 🧩 Normalisasi database hingga **3NF**

Hasilnya: aplikasi lebih aman, terstruktur, dan bebas duplikasi data.

---

## ⚙️ Tahapan Implementasi

### 1️⃣ Penambahan Kolom Keamanan di Database  
Kolom baru pada tabel `akun`:
- `security_answer`
- `question_id`
- `custom_question`

<img src="https://github.com/user-attachments/assets/85ec24b1-91c8-4763-88d4-5171de741047" width="70%" />

---

### 2️⃣ Pengembangan Form Register  
Fitur yang ditambahkan:

✔ Confirm Password  
✔ Security Question → **pilih dari list atau isi custom**  
✔ Show Password  
✔ Validasi username unik  
✔ Password wajib sesuai dengan Confirm Password  

<img src="https://github.com/user-attachments/assets/a887ddd0-aa16-4a2a-bf5b-d13cd445f255" width="70%" />

---

### 3️⃣ Forgot Password Lebih Aman  
Alur reset password:

1️⃣ Masukkan username  
2️⃣ Security Question tampil otomatis  
3️⃣ Jawaban harus cocok  
4️⃣ SAVE aktif hanya jika password valid & cocok  

<img src="https://github.com/user-attachments/assets/476f2ad5-a523-4079-b044-9b21902208b7" width="70%" />

---

### 4️⃣ Fitur Download CSV  

📌 Backup data → file `.csv` untuk restore data

<img src="https://github.com/user-attachments/assets/d2a7df9a-5794-47b2-95f9-43aefd66a168" width="70%" />
<br><br>
<img src="https://github.com/user-attachments/assets/599a2b23-84ad-499b-a385-168885e105ef" width="70%" />
<br><br>
<img src="https://github.com/user-attachments/assets/f52359f0-e905-4265-a87a-a4802e77a680" width="70%" />
<br><br>
<img src="https://github.com/user-attachments/assets/63120afb-e163-49e0-8bca-6d092fb5f35b" width="70%" />
<br><br>


📍 Telah diuji: Download → Hapus data → Upload kembali → **100% sama**

---

### 5️⃣ Normalisasi Database (3NF)  

| Tabel | Isi Data |
|------|----------|
| paket_gym | daftar paket |
| member_gym | menyimpan FK id_paket |
| akun | kredensial login & keamanan |

🎯 Tidak ada redundansi, data rapi & relasi optimal

---

## 🧪 Uji Coba Program  

**Register Berhasil**  
<img src="https://github.com/user-attachments/assets/b96d9410-2f4f-4156-bb9b-4770727e2321" width="70%" />

**Reset Password Berhasil**  
<img src="https://github.com/user-attachments/assets/d006df56-b8a1-4a6f-a2bd-b6cc85816ccc" width="70%" />

**Login Berhasil**  
<img src="https://github.com/user-attachments/assets/6bb000aa-699b-4785-ac13-5e4908d6b62d" width="70%" />

**Download CSV Berjalan**  
<img src="https://github.com/user-attachments/assets/46f185ac-e798-4cfb-b27d-20d7e3c02f98" width="70%" />

---

## 👨‍💻 Author  
**Ryo Satriagung Hidayat**  
`09010624015` — Sistem Informasi  
UIN Sunan Ampel Surabaya — 2025  
