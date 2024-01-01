package Percobaan2;

public class ClassB extends ClassA {
    private int z;

    public void setZ(int Z) {
        this.z = z;
    }

    public void getNilaiZ() {
        System.out.println("Nilai Z: " + z);
    }

    public void getJumlah() {
        System.out.println("Jumlah: " + (getX() + getY() + z));
    }
}
