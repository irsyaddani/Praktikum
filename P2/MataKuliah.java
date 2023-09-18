public class MataKuliah {
    String kodeMK, namaMK;
    double nilaiMK;

    MataKuliah(String kodeMK, String namaMK, double nilaiMK) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.nilaiMK = nilaiMK;
    }

    public void TampilData() {
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("Nama Mata Kuliah: " + namaMK);
        System.out.println("Nilai: " + nilaiMK);
    }
}