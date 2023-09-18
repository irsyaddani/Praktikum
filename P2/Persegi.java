public class Persegi {
    int sisi;

    public void inputData(int sisi) {
        this.sisi = sisi;
    }

    public void tampilSisi() {
        System.out.print("Sisi: "+ sisi);
    }

    public int luasPersegi() {
        return sisi * sisi;
    }

    public int kelilingPersegi() {
        return 4 * sisi;
    }
}