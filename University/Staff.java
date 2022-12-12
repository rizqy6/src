package University;

public class Staff extends Member {
    // String nama = "Staff";
    String nip;
    String jenisKelamin;
    float gaji;
    static final int maxHariCuti = 10;

    public Staff(){
        System.out.println("Object Staff berhasil dibuat");
    }

    public Staff(String masukan){
        this();
        this.nama = masukan;
    }

    public Staff(String masukan, String nip, String jenisKelamin, float gaji){
        this(masukan);
        this.nip = nip;
        this.jenisKelamin = jenisKelamin;
        this.gaji = gaji;
    }

    void presensi(){
        System.out.println("Fingerprint");
    }
    

    
}
