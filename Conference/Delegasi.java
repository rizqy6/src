package Conference;

import University.Mahasiswa;

public class Delegasi extends Mahasiswa {
    String instansi = "UMS";

    Delegasi(String masukan){
        super(masukan);
        System.out.println("Delegasi baru telah dibuat");
    }

    void cetakNama(){
        // System.out.println(this.nama);
    }

    public void menyapa(String nama){
        System.out.println("Hai, saia Delegasi bernama " + nama);
    }
}
