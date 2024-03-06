public class App {
    public static void main(String[] args) {
        Persegi persegi = new Persegi(2.0);
        persegi.getInfo(); 
        System.out.println();

        Lingkaran lingkaran = new Lingkaran(7.0);
        lingkaran.getInfo();
        System.out.println();
        
        SamaSisi samasisi = new SamaSisi(5.0, 4.0);
        samasisi.getInfo();
        System.out.println();

        SamaKaki Samakaki = new SamaKaki(10.0, 3.0);
        Samakaki.getInfo();
        System.out.println();

        SikuSiku Sikusiku = new SikuSiku(10.0, 5.0);
        Sikusiku.getInfo();
        System.out.println();

        Sembarang Sembarang = new Sembarang(5.0, 5.0, 4.0);
        Sembarang.getInfo();
    }
}
