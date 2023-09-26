package percobaan1;

public class MainPercobaan1 {
    public static void main(String[] args) {
        Processor p = new Processor("Intel i5", 3);
        // Laptop L = new Laptop("Thinkpad", p);
        // L.infoLaptop();

        Laptop l = new Laptop("Thinkpad", new Processor("Intel i5", 3));
        l.infoLaptop();
        
        Processor pl = new Processor();
        pl.setMerk("Intel i5");
        pl.setCache(4);
        Laptop L1 = new Laptop();
        L1.setMerk("Thinkpad");
        L1.setProcessor(pl);
        L1.infoLaptop();
    }
}
