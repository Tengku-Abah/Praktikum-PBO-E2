package PBO.pertemuan7;
/*  Nama File   : ajing.java
 *  Deskripsi   : Kelas ajing sebagai subclass
 *  Pembuat     : Tengku Muhamad Afif A
 *  NIM         : 24060123140165
 *  Tanggal     : 26 april 2025
 */
public class anjing extends anabul {
    public anjing(String nama){
        super(nama);
    }

    @Override
    public void gerak(){
        System.out.println(getNama() + "Bergerak dengan cara melata");
    }

    @Override 
    public void bersuara(){
        System.out.println(getNama() + "Bersuara : Guk-Guk");
    }
}
