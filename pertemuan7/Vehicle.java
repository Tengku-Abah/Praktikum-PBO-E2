package PBO.pertemuan7;
/*  Nama File   : Vehicle.java
 *  Deskripsi   : Kelas vehicle sebagai superclass dari car dan bus
 *  Pembuat     : Tengku Muhamad Afif Alghomidu
 *  NIM         : 24060123140165
 *  Tanggal     : 25 April 2025
 */

public class Vehicle {
  void calRent(int distance, float price) {
    float fare = distance * price;
    System.out.println("vehicle price = " + fare);
  }
}