import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class DosenTamu extends Dosen {
    private String NIDK;
    private LocalDate kontrakHabis;

    public DosenTamu(String NIP, String NIDK, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String fakultas, LocalDate kontrakHabis) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, fakultas);
        this.NIDK = NIDK;
        this.kontrakHabis = kontrakHabis;
    }

    public String getNIDK() {
        return NIDK;
    }

    public LocalDate getKontrakHabis() {
        return kontrakHabis;
    }

    @Override
    public String getJabatan() {
        return "Dosen Tamu";
    }

    @Override
    public void printInfo() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");
        
        System.out.println("NIP          : " + getNIP());
        System.out.println("NIDK         : " + getNIDK());
        System.out.println("Nama         : " + getNama());
        System.out.println("Tanggal Lahir: " + getTanggalLahir().format(formatter));
        System.out.println("TMT          : " + getTMT().format(formatter));
        System.out.println("Jabatan      : " + getJabatan());
        System.out.println("Fakultas     : " + getFakultas());
        System.out.println("Masa Kerja   : " + hitungMasaKerja() + " tahun " + hitungMasaKerja() + " bulan");
        System.out.println("Kontrak Habis: " + kontrakHabis.format(formatter));
        System.out.printf("Gaji Pokok   : Rp %,d,00\n", (int)getGajiPokok());
    }
}
