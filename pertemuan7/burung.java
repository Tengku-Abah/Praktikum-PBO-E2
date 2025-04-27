package PBO.pertemuan7;
/*  Nama File   : burung.java
 *  Deskripsi   : Kelas Burung sebagai subclass
 *  Pembuat     : Tengku Muhamad Afif A
 *  NIM         : 24060123140165
 *  Tanggal     : 26 april 2025
 */
public class burung extends anabul {
    public burung (String nama){
        super(nama);
    }

    @Override
    public void gerak(){
        System.out.println(getNama() + "Bergerak dengan cara teerbang");
    }

    @Override
    public void bersuara(){

        System.out.println(getNama() + "bersuara : Cuitt-cuit");
    }
}
