import java.time.LocalDate;

class Dosen extends Pegawai {
    private String fakultas;

    // Konstruktor dengan LocalDate (supaya bisa dipakai oleh DosenTetap & DosenTamu)
    public Dosen(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String fakultas) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.fakultas = fakultas;
    }

    public String getFakultas() {
        return fakultas;
    }

    public String getJabatan() {
        return "Dosen";
    }
}
