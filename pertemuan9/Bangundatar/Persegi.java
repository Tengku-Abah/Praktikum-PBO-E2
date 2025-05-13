/*  Nama File   : Persegi.java
 *  Deskripsi   : Program untuk mendefinisikan kelas Persegi yang merupakan turunan dari kelas BangunDatarGenerik
 *  Pembuat     : Tengku Muhamad Afif A
 *  NIM         : 24060123140165
 *  Tanggal     : 10 Mei 2025
 */
public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    public double getsisi() {
        return sisi;
    }

    public void setsisi(double sisi) {
        this.sisi = sisi;
    }


    public double hitungLuas() {
        return sisi * sisi;
    }

    public double hitungKeliling() {
        return 4 * sisi;
    }
}