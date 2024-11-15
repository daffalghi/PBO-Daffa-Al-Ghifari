import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AplikasiPemesananMakanan {

    private JPanel panel1;
    private JCheckBox steakCheckBox;
    private JCheckBox sphagetiCheckBox;
    private JTextField namaTextField;
    private JTextField alamatTextField;
    private JTextField teleponTextField;
    private JCheckBox pizzaCheckBox;
    private JButton tambahButton;
    private JTextArea dataPenjualan;
    private JLabel totalBayar;
    private JTextField displayHarga;

    // Harga makanan
    private static final int harga_steak = 50000;
    private static final int harga_sphageti = 30000;
    private static final int harga_pizza = 45000;

    // Variabel untuk menyimpan total harga dan pesanan
    private int totalHarga = 0;
    private StringBuilder pesanan = new StringBuilder();

    public AplikasiPemesananMakanan() {
        // Listener untuk tombol tambah
        tambahButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prosesPemesanan();
            }
        });
    }

    private void prosesPemesanan() {
        // Ambil input dari JTextField
        String nama = namaTextField.getText();
        String alamat = alamatTextField.getText();
        String telepon = teleponTextField.getText();

        // Validasi data pelanggan
        if (nama.isEmpty() || alamat.isEmpty() || telepon.isEmpty()) {
            JOptionPane.showMessageDialog(panel1, "Mohon lengkapi data pelanggan.");
            return;
        }

        // Cek makanan yang dipilih dan tambahkan ke pesanan hanya jika belum ada dalam pesanan
        if (steakCheckBox.isSelected()) {
            pesanan.append("Steak: Rp ").append(harga_steak).append("\n");
            totalHarga += harga_steak;
        }
        if (sphagetiCheckBox.isSelected()) {
            pesanan.append("Sphageti: Rp ").append(harga_sphageti).append("\n");
            totalHarga += harga_sphageti;
        }
        if (pizzaCheckBox.isSelected()) {
            pesanan.append("Pizza: Rp ").append(harga_pizza).append("\n");
            totalHarga += harga_pizza;
        }

        // Cek apakah ada makanan yang dipilih
        if (totalHarga == 0) {
            JOptionPane.showMessageDialog(panel1, "Mohon pilih minimal satu makanan.");
            return;
        }

        // Menampilkan pesanan dan total bayar
        String hasilPesanan = String.format("Nama: %s\nAlamat: %s\nTelepon: %s\n\n%-15s %s\n%s\n\nTotal Bayar: Rp %d",
                nama, alamat, telepon, "Pesanan", "Harga", pesanan, totalHarga);
        dataPenjualan.setText(hasilPesanan);

        // Menampilkan total bayar di label dan di displayHarga
        displayHarga.setText(String.valueOf(totalHarga));
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Aplikasi Pemesanan Makanan");
        frame.setContentPane(new AplikasiPemesananMakanan().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
