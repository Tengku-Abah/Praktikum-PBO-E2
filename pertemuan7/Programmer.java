package PBO.pertemuan7;
/*  Nama File   : Progremer.java
 *  Deskripsi   : Kelas programmer sebagai subclass dari kelas pegawai.
 *  Pembuat     : Tengku Muhamad Afif A
 *  NIM         : 24060123140165
 *  Tanggal     : 26 april 2025
 */
public class Programmer extends Pegawai {
    private int bonus = 450000;

    public Programmer(String nama) {
        setNama(nama);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    }
}
