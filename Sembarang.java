public class Sembarang extends Segitiga {
    public Sembarang(double sisi1, double sisi2, double sisi3) {
        super.setNama("Sembarang");
        this.hitungLuas(sisi1, sisi2, sisi3);
        this.hitungKeliling(sisi1, sisi2, sisi3);
    }

    public void hitungLuas(double sisi1, double sisi2, double sisi3) {
        double semiParameter = (sisi1 + sisi2 + sisi3) / 2;
        super.luas = Math.sqrt(semiParameter * (semiParameter - sisi1) * (semiParameter - sisi2) * (semiParameter - sisi3));
    }

    public void hitungKeliling(double sisi1, double sisi2, double sisi3) {
        super.keliling = sisi1 + sisi2 + sisi3;
    }
}
