package PBO.pertemuan6;
import java.time.LocalDate;


public abstract class Manusia {
    // Attributes
    protected String nama;
    protected LocalDate tglMulaiKerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;
    
    // Constructors
    public Manusia(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tglMulaiKerja = tglMulaiKerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }
    
    public Manusia(String nama, LocalDate tglMulaiKerja, double pendapatan) {
        this(nama, tglMulaiKerja, "Alamat belum diisi", pendapatan);
    }
    
    // Abstract methods
    public abstract int hitungMasaKerja();
    
    // Method to print information
    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Mulai Kerja: " + tglMulaiKerja);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
    }
    
    // Getters and setters
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public LocalDate getTglMulaiKerja() {
        return tglMulaiKerja;
    }
    
    public void setTglMulaiKerja(LocalDate tglMulaiKerja) {
        this.tglMulaiKerja = tglMulaiKerja;
    }
    
    public String getAlamat() {
        return alamat;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public double getPendapatan() {
        return pendapatan;
    }
    
    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }
    
    // Static method to get counter
    public static int getCounterMns() {
        return counterMns;
    }
}
