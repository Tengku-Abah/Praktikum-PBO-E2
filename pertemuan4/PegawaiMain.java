/*  Nama File   : PegawaiMain.java
 *  Deskripsi   : Main class untuk menguji sistem pegawai
 *  Pembuat     : Tengku Muhamad Afif A
 *  NIM         : 24060123140165
 *  Tanggal     : 15 Maret 2025
 */

import java.time.LocalDate;

public class PegawaiMain {
    public static void main(String[] args) {
        // Tanggal sekarang: 15 Maret 2025
    
        DosenTetap dosenTetap = new DosenTetap(
            "230103450182", 
            "90332538", 
            "Tengku", 
            LocalDate.of(2000, 4, 8), 
            LocalDate.of(2005, 8, 4),
            10000000.0, 
            "Fakultas Sains dan Matematika"
        );
        
        DosenTamu dosenTamu = new DosenTamu(
            "95403853549", 
            "922351367", 
            "Bima", 
            LocalDate.of(1998, 7, 15), 
            LocalDate.of(2021, 3, 1), 
            400000.0, 
            "Fakultas Budaya",
            LocalDate.of(2026, 9, 1) 
        );
        
        Tendik tendik = new Tendik(
            "32406759", 
            "Asep", 
            LocalDate.of(1980, 11, 10), 
            LocalDate.of(2015, 6, 1), 
            3000000.0, 
            "Akademik"
        );

        Pegawai pegawai = new Pegawai("199001152015041001", "Ahmad Rizky", LocalDate.of(1990, 1, 15), LocalDate.of(2015, 4, 1), 4500000);
        
        System.out.println("================ DOSEN TETAP =================");
        dosenTetap.printInfo();
        
        System.out.println("\n================  DOSEN TAMU =================");
        dosenTamu.printInfo();
        
        System.out.println("\n================  TENDIK =================");
        tendik.printInfo();

        System.out.println("\n================ PEGAWAI =================");
        pegawai.printInfo(); 
    }
}