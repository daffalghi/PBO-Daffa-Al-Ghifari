// Superclass (Kelas induk)
class Orang {
    protected String nama;

    public Orang(String nama) {
        this.nama = nama;
    }

    public void tampilkanDetail() {
        System.out.println("Nama: " + nama);
    }
}

// Subclass (Kelas turunan)
class Anggota extends Orang {
    private int idAnggota;

    public Anggota(String nama, int idAnggota) {
        super(nama); // Memanggil konstruktor kelas Orang
        this.idAnggota = idAnggota;
    }

    public void tampilkanDetail() {
        super.tampilkanDetail();
        System.out.println("ID Anggota: " + idAnggota);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Anggota anggota = new Anggota("Budi", 12345);
        anggota.tampilkanDetail(); // Menggunakan properti yang diwarisi dari kelas Orang
    }
}
