/*  Nama File   : PersegiPanjang.java
 *  Deskripsi   : Program untuk mendefinisikan kelas PersegiPanjang yang merupakan turunan dari kelas BangunDatarGenerik
 *  Pembuat     : Tengku Muhamad Afif A
 *  NIM         : 24060123140165
 *  Tanggal     : 10 Mei 2025
 */

public class PersegiPanjang extends BangunDatar {
    private double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getpanjang(){
        return panjang;
    }

    public void setpanjang(double panjang){
        this.panjang=panjang;
    }

    public double getlebar(){
        return lebar;
    }
    public void setlebar(double lebar){
        this.lebar=lebar;
    }

    public double hitungLuas() {
        return panjang * lebar;
    }

    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
}