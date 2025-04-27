package PBO.pertemuan7;
/*  Nama File   : Overloading.java
 *  Deskripsi   : Penjelasan dan contoh Polimorfisme Ad Hoc (Overloading).
 *  Pembuat     : Tengku Muhamad Afif A
 *  NIM         : 24060123140165
 *  Tanggal     : 25 April 2025
 */

// Contoh Overloading pada Konstruktor dari BangunDatar.java
class ContohBangunDatar {
  protected int jmlSisi;
  protected String warna;
  protected String border;

  public ContohBangunDatar() {
    this.jmlSisi = 0;
    this.warna = "default";
    this.border = "default";
    System.out.println("tanpa parameter dipanggil.");
  }

  public ContohBangunDatar(int jmlSisi, String warna, String border) {
    this.jmlSisi = jmlSisi;
    this.warna = warna;
    this.border = border;
    System.out.println(" 3 parameter dipanggil.");
  }

  public ContohBangunDatar(int jmlSisi, String warna) {
    this(jmlSisi, warna, "solid"); 
    System.out.println(" 2 parameter dipanggil.");
  }
}

// Contoh Overloading Method Biasa
class Kalkulator {
  public int tambah(int a, int b) {
    System.out.println("Memanggil tambah(int, int)");
    return a + b;
  }

  public int tambah(int a, int b, int c) {
    System.out.println("Memanggil tambah(int, int, int)");
    return a + b + c;
  }

  public double tambah(double a, double b) {
    System.out.println("Memanggil tambah(double, double)");
    return a + b;
  }

  public double tambah(int a, double b) {
    System.out.println("Memanggil tambah(int, double)");
    return a + b;
  }

  public double tambah(double a, int b) {
    System.out.println("Memanggil tambah(double, int)");
    return a + b;
  }
}

public class Overloading {
  public static void main(String[] args) {
    System.out.println("--- Contoh Overloading Konstruktor ---");
    ContohBangunDatar bd1 = new ContohBangunDatar();
    ContohBangunDatar bd2 = new ContohBangunDatar(4, "Biru", "Garis Nyambung");
    ContohBangunDatar bd3 = new ContohBangunDatar(3, "putih");

    System.out.println("Jumlah sisi bd1: " + bd1.jmlSisi + ", Warna: " + bd1.warna + ", Border: " + bd1.border);
    System.out.println("Jumlah sisi bd2: " + bd2.jmlSisi + ", Warna: " + bd2.warna + ", Border: " + bd2.border);
    System.out.println("Jumlah sisi bd3: " + bd3.jmlSisi + ", Warna: " + bd3.warna + ", Border: " + bd3.border);

    System.out.println("\n--- Contoh Overloading Method ---");
    Kalkulator calc = new Kalkulator();
    System.out.println("Hasil 5 + 10 = " + calc.tambah(5, 10));
    System.out.println("Hasil 5 + 10 + 15 = " + calc.tambah(5, 10, 15));
    System.out.println("Hasil 3.5 + 2.7 = " + calc.tambah(3.5, 2.7));
    System.out.println("Hasil 5 + 4.2 = " + calc.tambah(5, 4.2));
    System.out.println("Hasil 6.1 + 9 = " + calc.tambah(6.1, 9));
  }
}

