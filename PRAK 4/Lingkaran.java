/*Nama  : Kaila Talitha Putri 
 *Nim   : 24060123140179
  Kelas : C
 */

public class Lingkaran extends BangunDatar{
    private double jari;


    public Lingkaran(){
        setJmlSisi(1);
    }

    public Lingkaran(double diameter, String warna, String border){
        this.jari = diameter/2;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(1);
    }

    public double getJari(){
        return jari;
    }

    public void setJari(double jari){
        this.jari = jari;
    }

    public double getLuas(){
        return Math.PI *jari*jari;
    }

    public double getKeliling(){
        return Math.PI*2*jari;
    }

    @Override
    public void printInfo() {
        super.printInfo(); 
        System.out.println("Jari-jari  : " + getJari());
        System.out.println("Luas       : " + getLuas());
        System.out.println("Keliling   : " + getKeliling());
}

}
