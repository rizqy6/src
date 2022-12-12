package University;

public abstract class Member  {
    String nama, alamat;

    abstract void presensi();

    void parkir(){
        System.out.println("Semua anggota UMS dapat melakukan parkir");
    }
}
