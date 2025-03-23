package PBO.pertemuan6;

 public abstract class BangunDatar {
    // Attributes
    protected String warna;
    protected String border;
    
    // Constructors
    public BangunDatar() {
        this.warna = "putih";
        this.border = "hitam";
    }
    
    public BangunDatar(String warna, String border) {
        this.warna = warna;
        this.border = border;
    }
    
    // Abstract methods
    public abstract double getLuas();
    public abstract double getKeliling();
    
    // Methods to check equality of area and perimeter
    public boolean isEqualLuas(BangunDatar X) {
        return this.getLuas() == X.getLuas();
    }
    
    public boolean isEqualKeliling(BangunDatar X) {
        return this.getKeliling() == X.getKeliling();
    }
    
    // Getters and setters
    public String getWarna() {
        return warna;
    }
    
    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    public String getBorder() {
        return border;
    }
    
    public void setBorder(String border) {
        this.border = border;
    }
}