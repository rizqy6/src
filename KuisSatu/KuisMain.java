package KuisSatu;

public class KuisMain {
    public static void main(String[] args) {
        Kuis nama1 = new Kuis("Muhammad");
        Kuis nama2 = new Kuis("Wahyu");
        Kuis nama3 = new Kuis("Syafi\'uddin");
        
        System.out.println("==================================");
        System.out.println("Nama ke-1 : " + nama1.nama);
        System.out.println("Nama ke-2 : " + nama2.nama);
        System.out.println("Nama ke-3 : " + nama3.nama);
        System.out.println("==================================");
        
        System.out.println("Jumlah object yang dibuat: " + Kuis.hitung);
        
        System.out.println("==================================");
    }
}




