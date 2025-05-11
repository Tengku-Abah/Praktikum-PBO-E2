/*  Nama File   : Anjing.java
 *  Deskripsi   : Program untuk mendefinisikan kelas Anjing yang merupakan turunan dari kelas Anabul
 *  Pembuat     : Tengku Muhamad Afif A
 *  NIM         : 24060123140165
 *  Tanggal     : 10 Mei 2025
 */

public class Anjing extends Anabul {
    
    public Anjing(String nama) {
        super(nama);
    }
    
    @Override
    public void Gerak() {
        System.out.println(nama + "  melata");
    }
    
    @Override
    public void Bersuara() {
        System.out.println(nama + "  guk-guk");
    }
}