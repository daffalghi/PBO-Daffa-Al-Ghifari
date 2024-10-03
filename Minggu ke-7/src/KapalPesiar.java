public class KapalPesiar extends KendaraanLaut implements KonsumsiBahanBakar {
    public KapalPesiar(int kapasitas){
        super(kapasitas);
    }
    @Override
    public void deskripsiKendaraan() {
        System.out.println("Kapal Pesiar memiliki kapasitas " + kapasitas + " penumpang.");
    }
    @Override
    public String getJenisBahanBakar() {
        return "Marine Fuel Oil";
    }
}
