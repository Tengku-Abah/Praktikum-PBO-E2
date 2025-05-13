/*  Nama File   : mainBangun.java
 *  Deskripsi   : Program untuk mendemonstrasikan penggunaan kelas generik
 *  Pembuat     : Tengku Muhamad Afif A
 *  NIM         : 24060123140165
 *  Tanggal     : 10 Mei 2025
 */
public class MainBangun {
    public static void main(String[] args) {
        BangunDatarGenerik<Persegi> persegi = new BangunDatarGenerik<>(new Persegi(11));
        System.out.println("Luas persegi: " + persegi.luas());
        System.out.println("Keliling persegi: " + persegi.keliling());

        BangunDatarGenerik<PersegiPanjang> pp = new BangunDatarGenerik<>(new PersegiPanjang(6, 3));
        System.out.println("Luas persegi panjang: " + pp.luas());
        System.out.println("Keliling persegi panjang: " + pp.keliling());

        BangunDatarGenerik<Segitiga> segitiga = new BangunDatarGenerik<>(new Segitiga(27, 2));
        System.out.println("Luas segitiga: " + segitiga.luas());
        System.out.println("Keliling segitiga: " + segitiga.keliling());
    }
}
