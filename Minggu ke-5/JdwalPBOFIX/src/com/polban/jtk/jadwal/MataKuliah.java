package com.polban.jtk.jadwal;

public class MataKuliah extends JadwalPerkuliahan {
    String namaMatkul;

    MataKuliah(String namaMatkul) {
        super("", "", "", null, null, null);
        this.namaMatkul = namaMatkul;
    }
}

