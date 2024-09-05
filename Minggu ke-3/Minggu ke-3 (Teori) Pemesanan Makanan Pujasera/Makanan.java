public class Makanan {
    private String namaMakanan;
    private double hargaMakanan;

    // Constructor
    public Makanan(String nama, double harga) {
        this.namaMakanan = nama;
        this.hargaMakanan = harga;
    }

    // Getter untuk nama
    public String getNama() {
        return namaMakanan;
    }

    // Setter untuk nama
    public void setNama(String nama) {
        this.namaMakanan = nama;
    }

    // Getter untuk harga
    public double getHarga() {
        return hargaMakanan;
    }

    // Setter untuk harga
    public void setHarga(double harga) {
        this.hargaMakanan = harga;
    }
}
