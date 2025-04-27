package PBO.pertemuan7;
/*  Nama File   : MainAnabul.java
 *  Deskripsi   : Kelas main untuk menguji kelas anabul dan subclass-nya.
 *  Pembuat     : Tengku Muhamad Afif A
 *  NIM         : 24060123140165
 *  Tanggal     : 26 april 2025
 */
public class MainAnabul {
    public static void main(String[] args) {
        anabul kucing = new kucing("bagas");
        anabul anjing = new anjing("supri");
        anabul burung = new burung("adi");

        kucing.gerak();
        kucing.bersuara();
        System.out.println("\n");
        anjing.gerak();
        anjing.bersuara();
        System.out.println("\n");
        burung.gerak();
        burung.bersuara();
    }
}