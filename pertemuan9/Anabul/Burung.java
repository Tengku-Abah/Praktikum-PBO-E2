/*  Nama File   : App.java
 *  Deskripsi   : Program untuk mendefinisikan kelas Burung yang merupakan turunan dari kelas Anabul
 *  Pembuat     : Tengku Muhamad Afif A
 *  NIM         : 24060123140165
 *  Tanggal     : 10 Mei 2025
 */

public class Burung extends Anabul {
    
    public Burung(String nama) {
        super(nama);
    }
    
    @Override
    public void Gerak() {
        System.out.println(nama + " terbang");
    }
    
    @Override
    public void Bersuara() {
        System.out.println(nama + "  cuit");
    }
}