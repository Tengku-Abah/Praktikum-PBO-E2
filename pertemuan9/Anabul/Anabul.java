/*  Nama File   : Anabul.java
 *  Deskripsi   : Program untuk mendefinisikan kelas abstrak Anabul
 *  Pembuat     : Tengku Muhamad Afif A
 *  NIM         : 24060123140165
 *  Tanggal     : 10 Mei 202525
 */

public abstract class Anabul {
    protected String nama;
    
    public Anabul(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    

    public abstract void Gerak();
    public abstract void Bersuara();
}