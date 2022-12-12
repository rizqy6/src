package University;

public class Mahasiswa extends Member implements KontrakMember {
    // private String nama = "Student";
    private String nim;
    // private String alamat;
    private float ipk;
    private static final float maxIPK = 4.00f;

    public Mahasiswa(){
        System.out.println("Object Mahasiswa berhasil dibuat");
    }

    public Mahasiswa(String masukan){
        this();
        this.nama = masukan;
    }

    public Mahasiswa(String masukan, float nilai){
        this(masukan);
        this.ipk = nilai;
    }

    public Mahasiswa(String masukan, String nim, String alamat, float ipk){
        this(masukan, ipk);
        this.nim = nim;
        this.alamat = alamat;
    }

    public void setNama(String nama){
        while(nama instanceof String == false){
            System.out.println("Nama harus berupa String");
            break;
        }
        this.nama = nama;
    }

    public String getNama(){
        while(nama != "null"){
            return this.nama;
        }
        return "Nama belum diisi";
    }

    public void setNim(String nim){
        while(nim instanceof String == false){
            System.out.println("NIM harus berupa String");
            System.out.println();
            break;
        }
        this.nim = nim;
    }

    public String getNim(){
        while(nim != "null"){
            return this.nim;
        }
        return "NIM belum diisi";
    }

    public void setAlamat(String alamat){
        while(alamat instanceof String == false){
            System.out.println("Alamat harus berupa String");
            break;
        }
        this.alamat = alamat;
    }

    public String getAlamat(){
        while(alamat != "null"){
            return this.alamat;
        }
        return "Alamat belum diisi";
    }

    public void setIpk(float ipk){
        while(ipk > maxIPK || Float.class.isInstance(ipk) == false){
            System.out.println("IPK tidak boleh lebih dari " + maxIPK);
            break;
        }
        this.ipk = ipk;
    }

    public float getIpk(){
        while(ipk != 0){
            return this.ipk;
        }
        return 0;
    }

    void isiKRS(){
        System.out.println("Mahasiswa telah mengisi KRS");
    }
    
    float ambilNilai(){
        return ipk;
    }

    void revisiNilai(float ipk){
        this.ipk = ipk;
    }

    public void menyapa(String nama){
        System.out.println("Hello, saia Mahasiswa Bernama " + nama);
    }

    @Override
    public void presensi(){
        System.out.println("Tanda Tangan!");
    }

    @Override
    public void sobron() {
        // TODO Auto-generated method stub
            System.out.println("Mahasiswa sobron");
    }

    
    
}
