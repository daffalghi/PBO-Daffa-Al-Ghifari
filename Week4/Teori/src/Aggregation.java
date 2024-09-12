class Penulis {
    private String nama;

    public Penulis(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}

class Perpustakaan {
    // Aggregation: Perpustakaan memiliki Penulis, tetapi Penulis bisa ada sendiri
    private Penulis[] penulis;

    public Perpustakaan(Penulis[] penulis) {
        this.penulis = penulis;
    }

    public void tampilkanPenulis() {
        System.out.println("Penulis di perpustakaan:");
        for (Penulis p : penulis) {
            System.out.println("- " + p.getNama());
        }
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Penulis penulis1 = new Penulis("Tere Liye");
        Penulis penulis2 = new Penulis("Andrea Hirata");
        Perpustakaan perpustakaan = new Perpustakaan(new Penulis[]{penulis1, penulis2});

        perpustakaan.tampilkanPenulis(); // Perpustakaan memiliki beberapa penulis
    }
}
