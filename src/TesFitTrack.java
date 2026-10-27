/**
 * Menjalankan skenario uji untuk class Member pada sistem Gym FitTrack.
 */
public class TesFitTrack {

    /**
     * Titik masuk program: membuat tiga member, menyimpannya dalam
     * array, lalu mencetak semuanya.
     *
     * @param args argumen command line (tidak dipakai)
     */
    public static void main(String[] args) {
        Member[] daftarMember = new Member[4];

        // Constructor tanpa paket: jenis paket otomatis Basic
        daftarMember[0] = new Member("Budi Utama", "081234569890", "17-09-2026");
        daftarMember[1] = new Member("Putri Wulandari", "082345478901", "18-09-2026", "Premium");
        daftarMember[2] = new Member("Andi Wijaya", "083416789012", "19-09-2026", "VIP");
        // Data tidak valid: nomor tanpa awalan 0 dan paket di luar pilihan
        daftarMember[3] = new Member("Dewi Lestari", "81234", "20-09-2026", "Gold");

        System.out.println("Nomor sebelum diubah: " + daftarMember[0].getNoTelepon());
        daftarMember[0].setNoTelepon("123");
        System.out.println("Nomor setelah dicoba diubah: " + daftarMember[0].getNoTelepon());

        for (int i = 0; i < daftarMember.length; i++) {
            System.out.println((i + 1) + ". " + daftarMember[i].toString());
        }
    }
}