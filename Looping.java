public class Looping{
    public static void main(String[] args) {
        for (int i=0; i<=9; i++){
            System.out.println("Saya semangat belajar java");
        }

        System.out.println("***************************");

        for (int i=2; i<=10; i+=2){
            System.out.print(i + " ");

            if (i == 10) {
                System.out.println(i + " ");
            }
        }
        
        System.out.println("***************************");

        for (int i=9; i>=-7; i-=3){
            System.out.println(i + " ");
        }

        System.out.println("***************************");

        for(int i=6; i<=10; i++){
            int hasil = 5 * i;
            System.out.println("5 x " + i + " = " + hasil);
        }

        System.out.println("***************************");
        int angka = 1;
        int langkah = 1;

        for (int i = 1; i <= 8; i++) {
            System.out.println(angka);
            langkah++;
            angka += langkah;
        }


    }
}