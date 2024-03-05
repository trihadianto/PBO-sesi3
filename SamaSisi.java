public class SamaSisi extends Segitiga{
    public SamaSisi (double alas, double tinggi){
        super.setNama("SamaSisi");
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