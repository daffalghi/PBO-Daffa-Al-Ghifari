import java.util.*;
public class soal1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Kalimat: ");
        String kalimat = scan.nextLine();
        scan.close();

        String[] strings = kalimat.split("[\\s+|\\p{Punct}]");
        System.out.println(strings.length);
        for (String str : strings)
            System.out.println(str);
    }
}