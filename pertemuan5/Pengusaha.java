package PBO.pertemuan6;

import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements Pajak {
    // Attributes
    private String npwp;
    private static int counterPengusaha = 0;
    
    // Constructors
    public Pengusaha(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String npwp) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }
    
    public Pengusaha(String nama, LocalDate tglMulaiKerja, double pendapatan, String npwp) {
        super(nama, tglMulaiKerja, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }
    
    // Implementation of abstract methods
    @Override
    public int hitungMasaKerja() {
        LocalDate now = LocalDate.now();
        Period period = Period.between(tglMulaiKerja, now);
        // Let's assume 'B' is 5 (digit ke 13 of NIM)
        return period.getYears() + 5;
    }
    
    // Implementation of interface method
    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }
    
    // Override print info method
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP: " + npwp);
        System.out.println("Jenis: Pengusaha");
    }
    
    // Getters and setters
    public String getNpwp() {
        return npwp;
    }
    
    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }
    
    // Static method to get counter
    public static int getCounterPengusaha() {
        return counterPengusaha;
    }
}
