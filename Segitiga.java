public class Segitiga extends BangunDatar {
    protected double alas ;
    protected double tinggi;
    protected double sisi1;
    protected double sisi2;
    protected double sisi3;

    public void hitungLuas() {
        super.luas = 0.5 * alas * tinggi;
    }

    public void hitungKeliling() {
        super.keliling = sisi1 + sisi2 + sisi3;
    }
}