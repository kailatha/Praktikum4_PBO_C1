import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


class DosenTetap extends Dosen {
    private String NIDN;
    private static final int BUP = 65;

    public DosenTetap(String NIP, String NIDN, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String fakultas) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, fakultas);
        this.NIDN = NIDN;
    }    
    
    public String getNIDN() {
        return NIDN;
    }
    
    public LocalDate hitungBUP() {
        return getTanggalLahir().plusYears(BUP).plusMonths(1);
    }
    
    public double hitungTunjangan() {
        return 0.02 * hitungMasaKerja() * getGajiPokok();
    }
    
    @Override
    public String getJabatan(){
        return "Dosen Tetap";
    }
    
    @Override
    public void printInfo() {
        System.out.println("NIP          : " + getNIP());
        System.out.println("NIDN         : " + getNIDN());
        System.out.println("Nama         : " + getNama());
        System.out.println("Tanggal Lahir: " + getTanggalLahir().format(DateTimeFormatter.ofPattern("d MMMM yyyy")));
        System.out.println("TMT          : " + getTMT());
        System.out.println("Jabatan      : " + getJabatan());
        System.out.println("Fakultas     : " + getFakultas());
        System.out.println("Masa Kerja   : " + hitungMasaKerja() + " tahun");
        System.out.println("BUP          : " + hitungBUP());
        System.out.println("Gaji Pokok   : Rp " + getGajiPokok());
        System.out.println("Tunjangan    : Rp " + hitungTunjangan());
    }
}