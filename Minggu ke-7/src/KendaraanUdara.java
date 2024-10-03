public abstract class KendaraanUdara extends KendaraanUmum implements KemampuanKendaraan {

    public KendaraanUdara(int kapasitas) {
        super(kapasitas);
    }

    @Override
    public void bergerak() {
        System.out.println("Kendaraan beroperasi di udara");
    }
}
