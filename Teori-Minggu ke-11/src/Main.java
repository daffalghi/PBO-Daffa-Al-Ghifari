public class Main {
    public static void main(String[] args) {
        // Membuat instance Family
        Family family = new Family();

        // Menambahkan paman
        family.addUncle("Uncle Ahmad");
        family.addUncle("Uncle Bandy");
        family.addUncle("Uncle Cakimin");

        // Tambahkan keponakan beserta ulang tahunnya
        family.addNiece("Anisa", 12, 5); // Birthday: 12/5
        family.addNiece("Bunga", 25, 3); // Birthday: 25/3
        family.addNiece("Caris", 8, 9); // Birthday: 8/9

        // Tampilkan daftar paman (diurutkan menurut abjad)
        System.out.println("List of Uncles:");
        family.listUncles();
        System.out.println();

        // Menampilkan daftar keponakan (diurutkan berdasarkan ulang tahun)
        System.out.println("List of Nieces:");
        family.listNieces();
        System.out.println();

        // Temukan paman dan keponakan tertentu
        Uncle uncleAhmad = family.findUncle("Uncle Ahmad");
        Niece anisa = family.findNiece("Anisa");
        Niece bunga = family.findNiece("Bunga");
        Niece caris = family.findNiece("Caris");

        // Paman Ahmad memberikan hadiah kepada Anisa dan Bunga
        System.out.println("Uncle Ahmad giving presents:");
        uncleAhmad.addPresent(anisa, "The Wonder of Computers");
        uncleAhmad.addPresent(bunga, "A Lovely Doll");

        // Paman Bandy memberikan hadiah kepada Anisa
        Uncle uncleBandy = family.findUncle("Uncle Bandy");
        uncleBandy.addPresent(anisa, "A Science Kit");
        uncleBandy.addPresent(caris, "Makeup Set");

        // Tampilkan hadiah yang diberikan oleh Paman Ahmad
        System.out.println("\nUncle Ahmad's Presents:");
        uncleAhmad.listPresents();
        System.out.println();

        // Tampilkan hadiah yang diterima oleh Anisa
        System.out.println("Anisa's Presents:");
        anisa.listPresents();
        System.out.println();

        // Tampilkan hadiah yang diterima oleh Bunga
        System.out.println("Bunga's Presents:");
        bunga.listPresents();
        System.out.println();

        // Tampilkan hadiah yang diterima oleh Caris

        System.out.println("Caris's Presents:");
        caris.listPresents();
        System.out.println();

        // Hapus hadiah setelah ulang tahun Anisa berlalu
        anisa.clearPresents();
        System.out.println("Anisa's presents cleared after birthday:");
        anisa.listPresents();
        System.out.println();

        // Tampilkan hadiah lagi untuk semua Paman
        System.out.println("Final list of presents given by uncles:");
        uncleAhmad.listPresents();
        uncleBandy.listPresents();
        System.out.println();

        // Tampilkan daftar keponakan lagi untuk memeriksa tidak ada hadiah untuk Anisa setelah ulang tahunnya
        System.out.println("Final list of presents received by Anisa:");
        anisa.listPresents();
    }
}