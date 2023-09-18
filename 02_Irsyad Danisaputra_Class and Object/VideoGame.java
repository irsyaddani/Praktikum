public class VideoGame {
    public String idGame;
    public String namaGame;
    public int harga;

    public void tampilGame() {
        System.out.println("Nama Game\t\t: " + namaGame);
        System.out.println("ID Game\t\t\t: " + idGame);
        System.out.println("Harga\t\t\t: " + "Rp " + harga);
        System.out.println("-----------------------------------------");
    }
}