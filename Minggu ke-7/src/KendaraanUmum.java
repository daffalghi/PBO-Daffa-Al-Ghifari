public abstract class KendaraanUmum {
    protected int kapasitas;

    public KendaraanUmum(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public abstract void deskripsiKendaraan();
}
