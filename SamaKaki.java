public class SamaKaki extends Segitiga{
    public SamaKaki (double alas, double tinggi){
        super.setNama("SamaKaki");
        this.hitungLuas(alas, tinggi);
        this.hitungKeliling(alas);
    }

    public void hitungLuas(double alas, double tinggi){
        super.luas = 0.5 * alas * tinggi;
    }

    public void hitungKeliling(double alas){
        super.keliling = 3 * alas;
    }

}