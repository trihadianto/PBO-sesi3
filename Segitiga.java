public class Segitiga extends BangunDatar{
    public Segitiga (double alas, double tinggi){
        super.setNama("Segitiga");
        this.hitungLuas(alas, tinggi);
        this.hitungKeliling(alas, tinggi);
    }

    public void hitungLuas(double alas, double tinggi){
        super.luas = 0.5 * alas * tinggi;
    }

    public void hitungKeliling(double alas, double tinggi){
        super.keliling = alas * 5 ;
    } 
}
