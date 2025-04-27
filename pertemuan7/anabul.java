package PBO.pertemuan7;

/*  Nama File   : anabul.java
 *  Deskripsi   : Kelas anabul sebagai Supercalss
 *  Pembuat     : Tengku Muhamad Afif A
 *  NIM         : 24060123140165
 *  Tanggal     : 26 april 2025
 */


public abstract class anabul {
    protected String nama;

    public anabul (String nama){
        this.nama = nama;
    }

    //getter 
    public String getNama(){
        return nama;
    }
    
    //setter 
    public void setNama(String nama){
        this.nama = nama;
    }

    //method 
    public abstract void gerak();
    public abstract void bersuara();
}