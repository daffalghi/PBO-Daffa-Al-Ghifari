public class KapalFerry extends KendaraanLaut implements KonsumsiBahanBakar {
    public KapalFerry(int kapasitas){
        super(kapasitas);
    }
    @Override
    public void deskripsiKendaraan() {
        System.out.println("Kapal Ferry memiliki kapasitas " + kapasitas + " penumpang");
    }
    @Override
    public String getJenisBahanBakar() {
        return "Marine Fuel Oil";
    }
}
