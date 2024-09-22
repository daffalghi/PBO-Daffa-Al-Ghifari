package com.polban.jtk.jadwal;

public class Ruangan extends JadwalPerkuliahan {
    String kodeRuangan;

    Ruangan(String kodeRuangan) {
        super("", "", "", null, null, null);
        this.kodeRuangan = kodeRuangan;
    }
}


