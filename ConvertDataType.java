public class ConvertDataType
{
    static short methodOne(long l)
    {
        int i = (int) l;
        return (short)i;
    }
    public static void main(String[] args)
    {
        double d = 10.25;
        float f = (float) d;
        byte b = (byte) methodOne((long) f);
        System.out.println(b);
    }
}

//1. Jelaskan output nilai dari variabel b
//output nilai dari variabel b adalah 10, kenapa 10? karena fungsi ini akan membulatkan angka ke bawah.

//2. Jelaskan apa yang berubah dari variable d menjadi variable b setelah dilakukan cast ?
//pertama-tama disini kita declare variabel d bertipe double dan diassign dengan 10.25.
//lalu nilai yang disimpan di variabel d akan di assign ke variabel f bertipe float,
//selanjutnya variabel f akan dilakukan proses methodeOne, dimana method one ini menggunakan fungsi short
//short sendiri adalah pembulatan ke bawah, setelah itu hasil akan disimpan dalam variabel b bertipe byte,
//dan akan di print sehingga hasilnya adalah b