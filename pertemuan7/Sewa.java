package PBO.pertemuan7;
/*  Nama File   : Sewa.java
 *  Deskripsi   : Kelas sewa digunakan untuk menghitung biaya sewa kendaraan melalui metode utilitas bernama hitungSewa().
 *  Pembuat     :Tengku Muhamad Afif Alghomidy
 *  NIM         : 24060123140165
 *  Tanggal     : 25 April 2025
 */

public class Sewa {

  static void hitungSewa(Vehicle v, int jarak, float hargaPerKm) {
    v.calRent(jarak, hargaPerKm);
  }

  public static void main(String[] args) {
    Vehicle kendaraan = new Vehicle();
    Vehicle mobil = new Car();
    Vehicle bis = new Bus();

    System.out.println("\n/+++++++++++++++++++++ tidak hitung sewa +++++++++++++++++++++/");
    kendaraan.calRent(50, 1000);
    mobil.calRent(50, 1000);
    bis.calRent(50, 1000);

    System.out.println("\n/+++++++++++++++++++++ dengan sewa +++++++++++++++++++++/");
    hitungSewa(kendaraan, 50, 1000);
    hitungSewa(mobil, 50, 1000);
    hitungSewa(bis, 50, 1000);
  }
}
