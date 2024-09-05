import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        System.out.println("Masukkan angka");
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String[] parts = input.split(" ");

        int A = Integer.parseInt(parts[0]);
        String operator = parts[1];
        int B = Integer.parseInt(parts[2]);

        int result = 0;

        switch (operator) {
            case "+":
                result = A + B;
                break;
            case "-":
                result = A - B;
                break;
            case "*":
                result = A * B;
                break;
            case "/":
                // Handle division by zero
                if (B != 0) {
                    result = A / B;
                } else {
                    System.out.println("Error: Division by zero");
                    return;
                }
                break;
            case "%":
                if (B != 0) {
                    result = A % B;
                } else {
                    System.out.println("Error: Division by zero");
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operator");
                return;
        }

        System.out.println(result);

        sc.close();
    }
}
