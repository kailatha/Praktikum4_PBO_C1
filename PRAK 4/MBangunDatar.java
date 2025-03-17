/*Nama  : Kaila Talitha Putri 
 *Nim   : 24060123140179
  Kelas : C
 */

 public class MBangunDatar {
    public static void main(String[] args) {
        // Membuat objek Persegi
        Persegi persegi = new Persegi(6, "Pink", "Putih");
        System.out.println("=== Info Persegi ===");
        persegi.printInfo();

        System.out.println();

        Lingkaran lingkaran = new Lingkaran(10, "Biru", "Hitam");
        System.out.println("=== Info Lingkaran ===");
        lingkaran.printInfo();
    }
}
