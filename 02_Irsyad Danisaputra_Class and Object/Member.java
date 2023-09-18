public class Member {
    public String idMember;
    public String namaMember;

    public void tampilMember() {
        System.out.println("=========================================");
        System.out.println("Data Peminjaman Game oleh Member");
        System.out.println("=========================================");
        System.out.println("Nama Member\t\t: " + namaMember);
        System.out.println("ID Member\t\t: " + idMember);
        System.out.println("-----------------------------------------");
    }
}