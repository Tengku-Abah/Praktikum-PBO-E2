package PBO.pertemuan9.Bangundatar;

import PBO.pertemuan5.BangunDatar;

/*  Nama File   : Persegi.java
 *  Deskripsi   : Program untuk mendefinisikan kelas Persegi yang merupakan turunan dari kelas BangunDatarGeneric
 *  Pembuat     : Tengku Muhamad Afif A
 *  NIM         : 24060123140165
 *  Tanggal     : 10 Mei 2025
 */
public class Persegi<T  extends Number> extends BangunDatar {
    private T sisi;

    public Persegi(T sisi) {
        this.sisi = sisi;
    }
    public T getsisi(){
        return sisi;
    }
    public void setsisi(T sisi){
        this.sisi=sisi;
    }

    @Override
    public double getLuas() {
        return return Math.pow(sisi.doubleValue(), 2);
    }

    @Override
    public double getKeliling() {
        return 4 * sisi.doubleValue();
    }

    @Override
    public void Tampilkan() {
        System.out.println("/******************* PERSEGI *******************/");
        System.out.println("Sisi: " + sisi);
        super.Tampilkan();
    }
    
}


