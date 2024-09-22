package com.polban.jtk.jadwal;

public class JadwalPerkuliahan extends AkademikPOLBAN {
    String hari;
    String waktuMulai;
    String waktuSelesai;
    Ruangan ruangan;
    MataKuliah mataKuliah;
    Dosen dosen;

    JadwalPerkuliahan(String hari, String waktuMulai, String waktuSelesai, Ruangan ruangan, MataKuliah mataKuliah, Dosen dosen) {
        this.hari = hari;
        this.waktuMulai = waktuMulai;
        this.waktuSelesai = waktuSelesai;
        this.ruangan = ruangan;
        this.mataKuliah = mataKuliah;
        this.dosen = dosen;
    }
}
