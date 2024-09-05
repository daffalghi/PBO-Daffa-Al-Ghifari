import java.util.Scanner;

public class soal5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan plat nomor untuk 4 mobil, dipisahkan dengan spasi:");
        String input = scanner.nextLine();

        String[] platNomor = input.split(" ");

        if (platNomor.length != 4) {
            System.out.println("Harap masukkan tepat 4 plat nomor, dipisahkan dengan spasi.");
            return;
        }

        String gabunganAngka = platNomor[0] + platNomor[1] + platNomor[2] + platNomor[3];

        try {
            long gabunganAngkaInt = Long.parseLong(gabunganAngka);
            long hasil = gabunganAngkaInt - 999999;

            if (hasil % 5 == 0) {
                System.out.println("Berhenti");
            } else {
                System.out.println("Jalan");
            }
        } catch (NumberFormatException e) {
            System.out.println("Plat nomor yang dimasukkan tidak valid.");
        }

        scanner.close();
    }
}
