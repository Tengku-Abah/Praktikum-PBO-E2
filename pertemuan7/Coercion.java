package PBO.pertemuan7;
/*  Nama File   : Coercion.java
 *  Deskripsi   : Konversi otomatis tipe data, seperti dari kecil ke besar (widening) atau besar ke kecil (narrowing).
 *  Pembuat     : Tengku Muhamad Afif Alghomidy
 *  NIM         : 24060123140165
 *  Tanggal     : 25 April 2025
 */

public class Coercion {
  public static void main(String[] args) {
    int output1 = 'a';
    System.out.println("1. output1 = 'a'  -> " + output1);
  
    int y = 40;
    double output2 = y;
    System.out.println("2. output2 = y    -> " + output2);

    int z = 30;
    char output3 = (char) z;
    System.out.println("3. output3 = (char)z -> " + output3);

    char a = 'b';
    double output4 = a;
    System.out.println("4 output4 = a    -> " + output4);
  }
}