package University;

public class Dosen extends Member {
    // private String nama;
    private String nidn;
    private float gaji;

    public void cekNamaMhs(Mahasiswa mhs){
        System.out.println("Nama: " + mhs.getNama());
    }

    public void cekNimMhs(Mahasiswa mhs){
        System.out.println("Nim: " + mhs.getNim());
    }

    public void cekAlamatMhs(Mahasiswa mhs){
        System.out.println("Alamat: " + mhs.getAlamat());
    }

    public void cekIpkMhs(Mahasiswa mhs){
        System.out.println("IPK: " + mhs.getIpk());
    }

    void presensi(){
        System.out.println("Fingerprint");
    }
    
}
