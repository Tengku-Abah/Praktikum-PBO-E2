/*  Nama File   : KoleksiAnabul.java
 *  Deskripsi   : Program untuk mendefinisikan kelas KoleksiAnabul yang merupakan koleksi dari objek Anabul
 *  Pembuat     : Tengku Muhamad Afif A
 *  NIM         : 24060123140165
 *  Tanggal     : 10 Mei 2025
 */

public class KoleksiAnabul {
    private Koleksi<Anabul> koleksi;
    
    public KoleksiAnabul() {
        koleksi = new Koleksi<>();
    }
    
    public void add(Anabul anabul) {
        koleksi.add(anabul);
    }
    
    public Anabul getAnabul(int index) {
        return koleksi.getIsi(index);
    }
    
    public int getSize() {
        return koleksi.getSize();
    }
    
    public void showAll() {
        System.out.println("Jumlah : " + koleksi.getSize());
        
        for (int i = 0; i < koleksi.getSize(); i++) {
            Anabul anabul = koleksi.getIsi(i);
            System.out.println("\n yang ke-" + (i + 1) + ":");
            System.out.println("Nama: " + anabul.getNama());
            anabul.Bersuara();
            anabul.Gerak();
        }
    }
}