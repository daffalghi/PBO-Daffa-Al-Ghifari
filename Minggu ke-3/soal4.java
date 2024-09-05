import java.util.Scanner;

public class soal4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Jumlah barang yang terjual: ");
        int banyakBarang = in.nextInt();
        int hargaBarang = 50000;
        int gajiPokok = 500000;
        double gaji;

        if (banyakBarang >= 80) {
            gaji = ((0.35 * (banyakBarang * hargaBarang) + gajiPokok));
        } else if (banyakBarang >= 40) {
            gaji = ((0.25 * (banyakBarang * hargaBarang) + gajiPokok));
        } else if (banyakBarang >= 15) {
            gaji = (gajiPokok + (0.1 * (banyakBarang * hargaBarang)));
        } else if (banyakBarang < 15){
            gaji = (gajiPokok - ((15 - banyakBarang) * 0.15) * (hargaBarang));
        } else {
            gaji = (gajiPokok + (banyakBarang * hargaBarang));
        }
        System.out.println("gaji anda : Rp " + gaji);
    }
}


