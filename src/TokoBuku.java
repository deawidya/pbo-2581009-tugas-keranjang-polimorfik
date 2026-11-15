public class TokoBuku {
    // Method untuk menghitung total harga keranjang
    public static int hitungTotal(Buku[] keranjang) {
        int total = 0;

        for (Buku buku : keranjang) {
            total += buku.hargaAkhir();
        }

        return total;
    }

    public static void main(String[] args) {

        // Membuat object buku cetak
        BukuCetak cetak1 = new BukuCetak(
                "Pemrograman Java", "John Doe", 120000, 750
        );

        BukuCetak cetak2 = new BukuCetak(
                "Algoritma Dasar", "Jane Smith", 95000, 400
        );

        // Membuat object buku digital
        BukuDigital digital = new BukuDigital(
                "Belajar OOP", "Ani Wijaya", 80000, 12.5
        );

        // Membuat object buku audio
        BukuAudio audio = new BukuAudio(
                "Kisah Programmer", "Budi Santoso", 60000, 240
        );

        /*
         * Percobaan membuat object dari abstract class:
         * Buku b = new Buku("X", "Y", 1);
         *
         * Error:
         * Buku is abstract; cannot be instantiated
         */

        // Memasukkan semua buku ke dalam array
        Buku[] keranjang = {
                cetak1, cetak2, digital, audio
        };

        // Menampilkan isi keranjang
        System.out.println("=============== KERANJANG ===============");

        for (Buku buku : keranjang) {
            buku.tampilkanInfo();
        }

        // Menghitung total pembayaran
        System.out.println("-----------------------------------------");
        System.out.println("Total bayar   : " +
                Buku.formatRupiah(hitungTotal(keranjang)));

        // Array khusus buku yang bisa diunduh
        BisaDiunduh[] unduhan = {
                digital, audio
        };

        // Menampilkan link unduhan
        System.out.println();
        System.out.println("============== LINK UNDUH ===============");

        for (BisaDiunduh buku : unduhan) {
            System.out.println(buku.linkUnduh());
        }
    }
}