public class Tugas1Main {
    public static void main(String[] args) {
        Member memb1 = new Member();
        memb1.namaMember = "Falah";
        memb1.idMember = "10";
        memb1.tampilMember();

        VideoGame game1 = new VideoGame();
        game1.namaGame = "Genshin Impact";
        game1.idGame = "2110";
        game1.harga = 75000;
        game1.tampilGame();

        Peminjaman pinjam1 = new Peminjaman();
        
        pinjam1.idMember = "10";
        pinjam1.lamaPinjam = 10; //hari
        pinjam1.TampilDataPeminjaman(game1.namaGame, game1.harga);

    } 
}