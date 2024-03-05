public class SikuSiku extends Segitiga{
    public SikuSiku (double alas, double tinggi){
        super.setNama("SikuSiku");
        this.hitungLuas(alas, tinggi);
        this.hitungKeliling(alas, tinggi);
    }

    public void hitungLuas(double alas, double tinggi){
        super.luas = 0.5 * alas * tinggi;
    }

    public void hitungKeliling(double alas, double tinggi) {
        double sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);
        super.keliling = alas + tinggi + sisiMiring;
    }

}