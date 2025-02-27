public class handphone {
    private String merk;
    private String tipe;
    private String warna;
    private double harga;

    // Constructor
    public handphone() {}

    // Setter methods
    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Getter methods
    public String getMerk() {
        return merk;
    }

    public String getTipe() {
        return tipe;
    }

    public String getWarna() {
        return warna;
    }

    public double getHarga() {
        return harga;
    }

    // Method untuk menghitung harga setelah diskon 10%
    public double HargaDiskon() {
        double diskon = 0.1 * getHarga();
        double total = getHarga() - diskon;
        return total;
    }

    // Method untuk menampilkan keterangan diskon
    public void keterangan() {
        System.out.println("Harga HP sesudah diskon 10% - Rp " + HargaDiskon());
    }
}
