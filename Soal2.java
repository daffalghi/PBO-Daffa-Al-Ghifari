public class Soal2 {
    public static void main(String[] args) {
        int i = 42;
        String s = (i<40)?"life":(i>50)?"universe":"everything";
        System.out.println(s);
    }
}
//soal ini menggunakan metode yang mirip dengan if-else. yaitu ternary operator.
//Operator ternary adalah operator kondisional yang mengambil tiga operan:
//yaitu suatu kondisi, nilai yang dikembalikan jika kondisinya benar , dan nilai yang dikembalikan jika kondisinya salah .
//Ini mengevaluasi kondisi dan mengembalikan salah satu dari dua nilai yang ditentukan berdasarkan apakah kondisi tersebut benar atau salah.
//jadi jika nilai i < 40 (true) maka akan diprint "life", jika bukan maka akan ke kondisi else (i>50)
//jika nilai i > 50 (true) maka akan diprint "universe", jika bukan maka akan ke kondisi else
//karena nilai i adalah 42, dimana itu tidak kurang dari 40 dan tidak lebih dari 50 maka yang diprint adalah "everything"
//referensi: https://www.geeksforgeeks.org/ternary-operator-in-programming/