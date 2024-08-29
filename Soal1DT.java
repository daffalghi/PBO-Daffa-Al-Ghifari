import java.math.BigInteger;
import java.util.Scanner;

public class Soal1DT {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jumlah nilai: ");
        int quantity = in.nextInt();
        BigInteger[] arr = new BigInteger[quantity];

        for (int i = 0; i < quantity; i++) {
            System.out.print("Masukkan Angka ke-" + (i + 1) + ": ");
            String input = in.next();
            try {
                arr[i] = new BigInteger(input);
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid. Harap masukkan angka yang valid.");
                i--;
            }
        }

        for (int i = 0; i < quantity; i++) {
            System.out.println("Nilai ke-" + (i + 1) + ": " + arr[i]);
            checkValueRange(arr[i]);
        }

        in.close();
    }

    private static void checkValueRange(BigInteger value) {
        System.out.println("Bisa masuk ke dalam:");

        try {
            value.byteValueExact();
            System.out.println("- byte");
        } catch (ArithmeticException e) {

        }

        try {
            value.shortValueExact();
            System.out.println("- short");
        } catch (ArithmeticException e) {

        }
        try {
            value.intValueExact();
            System.out.println("- int");
        } catch (ArithmeticException e) {

        }

        try {
            value.longValueExact();
            System.out.println("- long");
        } catch (ArithmeticException e) {
            System.out.println("- can't be fitted anywhere. ");
        }
    }
}
