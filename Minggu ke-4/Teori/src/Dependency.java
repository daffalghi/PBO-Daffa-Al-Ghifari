class Buku {
    private String judul;

    public Buku(String judul) {
        this.judul = judul;
    }

    public String getJudul() {
        return judul;
    }
}

class Pustakawan {
    // Dependency: Pustakawan bergantung pada Buku untuk meminjam buku
    public void pinjamBuku(Buku buku) {
        System.out.println("Buku berjudul '" + buku.getJudul() + "' telah dipinjam.");
    }
}

public class Dependency {
    public static void main(String[] args) {
        Buku buku = new Buku("Pengantar Pemrograman Java");
        Pustakawan pustakawan = new Pustakawan();
        pustakawan.pinjamBuku(buku); // Pustakawan bergantung pada Buku untuk meminjam
    }
}
