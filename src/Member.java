/**
 * Kelas ini merepresentasikan data member dalam sistem GymFittrack dan
 * memeriksa perubahan data sebelum menyimpan
 * 
 * @author Muhammad Irfan
 * @version 1.0
 * @since 2026
 */

public class Member {

    private static final int PANJANG_MINIMAL_TELEPON = 10;
    private static final String AWALAN_TELEPON = "0";
    private static final String PAKET_BASIC = "Basic";
    private static final String PAKET_PREMIUM = "Premium";
    private static final String PAKET_VIP = "VIP";
    private static final String NILAI_KOSONG = "Belum diisi";

    private String nama = NILAI_KOSONG;
    private String noTelepon = NILAI_KOSONG;
    private String tanggalDaftar = NILAI_KOSONG;
    private String jenisPaket = PAKET_BASIC;

    /**
     * Membuat member baru dengan keempat data lengkap. Data yang tidak
     * valid ditolak oleh setter, dan atribut tetap berisi nilai awalnya.
     *
     * @param nama          nama lengkap member
     * @param noTelepon     nomor telepon, diawali 0 dan minimal 10 digit
     * @param tanggalDaftar tanggal member pertama kali mendaftar
     * @param jenisPaket    paket keanggotaan: Basic, Premium, atau VIP
     */

    public Member(String nama, String noTelepon, String tanggalDaftar, String jenisPaket) {
        setNama(nama);
        setNoTelepon(noTelepon);
        setTanggalDaftar(tanggalDaftar);
        setJenisPaket(jenisPaket);
    }

    /**
     * Membuat member baru dengan tiga data lengkap. Jenis paket secara default
     * diatur ke Basic.
     *
     * @param nama          nama lengkap member
     * @param noTelepon     nomor telepon, diawali 0 dan minimal 10 digit
     * @param tanggalDaftar tanggal member pertama kali mendaftar
     */

    public Member(String nama, String noTelepon, String tanggalDaftar) {
        this(nama, noTelepon, tanggalDaftar, PAKET_BASIC);
    }

    /**
     * Mengambil nama member.
     *
     * @return nama lengkap member
     */

    public String getNama() {
        return nama;
    }

    /**
     * Mengubah nama member. Nama yang null, kosong, atau hanya berisi
     * spasi ditolak: pesan dicetak dan nama lama dipertahankan.
     *
     * @param nama nama lengkap baru
     */

    public void setNama(String nama) {
        if (nama == null || nama.trim().isEmpty()) {
            System.out.println("Nama tidak boleh kosong atau hanya berisi spasi");
            return;
        }
        this.nama = nama;
    }

    /**
     * Mengambil nomor telepon member.
     *
     * @return nomor telepon member
     */

    public String getNoTelepon() {
        return noTelepon;
    }

    /**
     * Mengubah nomor telepon member. Nomor yang kosong, tidak diawali
     * angka 0, atau kurang dari 10 digit ditolak: pesan dicetak dan
     * nomor lama dipertahankan.
     *
     * @param noTelepon nomor telepon baru
     */

    public void setNoTelepon(String noTelepon) {
        if (noTelepon == null || noTelepon.trim().isEmpty()) {
            System.out.println("Nomor telepon tidak boleh kosong atau hanya berisi spasi");
            return;
        }
        if (!noTelepon.startsWith(AWALAN_TELEPON)) {
            System.out.println("Nomor telepon harus diawali angka " + AWALAN_TELEPON);
            return;
        }
        if (noTelepon.length() < PANJANG_MINIMAL_TELEPON) {
            System.out.println("Nomor telepon minimal " + PANJANG_MINIMAL_TELEPON + " digit");
            return;
        }
        this.noTelepon = noTelepon;
    }

    /**
     * Mengambil tanggal pendaftaran member.
     *
     * @return tanggal pendaftaran member
     */
    public String getTanggalDaftar() {
        return tanggalDaftar;
    }

    /**
     * Mengubah tanggal pendaftaran member. Tanggal yang null, kosong,
     * atau hanya berisi spasi ditolak: pesan dicetak dan tanggal lama
     * dipertahankan.
     *
     * @param tanggalDaftar tanggal pendaftaran baru
     */

    public void setTanggalDaftar(String tanggalDaftar) {
        if (tanggalDaftar == null || tanggalDaftar.trim().isEmpty()) {
            System.out.println("Tanggal pendaftaran tidak boleh kosong atau hanya berisi spasi");
            return;
        }
        this.tanggalDaftar = tanggalDaftar;
    }

    /**
     * Mengambil jenis paket keanggotaan member.
     *
     * @return jenis paket member: Basic, Premium, atau VIP
     */
    public String getJenisPaket() {
        return jenisPaket;
    }

    /**
     * Mengubah jenis paket member. Nilai selain Basic, Premium, atau VIP
     * ditolak: pesan dicetak dan paket lama dipertahankan.
     *
     * @param jenisPaket jenis paket baru
     */

    public void setJenisPaket(String jenisPaket) {
        if (!PAKET_BASIC.equals(jenisPaket)
                && !PAKET_PREMIUM.equals(jenisPaket)
                && !PAKET_VIP.equals(jenisPaket)) {
            System.out.println("Jenis paket harus " + PAKET_BASIC + ", "
                    + PAKET_PREMIUM + ", atau " + PAKET_VIP);
            return;
        }
        this.jenisPaket = jenisPaket;
    }

    /**
     * Mengubah objek menjadi teks berlabel yang berisi seluruh data member.
     *
     * @return representasi teks data member
     */

    @Override
    public String toString() {
        return "Member{" + "nama='" + nama + '\'' + ", noTelepon='" + noTelepon + '\'' + ", tanggalDaftar='"
                + tanggalDaftar + '\'' + ", jenisPaket='" + jenisPaket + '\'' + '}';
    }
}
