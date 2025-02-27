import java.io.BufferedReader;
import java.io.InputStreamReader;

public class utama {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        handphone hp = new handphone();

        System.out.print("Masukkan merk handphone: ");
        String merk_hp = reader.readLine();

        System.out.print("Masukkan tipe handphone: ");
        String tipe_hp = reader.readLine();

        System.out.print("Masukkan warna handphone: ");
        String warna_hp = reader.readLine();

        System.out.print("Masukkan harga handphone: ");
        double harga_hp = Double.parseDouble(reader.readLine());

        hp.setMerk(merk_hp);
        hp.setTipe(tipe_hp);
        hp.setWarna(warna_hp);
        hp.setHarga(harga_hp);

        // Menampilkan informasi handphone
        System.out.println("\nSpesifikasi Handphone:");
        System.out.println("Merk: " + hp.getMerk());
        System.out.println("Tipe: " + hp.getTipe());
        System.out.println("Warna: " + hp.getWarna());
        System.out.println("Harga sebelum diskon: Rp " + hp.getHarga());

        // Menampilkan harga setelah diskon 10%
        hp.keterangan();
    }
}
