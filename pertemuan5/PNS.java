package PBO.pertemuan6;

import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia implements Pajak {
    // Attributes
    private String nip;
    private static int counterPNS = 0;
    
    // Constructors
    public PNS(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String nip) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }
    
    public PNS(String nama, LocalDate tglMulaiKerja, double pendapatan, String nip) {
        super(nama, tglMulaiKerja, pendapatan);
        this.nip = nip;
        counterPNS++;
    }
    
    // Implementation of abstract methods
    @Override
    public int hitungMasaKerja() {
        LocalDate now = LocalDate.now();
        Period period = Period.between(tglMulaiKerja, now);
        // Let's assume 'A' is 3 (digit ke 14 of NIM)
        return period.getYears() + 3;
    }
    
    // Implementation of interface method
    @Override
    public double hitungPajak() {
        return 0.10 * pendapatan;
    }
    
    // Override print info method
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP: " + nip);
        System.out.println("Jenis: PNS");
    }
    
    // Getters and setters
    public String getNip() {
        return nip;
    }
    
    public void setNip(String nip) {
        this.nip = nip;
    }
    
    // Static method to get counter
    public static int getCounterPNS() {
        return counterPNS;
    }
}
