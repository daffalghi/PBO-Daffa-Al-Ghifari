public class Soal1 {
    public static void main(String[] args) {
        byte angka1 = 125;
        byte angka2 = 6;
        byte hasil = (byte) (angka1+angka2);

        System.out.println("Hasil 1 "+hasil);
    }
}

    //hasil print adalah "Hasil 1 -125".
    //ini dikarenakan type data byte merupakan tipe data primitf,
    //dan memiliki sifat kalkulasi yang khusus,
    //range dari byte sendiri adalah -128 hingga 127,
    //karena 125 + 6 = 131, dan ini tentu melebihi maksimal dari byte yaitu 127,
    //maka akan kembali ke angka awal karena tipe dari data byte ini perhitungan nya adalah circular bukan perhitungan linear
    //yang berarti kelebihan 4 angka. maka akan kembali ke nilai awal dari 127, maka lanjut 4 angka (-128,-127,-126,-125)
    //referensi: https://medium.com/@malindurnawarathne/what-happen-if-you-exceed-the-byte-range-in-java-128-to-127-561c5838356b

