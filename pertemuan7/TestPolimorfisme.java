package PBO.pertemuan7;
/*  Nama File   : TestPolimorfisme.java
 *  Deskripsi   : Berisi atribut dan method dalam class BangunDatar
 *  Pembuat     : Tengku Muhamad Afif A
 *  NIM         : 24060123140165
 *  Tanggal     : 26 april 2025
 */
import java.util.ArrayList;
public class TestPolimorfisme {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Programmer("yanto");
        Pegawai pegawai2 = new Manajer("anwar");
        Manajer pegawai3 = new Manajer("gorgon");

        ArrayList<Pegawai> emp = new ArrayList<>();
        emp.add(pegawai1);
        emp.add(pegawai2);
        emp.add(pegawai3);

        for (Pegawai empData : emp) {
            empData.tampilData();
            System.out.println();
        }
    }
}
