package PBO.pertemuan9.Bangundatar;

import PBO.pertemuan5.BangunDatar;

/*  Nama File   : PersegiPanjang.java
 *  Deskripsi   : Program untuk mendefinisikan kelas PersegiPanjang yang merupakan turunan dari kelas BangunDatarGeneric
 *  Pembuat     : Tengku Muhamad Afif A
 *  NIM         : 24060123140165
 *  Tanggal     : 10 Mei 2025
 */
public class PersegiPanjang extends BangunDatar {
     private T panjang, lebar;

    public Persegipanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public T getpanjang(){
        return panjang;
    }

    public void setpanjang(T panjang){
        this.pajang=panjang;
    }

    public T getlebar(){
        return lebar;
    }

    public void setlebar(T lebar){
        this.lebar=lebar;
    }
    @Override
    public double getLuas() {
        return panjang.doubleValue() * lebar.doubleValue();
    }
    @Override
    public double getKeliling() {
        return 2 * (panjang.doubleValue() + lebar.doubleValue());
    }
    @Override
    public void Tampilkan() {
        System.out.println("/******************* PERSEGI PANJANG *******************/");
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
        super.Tampilkan();
    }
    
}
