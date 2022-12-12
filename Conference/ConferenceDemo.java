package Conference;

public class ConferenceDemo {
    public static void main(String[] args) {
        Delegasi d1 = new Delegasi("Bjorka");
        // d1.nama = "Bjorka Hengker";
        System.out.println(d1.instansi);
        // System.out.println(d1.nama);
        d1.menyapa("Bjorka");
    }
}
