package PBO.pertemuan6;

import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak {
    // Attributes
    private String asalKota;
    private static int counterPetani = 0;
    
    // Constructors
    public Petani(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String asalKota) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.asalKota = asalKota;
        counterPetani++;
    }
    
    public Petani(String nama, LocalDate tglMulaiKerja, double pendapatan, String asalKota) {
        super(nama, tglMulaiKerja, pendapatan);
        this.asalKota = asalKota;
        counterPetani++;
    }
    
    // Implementation of abstract methods
    @Override
    public int hitungMasaKerja() {
        LocalDate now = LocalDate.now();
        Period period = Period.between(tglMulaiKerja, now);
        // Let's assume 'C' is 7 (digit ke 12 of NIM)
        return period.getYears() + 7;
    }
    
    // Implementation of interface method
    @Override
    public double hitungPajak() {
        return 0; // Farmers don't pay tax as per the requirement
    }
    
    // Override print info method
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota: " + asalKota);
        System.out.println("Jenis: Petani");
    }
    
    // Getters and setters
    public String getAsalKota() {
        return asalKota;
    }
    
    public void setAsalKota(String asalKota) {
        this.asalKota = asalKota;
    }
    
    // Static method to get counter
    public static int getCounterPetani() {
        return counterPetani;
    }
}
