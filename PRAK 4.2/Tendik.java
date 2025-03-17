import java.time.LocalDate;

class Tendik extends Pegawai {
    private String bidangTugas;
    private static final int BUP = 55;

    public Tendik(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String bidangTugas) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.bidangTugas = bidangTugas;
    }

    public LocalDate hitungBUP() {
        return getTanggalLahir().plusYears(BUP).plusMonths(1);
    }

    public double hitungTunjangan() {
        return 0.01 * hitungMasaKerja() * getGajiPokok();
    }

    public String getBidangTugas() {
        return bidangTugas;
    }

    public String getJabatan() {
        return "Tendik";
    }

    @Override
    public void printInfo() {
        System.out.println("NIP          : " + getNIP());
        System.out.println("Nama         : " + getNama());
        System.out.println("Jabatan      : " + getJabatan());
        System.out.println("Bidang       : " + getBidangTugas());
        System.out.println("BUP          : " + hitungBUP());
        System.out.println("Gaji Pokok   : Rp " + getGajiPokok());
        System.out.println("Tunjangan    : Rp " + hitungTunjangan());
    }
}
