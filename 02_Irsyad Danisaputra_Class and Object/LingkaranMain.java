public class LingkaranMain {
    public static void main(String[] args) {
        Lingkaran ling1 = new Lingkaran();
        ling1.phi = 3.14;
        ling1.r = 4; //dalam cm
        System.out.println("Lingkaran 1");
        System.out.println("Luas lingkaran 1 adalah " + ling1.hitungLuas() + " cm"); 
        System.out.println("Keliling lingkaran 1 adalah " + ling1.hitungKeliling() + " cm"); 
    }
}