package PBO.pertemuan7;
/*  Nama File   : Pegawai.java
 *  Deskripsi   : Kelas pegawai sebagai superclass dari kelas manajer dan programmer.
 *  Pembuat     : Tengku Muhamad Afif A
 *  NIM         : 24060123140165
 *  Tanggal     : 26 april 2025
 */
public class Pegawai {
    protected String nama;
    protected int gajiPokok = 5000000;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilData() {
        System.out.println("Nama : " + nama + ", Gaji pokok : " + gajiPokok);
    }
}
