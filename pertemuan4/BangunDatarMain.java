/*  Nama File   : BangunDatarMain.java
 *  Deskripsi   : Berisi atribut dan method dalam class BangunDatarMain
 *  Pembuat     : Tengku Muhamad Afif A
 *  NIM         : 24060123140165
 *  Tanggal     : 15 Maret 2025
 */

public class BangunDatarMain {
    public static void main(String[] args) {
        
        System.out.println("================= PERSEGI =======================");
        Persegi persegi = new Persegi(5, "Merah", "Putih");
        System.out.println("Luas P: " + persegi.getLuas());
        System.out.println("Keliling P: " + persegi.getKeliling());
        System.out.println("Diagonal P: " + persegi.getDiagonal());
        persegi.printInfo();

        System.out.println("\n================= LINGKARAN =======================");
        Lingkaran lingkaran = new Lingkaran(0, "Biru", "Hitam");
        lingkaran.setJariJari(7);
        System.out.println("Luas L: " + lingkaran.getLuas());
        System.out.println("Keliling L: " + lingkaran.getKeliling());
        System.out.println("Jari-jari L: " + lingkaran.getJariJari());
        lingkaran.printInfo();

        System.out.println("\n================= HASIL BANGUN DATAR =======================");
        BangunDatar.printCounterBangunDatar();
        
        
    }
}
