/**
 * Menjalankan skenario uji untuk class Member pada sistem Gym FitTrack.
 */
public class TesFitTrack {

    private static final int JUMLAH_MEMBER = 5;

    /**
     * Titik masuk program: menjalankan empat skenario uji berurutan
     * pada satu array Member.
     *
     * @param args argumen command line (tidak dipakai)
     */
    public static void main(String[] args) {
        Member[] daftarMember = new Member[JUMLAH_MEMBER];

        System.out.println("=== Skenario 1: memasukkan 4 data member dengan data valid dan 1 member tanpa paket ===");
        isiMemberValid(daftarMember);

        System.out.println("=== Skenario 2: membuat 1 member dengan data tidak valid ===");
        isiMemberTidakValid(daftarMember);

        System.out.println("=== Skenario 3: memanggil setter dengan nilai tidak valid ===");
        ujiSetterTidakValid(daftarMember[0]);

        System.out.println("=== Skenario 4: mencetak seluruh member ===");
        cetakSemuaMember(daftarMember);
    }

    /**
     * Skenario 1: mengisi array dengan empat member valid. Tiga jenis
     * paket berbeda dipakai, dan satu member dibuat lewat constructor
     * tanpa paket.
     *
     * @param daftarMember array tujuan penyimpanan member
     */
    private static void isiMemberValid(Member[] daftarMember) {
        // Constructor tanpa paket: jenis paket otomatis Basic
        daftarMember[0] = new Member("Budi Utama", "081234569890", "17-09-2026");
        daftarMember[1] = new Member("Putri Wulandari", "082345478901", "18-09-2026", "Premium");
        daftarMember[2] = new Member("Andi Wijaya", "083416789012", "19-09-2026", "VIP");
        daftarMember[3] = new Member("Rizky Pratama", "084512345678", "20-09-2026", "Basic");

        System.out.println("Member valid berhasil dibuat dan disimpan ke array");
    }

    /**
     * Skenario 2: menambahkan satu member yang sengaja melanggar validasi,
     * yaitu nomor telepon tanpa awalan 0 dan jenis paket di luar pilihan.
     * Pesan penolakan muncul, tetapi objek tetap terbentuk dengan nilai awal.
     *
     * @param daftarMember array tujuan penyimpanan member
     */
    private static void isiMemberTidakValid(Member[] daftarMember) {
        daftarMember[4] = new Member("Dewi Lestari", "81234", "21-09-2026", "Gold");
    }

    /**
     * Skenario 3: memanggil setNoTelepon dengan nilai tidak valid pada
     * objek yang sudah jadi, lalu menunjukkan nomor lama tetap bertahan.
     *
     * @param member member yang nomor teleponnya diuji
     */
    private static void ujiSetterTidakValid(Member member) {
        System.out.println("Nomor sebelum diubah: " + member.getNoTelepon());
        member.setNoTelepon("123");
        System.out.println("Nomor setelah dicoba diubah: " + member.getNoTelepon());
    }

    /**
     * Skenario 4: mencetak seluruh member di array dengan perulangan for
     * dan toString().
     *
     * @param daftarMember array member yang akan dicetak
     */
    private static void cetakSemuaMember(Member[] daftarMember) {
        for (int i = 0; i < daftarMember.length; i++) {
            System.out.println((i + 1) + ". " + daftarMember[i].toString());
        }
    }
}