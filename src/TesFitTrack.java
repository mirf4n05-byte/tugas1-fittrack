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
        Member[] daftarMember = new Member[3];

        // Constructor tanpa paket: jenis paket otomatis Basic
        daftarMember[0] = new Member("Budi Utama", "081234569890", "17-09-2026");
        daftarMember[1] = new Member("Putri Wulandari", "082345478901", "18-09-2026", "Premium");
        daftarMember[2] = new Member("Andi Wijaya", "083416789012", "19-09-2026", "VIP");

        for (int i = 0; i < daftarMember.length; i++) {
            System.out.println((i + 1) + ". " + daftarMember[i].toString());
        }
    }
}