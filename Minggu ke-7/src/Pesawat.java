public class Pesawat extends KendaraanUdara implements KonsumsiBahanBakar {

    public Pesawat(int kapasitas) {
        super(kapasitas);
    }

    @Override
    public void deskripsiKendaraan() {
        System.out.println("Ini adalah pesawat komersil dengan kapasitas " + kapasitas + " penumpang.");
    }

    @Override
    public String getJenisBahanBakar() {
        return "Avtur";
    }
}
