public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus(50);
        KeretaApi keretaApi = new KeretaApi(200);
        KapalPesiar kapalPesiar = new KapalPesiar(300);
        KapalFerry kapalFerry = new KapalFerry(100);
        Pesawat pesawat = new Pesawat(150);

        // Bus
        bus.deskripsiKendaraan();
        bus.bergerak();
        System.out.println("Jenis bahan bakar: " + bus.getJenisBahanBakar());

        // Kereta Api
        keretaApi.deskripsiKendaraan();
        keretaApi.bergerak();
        System.out.println("Jenis bahan bakar: " + keretaApi.getJenisBahanBakar());

        // Kapal Pesiar
        kapalPesiar.deskripsiKendaraan();
        kapalPesiar.bergerak();
        System.out.println("Jenis bahan bakar: " + kapalPesiar.getJenisBahanBakar());

        // Kapal Ferry
        kapalFerry.deskripsiKendaraan();
        kapalFerry.bergerak();
        System.out.println("Jenis bahan bakar: " + kapalFerry.getJenisBahanBakar());

        // Pesawat
        pesawat.deskripsiKendaraan();
        pesawat.bergerak();
        System.out.println("Jenis bahan bakar: " + pesawat.getJenisBahanBakar());
    }
}
