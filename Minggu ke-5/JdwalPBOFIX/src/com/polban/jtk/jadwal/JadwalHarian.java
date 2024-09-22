package com.polban.jtk.jadwal;

public class JadwalHarian extends JadwalPerkuliahan {
    Mahasiswa[] mahasiswa;

    JadwalHarian(String hari, String waktuMulai, String waktuSelesai, Ruangan ruangan, MataKuliah mataKuliah, Dosen dosen, Mahasiswa[] mahasiswa) {
        super(hari, waktuMulai, waktuSelesai, ruangan, mataKuliah, dosen);
        this.mahasiswa = mahasiswa;
    }
}



