public class TampilPersegi {
    public static void main(String[] args) {
        Persegi persegi1 = new Persegi();
        Persegi persegi2 = new Persegi();

        System.out.println("Data Persegi 1");
        persegi1.inputData(6);
        persegi1.tampilSisi();
        System.out.println();
        System.out.println("Luas persegi: " + persegi1.luasPersegi());
        System.out.println("Keliling persegi: " + persegi1.kelilingPersegi());
        System.out.println("-----------------------------------");
        System.out.println("Data Persegi 2");
        persegi2.inputData(4);
        persegi2.tampilSisi();
        System.out.println();
        System.out.println("Luas persegi: " + persegi2.luasPersegi());
        System.out.println("Keliling persegi: " + persegi2.kelilingPersegi());
        System.out.println("-----------------------------------");

    }
}

