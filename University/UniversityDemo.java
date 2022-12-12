package University;

import java.util.Scanner;

public class UniversityDemo {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        Mahasiswa mhs1 = new Mahasiswa();

        // use scanner for setter
        System.out.print("Masukkan nama: ");
        mhs1.setNama(scn.nextLine());
        System.out.print("Masukkan NIM: ");
        mhs1.setNim(scn.nextLine());
        System.out.print("Masukkan alamat: ");
        mhs1.setAlamat(scn.nextLine());
        System.out.print("Masukkan IPK: ");
        mhs1.setIpk(scn.nextFloat());

        System.out.println("----------");

        mhs1.presensi();
        mhs1.parkir();;


        // mhs1.setNama("Vestia Zeta");
        // mhs1.setNim("L200210056");
        // mhs1.setAlamat("Jl. Jalan Pagi");
        // mhs1.setIpk(5.00f);

        // System.out.println("Nama: " + mhs1.getNama() + "\nNIM: " + mhs1.getNim() + "\nAlamat: " + mhs1.getAlamat() + "\nIPK: " + mhs1.getIpk());
        Dosen dsn1 = new Dosen();
        dsn1.cekNamaMhs(mhs1);
        dsn1.cekNimMhs(mhs1);
        dsn1.cekAlamatMhs(mhs1);
        dsn1.cekIpkMhs(mhs1);


        Dosen dsn2 = new Dosen();
        dsn2.presensi();

        Mahasiswa m = new Mahasiswa();
        m.presensi();
        m.sobron();

    }
}
