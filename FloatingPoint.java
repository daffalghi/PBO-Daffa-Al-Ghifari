public class FloatingPoint{
public static void main(String[] args) {
    double x = 92.49;
    int nx = (int) Math.round(x);
    System.out.println(nx);
} 
}
//Pada kasus berikut jelaskan nilai nx setelah digunakan Math.round(x);
//jadi nilai nx ini akan merubah nilai x, yang tadinya 92.98 menjadi 93
//ini dikarenakan nilai x yang kita punya akan dilakukan proses pembulatan (round) ke angka asli terdekat,
// jika nilai dibelakang koma adalah >= 0,5 maka akan dibulatkan keatas
// jika nilai dibelakang koma adalah <= 4,9 maka akan dibulatkan kebawah
//kenapa kita menggunakan cast(int) ini karena kita mau membulatkannya ke angka bertipe integer,
//dimana nantinya akan menghasilkan bilangan asli