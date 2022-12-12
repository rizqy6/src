package KuisSatu;

public class Kuis {
    // Variable
    String nama;
    static int hitung;

    // Constructor
    public Kuis(String nama) {
        this.nama = nama;
        hitungObject();
    }

    // Method
    void hitungObject(){
        hitung++;
    }
}

