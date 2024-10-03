public abstract class KendaraanDarat extends KendaraanUmum implements KemampuanKendaraan {

    public KendaraanDarat(int kapasitas) {
        super(kapasitas);
    }

    @Override
    public void bergerak() {
        System.out.println("Kendaraan beroperasi di darat");
    }
}
