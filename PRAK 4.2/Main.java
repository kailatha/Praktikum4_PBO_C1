import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        DosenTetap dosenTetap = new DosenTetap("987654321", "78564321", "Rina", LocalDate.of(1987, 9, 10), LocalDate.of(2012, 7, 1), 6000000, "Fakultas Ilmu Komputer");
        DosenTamu dosenTamu = new DosenTamu("876543210", "67891234", "Joko", LocalDate.of(1982, 3, 15), LocalDate.of(2008, 1, 10), 4800000, "Fakultas Ekonomi", LocalDate.of(2027, 12, 31));
        Tendik tendik = new Tendik("765432109", "Lina", LocalDate.of(1990, 5, 5), LocalDate.of(2014, 2, 1), 4200000, "Administrasi Akademik");
        
        System.out.println("****** Dosen Tetap ******");
        dosenTetap.printInfo();
        
        System.out.println("\n****** Dosen Tamu ******");
        dosenTamu.printInfo();
        
        System.out.println("\n****** Tenaga Pendidik ******");
        tendik.printInfo();
    }
}
