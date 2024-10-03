public class KeretaApi extends KendaraanDarat implements KonsumsiBahanBakar {
    public KeretaApi(int kapasitas){
        super(kapasitas);
    }
    @Override
    public void deskripsiKendaraan() {
        System.out.println("Kereta Api memiliki kapasitasi " + kapasitas + " penumpang.");
    }
    @Override
    public String getJenisBahanBakar() {
        return "Solar";
    }
}
