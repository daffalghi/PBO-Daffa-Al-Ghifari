package com.polban.jtk.inventory;

public class Barang {
    String kode_barang;
    String nama_barang;
    private int stok;
    public Barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;

    }
    public void setStok(int jumlah) {
        if (jumlah > 0) {
            this.stok += jumlah;
        } else {
            System.out.println("hanya bisa nambah");
        }
    }

    public int getStok() {
        return stok;
    }
}
