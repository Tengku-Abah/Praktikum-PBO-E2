
/*  Nama File   : Segitiga.java
 *  Deskripsi   : Program untuk mendefinisikan kelas Segitiga yang merupakan turunan dari kelas BangunDatarGenerik
 *  Pembuat     : Tengku Muhamad Afif A
 *  NIM         : 24060123140165
 *  Tanggal     : 10 Mei 2025
 */
public class Segitiga extends BangunDatar {
    private double alas, tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double getalas(){
        return alas;
    }

    public void setalas(double alas) {
        this.alas = alas;
    }

    public double gettinggi() {
        return tinggi;
    }

    public void settinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    public double hitungKeliling() {
        return alas + tinggi + Math.sqrt(alas * alas + tinggi * tinggi);
    }
}