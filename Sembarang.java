public class Sembarang extends Segitiga {
    public Sembarang(double sisi1, double sisi2, double sisi3) {
        super.setNama("Sembarang");
        this.hitungLuas(sisi1, sisi2, sisi3);
        this.hitungKeliling(sisi1, sisi2, sisi3);
    }

    public void hitungLuas(double sisi1, double sisi2, double sisi3) {
        // Menggunakan rumus Heron untuk menghitung luas segitiga sembarang
        double semiPerimeter = (sisi1 + sisi2 + sisi3) / 2;
        super.luas = Math.sqrt(semiPerimeter * (semiPerimeter - sisi1) * (semiPerimeter - sisi2) * (semiPerimeter - sisi3));
    }

    public void hitungKeliling(double sisi1, double sisi2, double sisi3) {
        super.keliling = sisi1 + sisi2 + sisi3;
    }
}