import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Makanan ayamCrispy = new Makanan("Ayam Crispy", 15000);
        Makanan mieGoreng = new Makanan("Mie Goreng", 12000);
        Makanan buburAyam = new Makanan("Bubur Ayam", 13000);

        System.out.println("Menu Kantin Pujasera:");
        System.out.println("1. Ayam Crispy - Rp15000");
        System.out.println("2. Mie Goreng - Rp12000");
        System.out.println("3. Bubur Ayam - Rp13000");

        Scanner scanner = new Scanner(System.in);
        Pesanan pesanan = new Pesanan();

        System.out.println("Masukkan nomor pilihan makanan (1-3). Ketik 0 untuk selesai:");

            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    pesanan.tambahMakanan(ayamCrispy);
                    break;
                case 2:
                    pesanan.tambahMakanan(mieGoreng);
                    break;
                case 3:
                    pesanan.tambahMakanan(buburAyam);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

        pesanan.tampilkanStruk();

        scanner.close();
    }
}
