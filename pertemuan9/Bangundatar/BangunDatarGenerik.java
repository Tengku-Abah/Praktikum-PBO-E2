/*  Nama File   : BangunDatarGeneric.java
 *  Deskripsi   : Program untuk mendefinisikan kelas BangundatarGeneric yang merupakan turunan dari kelas BangunDatar
 *  Pembuat     : Tengku Muhamad Afif A
 *  NIM         : 24060123140165
 *  Tanggal     : 10 Mei 2025
 */
public class BangunDatarGenerik<T extends BangunDatar> {
    private T bangun;

    public BangunDatarGenerik(T bangun) {
        this.bangun = bangun;
    }

    public double luas() {
        return bangun.hitungLuas();
    }

    public double keliling() {
        return bangun.hitungKeliling();
    }
}
