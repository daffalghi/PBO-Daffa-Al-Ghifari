public class Bus extends KendaraanDarat implements KonsumsiBahanBakar {

    public Bus(int kapasitas) {
        super(kapasitas);
    }

    @Override
    public void deskripsiKendaraan() {
        System.out.println("Ini adalah bus dengan kapasitas " + kapasitas + " penumpang.");
    }

    @Override
    public String getJenisBahanBakar() {
        return "Solar";
    }
}
