/* File      :Titik.java
* Deskripsi : Class yang merepresentasikan titik pada koordinat kartesian
* Author    : Tengku Muhamad Afif Alghomidy
* Tanggal   : [Tanggal]
*/

package PBO.pertemuan1;

public class Titik {
     public double absis;
     public double ordinat;
     static int counterTitik = 0;

    // Constructor default
    public Titik() {
        absis = 0.0;
        ordinat = 0.0;
        counterTitik++;
    }

    // Constructor dengan parameter (overloading)
    public Titik(double x, double y) {
        this.absis = x;
        this.ordinat = y;
        counterTitik++;
    }

    // Getter dann Setter
    public void setAbsis(double x) {
        this.absis = x;
    }

    public void setOrdinat(double y) {
        this.ordinat = y;
    }

    public double getAbsis() {
        return this.absis;
    }

    public double getOrdinat() {
        return this.ordinat;
    }

    public static int getCounterTitik() {
        return counterTitik;
    }

    // Method untuk mendapatkan jarak titik dari titik pusat (0,0)
    public double getJarak() {
        return Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
    }

    // Method refleksi
    public void refleksiX() {
        this.ordinat = -this.ordinat;
    }

    public void refleksiY() {
        this.absis = -this.absis;
    }

    public Titik getRefleksiX() {
        return new Titik(this.absis, -this.ordinat);
    }

    public Titik getRefleksiY() {
        return new Titik(-this.absis, this.ordinat);
    }
}
