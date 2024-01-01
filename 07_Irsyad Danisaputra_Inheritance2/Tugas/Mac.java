package Tugas;

public class Mac extends Leptop {
    public String security;

    Mac() {
    }

    Mac(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei, String security) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBatrei);
        this.security = security;
    }

    void tampilMac() {
        super.tampilLeptop();
        System.out.println("Security\t= " + security);
    }
}
