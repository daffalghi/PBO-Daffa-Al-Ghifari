import java.util.ArrayList;
import java.util.List;

public class Pesanan {
    private List<Makanan> daftarMakanan;

    public Pesanan() {
        this.daftarMakanan = new ArrayList<>();
    }

    public void tambahMakanan(Makanan makanan) {
        daftarMakanan.add(makanan);
    }

    public double hitungTotalHarga() {
        double total = 0;
        for (Makanan makanan : daftarMakanan) {
            total += makanan.getHarga();
        }
        return total;
    }

    public void tampilkanStruk() {
        System.out.println("Struk Pembelian");
        for (Makanan makanan : daftarMakanan) {
            System.out.println(makanan.getNama() + " - Rp" + makanan.getHarga());
        }
        System.out.println("Total: Rp" + hitungTotalHarga());
    }
}
