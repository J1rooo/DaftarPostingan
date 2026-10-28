package com.example.daftarpostingan.data

/**
 * Isi postingan berupa ringkasan berita terkini (Oktober 2026), ditulis ulang dengan kalimat sendiri.
 * Angka dan tanggal mengacu pada pemberitaan media nasional yang terbit sampai 28 Oktober 2026.
 */
object NewsData {

    val posts: List<Post> = listOf(
        Post(
            userId = 1, id = 1,
            title = "BMKG Catat 1.297 Titik Panas, Sumatera Terbanyak",
            body = "JAKARTA - BMKG mendeteksi 1.297 titik panas berkepercayaan tinggi di seluruh Indonesia per 14 Oktober 2026. " +
                "Sumatera menyumbang paling banyak dengan 505 titik, disusul Kalimantan 346 titik serta Papua dan Maluku 330 titik. " +
                "Citra satelit Himawari pada 15 Oktober juga memperlihatkan sebaran asap di Sumatera, Kalimantan, Sulawesi, Maluku, dan Papua. " +
                "BMKG meminta daerah dengan curah hujan rendah dan vegetasi kering tetap waspada terhadap karhutla."
        ),
        Post(
            userId = 1, id = 2,
            title = "Karhutla: 639 Hektare Lahan Masih Ditangani di Enam Provinsi",
            body = "JAKARTA - Menurut laporan BNPB per 12 Oktober 2026, kebakaran hutan dan lahan seluas 639,23 hektare masih dalam penanganan " +
                "di enam provinsi prioritas: Kalimantan Tengah, Kalimantan Selatan, Kalimantan Barat, Sumatera Selatan, Jambi, dan Riau. " +
                "Area terbakar terluas berada di kawasan Taman Nasional Tanjung Puting, Kalimantan Tengah, sekitar 513,89 hektare."
        ),
        Post(
            userId = 2, id = 3,
            title = "Musim Hujan 2026/2027 Datang Terlambat, Durasinya Lebih Singkat",
            body = "JAKARTA - BMKG memprediksi awal musim hujan di 61,08 persen wilayah Indonesia mundur dari rata-rata biasanya. " +
                "Kombinasi El Nino dan Indian Ocean Dipole memperpanjang kekeringan, sehingga sebagian besar daerah baru masuk musim hujan pada " +
                "November sampai Desember 2026. Karena jarak antara awal dan puncak musim hujan berdekatan, masyarakat diminta mewaspadai " +
                "lonjakan hujan intens yang berpotensi memicu banjir dan longsor."
        ),
        Post(
            userId = 2, id = 4,
            title = "Asap Karhutla Ganggu Belajar, Komisi X DPR Ingatkan Pedoman ISPU",
            body = "JAKARTA - Komisi X DPR meminta pemerintah menjaga kelangsungan pendidikan anak di tengah kabut asap karhutla. " +
                "Sesuai pedoman penyesuaian pembelajaran, ketika Indeks Standar Pencemar Udara (ISPU) mencapai kategori sangat tidak sehat " +
                "(201-300) atau berbahaya (di atas 300), pembelajaran tatap muka dihentikan sementara. DPR juga menekankan koordinasi sekolah " +
                "dan layanan kesehatan untuk memantau kondisi siswa."
        ),
        Post(
            userId = 3, id = 5,
            title = "IHSG Dibuka Anjlok 8 Persen, BEI Langsung Trading Halt",
            body = "JAKARTA - Indeks Harga Saham Gabungan dibuka merosot 8,01 persen ke level 5.393,92 pada Jumat (16/10/2026), turun 469,86 poin " +
                "dari penutupan sehari sebelumnya di 5.863,78. Penurunan tersebut memicu trading halt selama 30 menit di Bursa Efek Indonesia. " +
                "Tekanan jual dipicu pengumuman MSCI soal kemungkinan penurunan klasifikasi pasar saham Indonesia."
        ),
        Post(
            userId = 3, id = 6,
            title = "MSCI Buka Konsultasi Turunkan Status Pasar Saham RI ke Standalone Market",
            body = "NEW YORK / JAKARTA - MSCI mengumumkan pada 15 Oktober 2026 bahwa pihaknya membuka konsultasi atas usulan menurunkan klasifikasi " +
                "Indonesia dari emerging market menjadi standalone market. Konsultasi berlangsung hingga 30 April 2027, dengan keputusan final " +
                "paling lambat 30 Juni 2027. Selama proses itu MSCI membekukan sejumlah perubahan indeks untuk saham Indonesia. BEI menegaskan " +
                "status Indonesia belum otomatis turun, sementara OJK menyatakan terus membenahi pasar modal."
        ),
        Post(
            userId = 4, id = 7,
            title = "IHSG Terpangkas Hampir 15 Persen dalam Sepekan",
            body = "JAKARTA - BEI mencatat IHSG pada pekan 12-16 Oktober 2026 turun 14,91 persen dari penutupan pekan sebelumnya di 6.093,75. " +
                "Pada Jumat (16/10) indeks sempat jatuh lebih dari 11 persen setelah trading halt dicabut, dan menurut catatan sejumlah media " +
                "menjadi koreksi harian terdalam sejak krisis 1998. Istana disebut memantau gejolak pasar tersebut."
        ),
        Post(
            userId = 4, id = 8,
            title = "Sempat Rebound, IHSG Kembali Tertekan Awal Pekan Ini",
            body = "JAKARTA - Setelah menguat 4,90 persen pada pekan 19-23 Oktober dan ditutup di 5.439,26 pada Jumat (23/10), IHSG kembali " +
                "melemah. Pada Selasa (27/10) indeks sempat turun sekitar 3 persen menjelang penutupan akibat rupiah yang melemah, aksi jual " +
                "asing, dan koreksi saham berkapitalisasi besar. Pada Rabu (28/10) IHSG kembali melemah sekitar 1,33 persen mendekati level 5.200. " +
                "Akumulasi jual bersih asing sepanjang 2026 mendekati Rp97 triliun."
        ),
        Post(
            userId = 5, id = 9,
            title = "Danantara: Dukungan untuk Pasar Modal Tetap Berlanjut",
            body = "JAKARTA - Danantara menegaskan akan terus mendukung reformasi pasar modal bersama OJK, termasuk penegakan aturan, di tengah " +
                "sorotan MSCI. Managing Director Danantara Pahala Nugraha Mansury pada Senin (19/10/2026) mengatakan fundamental ekonomi " +
                "Indonesia masih baik dan investasi untuk menopang Bursa Efek Indonesia akan dilanjutkan."
        ),
        Post(
            userId = 5, id = 10,
            title = "Rupiah Tembus Rp18.000 per Dolar AS Saat IHSG Anjlok",
            body = "JAKARTA - Nilai tukar rupiah menembus level Rp18.000 per dolar AS pada Jumat (16/10/2026), bersamaan dengan anjloknya IHSG " +
                "di sesi pertama. Investor asing tercatat melakukan jual bersih sekitar Rp2,92 triliun pada sesi tersebut. Tekanan terhadap rupiah " +
                "juga datang dari imbal hasil obligasi AS yang tinggi dan ketidakpastian arah suku bunga bank sentral AS."
        ),
        Post(
            userId = 6, id = 11,
            title = "Pasar Menanti Keputusan Suku Bunga The Fed Kamis Dini Hari",
            body = "WASHINGTON - Rapat FOMC The Fed digelar 27-28 Oktober 2026, dengan keputusan diumumkan Rabu (28/10) pukul 14.00 waktu AS " +
                "atau Kamis dini hari WIB. Pada September The Fed menaikkan suku bunga 25 basis poin ke 3,75-4 persen, kenaikan pertama sejak 2023. " +
                "Awal Oktober, pasar lebih memperkirakan suku bunga ditahan dulu, dengan kenaikan berikutnya baru pada Desember."
        ),
        Post(
            userId = 6, id = 12,
            title = "Antrean BBM Mengular di Bali, Pertamina Minta Maaf",
            body = "DENPASAR - Sejumlah SPBU di Bali dipenuhi antrean panjang sejak pekan kedua Oktober 2026 karena pasokan BBM langka, terutama Pertalite. " +
                "Direktur Utama Pertamina Simon Aloysius Mantiri menyampaikan permohonan maaf kepada warga Bali pada Rabu (14/10). " +
                "Pertamina Patra Niaga menambah pasokan 20.500 kiloliter lewat kapal tanker yang dijadwalkan sandar bertahap pada 12, 14, dan " +
                "16 Oktober, serta mengimbau warga membeli BBM sesuai kebutuhan."
        ),
        Post(
            userId = 7, id = 13,
            title = "Kelangkaan BBM Meluas, Ombudsman Panggil ESDM dan Pertamina",
            body = "JAKARTA - Antrean BBM tidak hanya terjadi di Bali. Laporan dari sejumlah daerah, antara lain Aceh Barat Daya, Padang, Pontianak, " +
                "dan Malang, menunjukkan antrean panjang pada Oktober 2026. Ombudsman RI memanggil Kementerian ESDM dan Pertamina pada pekan " +
                "ketiga Oktober untuk membahas evaluasi distribusi, termasuk hambatan penyaluran jalur laut."
        ),
        Post(
            userId = 7, id = 14,
            title = "KPK Tahan Lima Tersangka OTT di BNPB",
            body = "JAKARTA - KPK menahan lima tersangka pada Rabu (14/10/2026), sehari setelah operasi tangkap tangan di lingkungan Badan Nasional " +
                "Penanggulangan Bencana. Dalam OTT pada Selasa (13/10) tersebut KPK mengamankan 14 orang, termasuk Sekretaris Utama BNPB, pejabat " +
                "pembuat komitmen, dan pihak swasta. Perkara ini terkait dugaan korupsi pengadaan barang dan jasa, termasuk yang memakai dana siap " +
                "pakai kebencanaan. BNPB menyatakan menghormati proses hukum dan asas praduga tak bersalah."
        ),
        Post(
            userId = 8, id = 15,
            title = "Timnas Indonesia Juara FIFA ASEAN Cup 2026 Lewat Adu Penalti",
            body = "JAKARTA - Timnas Indonesia mengalahkan Thailand 4-2 lewat adu penalti setelah bermain imbang 2-2 selama 120 menit di Stadion " +
                "Utama Gelora Bung Karno, Senin (5/10/2026). Gol Indonesia dicetak Dean James dan Elkan Baggott, sedangkan kiper Emil Audero " +
                "menggagalkan salah satu tendangan Thailand. Gelar ini menjadi yang pertama setelah Indonesia enam kali kalah di final."
        ),
        Post(
            userId = 8, id = 16,
            title = "Indonesia Lampaui Target Medali di Asian Para Games 2026",
            body = "NAGOYA - Hingga Jumat (23/10/2026), sehari sebelum penutupan, kontingen Indonesia mengoleksi 13 emas, 17 perak, dan 36 perunggu " +
                "(total 66 medali) dan duduk di peringkat kedelapan klasemen. Capaian itu melampaui target awal 7 emas, 8 perak, dan 17 perunggu " +
                "dengan harapan masuk 10 besar. Emas ke-13 datang dari pasangan para bulu tangkis Suryo Nugroho dan Muh Al Imran."
        ),
        Post(
            userId = 9, id = 17,
            title = "Harga BBM Oktober Stabil, Pertamax Tetap Rp15.950 per Liter",
            body = "JAKARTA - Pertamina Patra Niaga memastikan harga BBM subsidi maupun nonsubsidi pada Oktober 2026 sama dengan bulan sebelumnya. " +
                "Pertamax dijual Rp15.950 per liter, sedangkan Pertamina Dex Rp25.200 per liter. Untuk BBM subsidi, harga dijamin tidak berubah " +
                "hingga akhir 2026."
        ),
        Post(
            userId = 9, id = 18,
            title = "Pemerintah Siapkan Sumur Bor dan Embung untuk Cegah Karhutla",
            body = "JAKARTA - Pemerintah menyiapkan pembangunan sumur bor, penyediaan embung, penguatan sistem deteksi dini titik panas, dan " +
                "kesiapan masyarakat desa di wilayah rawan karhutla. Menurut laporan akhir Agustus 2026, sekitar 5,4 juta warga di tujuh provinsi " +
                "terdampak langsung asap. Warga yang menemukan titik api dapat melapor ke Posko Karhutla Kementerian Kehutanan di 0813-1003-5000."
        ),
        Post(
            userId = 10, id = 19,
            title = "Free Float Sejumlah Saham di Indeks MSCI Menyusut",
            body = "JAKARTA - Menurut data yang dihimpun Katadata, ada 43 saham Indonesia di indeks MSCI. Free float MEDC turun dari 40,1 persen " +
                "(31 Maret 2026) menjadi 21,89 persen (19 Oktober 2026), sedangkan CPIN turun dari 34,1 persen menjadi 15,41 persen. " +
                "Free float MAPI dan AVIA kini berada di bawah ambang 15 persen yang menjadi rencana batas minimum baru."
        ),
        Post(
            userId = 10, id = 20,
            title = "Kemenkes: Puluhan Juta Orang Sudah Manfaatkan Cek Kesehatan Gratis",
            body = "JAKARTA - Kementerian Kesehatan melaporkan bahwa puluhan juta orang telah memanfaatkan layanan Cek Kesehatan Gratis (CKG) " +
                "per awal Oktober 2026. Program ini mengajak masyarakat memeriksakan kondisi kesehatan lebih dini agar penyakit yang berisiko " +
                "dapat ditangani sebelum parah."
        )
    )
}
