package PBO.pertemuan7;
/*  Nama File   : mobil.java
 *  Deskripsi   : Kelas mobil sebagai subclass dari vehicle.
 *  Pembuat     : Tengku Muhamad Afif Alghomidy
 *  NIM         : 24060123140165
 *  Tanggal     : 25 April 2025
 */

public class mobil extends Vehicle {
  @Override
  void calRent(int jarak, float harga) {
    float fare = jarak * harga;
    fare = fare - 100.0f; 
    System.out.println("harga sewa  = " + fare);
  }
}