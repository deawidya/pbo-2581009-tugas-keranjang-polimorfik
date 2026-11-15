import java.util.Locale;

public abstract class Buku {
    // Atribut dibuat private
    private String judul;
    private String penulis;
    private int harga;

    // Constructor
    public Buku(String judul, String penulis, int harga) {
        this.judul = judul;
        this.penulis = penulis;
        this.harga = harga;
    }

    // Getter
    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getHarga() {
        return harga;
    }

    // Abstract method
    public abstract int hargaAkhir();

    public abstract String keterangan();

    // Method konkret untuk menampilkan informasi buku
    public void tampilkanInfo() {
        System.out.println(judul + " (" + penulis + ")");
        System.out.println("  Harga       : " + formatRupiah(harga));
        System.out.println("  Keterangan  : " + keterangan());
        System.out.println("  Harga akhir : " + formatRupiah(hargaAkhir()));
    }

    // Method untuk format rupiah
    protected static String formatRupiah(int angka) {
        return "Rp" + String.format(Locale.US, "%,d", angka)
                .replace(',', '.');
    }
}
