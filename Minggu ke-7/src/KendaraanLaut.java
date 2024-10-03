public abstract class KendaraanLaut extends KendaraanUmum implements KemampuanKendaraan {

    public KendaraanLaut(int kapasitas) {
        super(kapasitas);
    }

    @Override
    public void bergerak() {
        System.out.println("Kendaraan beroperasi di laut");
    }
}
