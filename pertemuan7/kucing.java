package PBO.pertemuan7;
/*  Nama File   : kucing.java
 *  Deskripsi   : Kelas Burung sebagai subclass
 *  Pembuat     : Tengku Muhamad Afif A
 *  NIM         : 24060123140165
 *  Tanggal     : 26 april 2025
 */
public class kucing extends anabul{
    public kucing(String nama){
        super(nama);
    }

    @Override
    public void gerak(){
        System.out.println(getNama() + " Begeraknya dengan cara melata");
    }

    @Override
    public void bersuara(){
        System.out.println(getNama() + " bersuara : Meong");
    }
}
