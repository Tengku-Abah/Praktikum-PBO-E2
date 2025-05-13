/*  Nama File   : Kucing.java
 *  Deskripsi   : Program untuk mendefinisikan kelas Kucing yang merupakan turunan dari kelas Anabul
 *  Pembuat     : Tengku Muhamad Afif A
 *  NIM         : 24060123140165
 *  Tanggal     : 10 Mei 2025
 */

public class Kucing extends Anabul {
    
    public Kucing(String nama) {
        super(nama);
    }
    
    @Override
    public void Gerak() {
        System.out.println(nama + "  melata");
    }
    
    @Override
    public void Bersuara() {
        System.out.println(nama + "  meong");
    }
}