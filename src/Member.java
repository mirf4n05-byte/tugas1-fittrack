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

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        if (nama == null || nama.trim().isEmpty()) {
            System.out.println("Nama tidak boleh kosong atau hanya berisi spasi");
            return;
        }
        this.nama = nama;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

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

    public String getTanggalDaftar() {
        return tanggalDaftar;
    }

    public void setTanggalDaftar(String tanggalDaftar) {
        this.tanggalDaftar = tanggalDaftar;
    }

    public String getJenisPaket() {
        return jenisPaket;
    }

    public void setJenisPaket(String jenisPaket) {
        this.jenisPaket = jenisPaket;
    }
}
