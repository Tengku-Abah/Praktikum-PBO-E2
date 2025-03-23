package PBO.pertemuan6;


 public class Persegi extends BangunDatar implements IResize {
    // Attributes
    private double sisi;
    
    // Constructors
    public Persegi() {
        super();
        this.sisi = 1.0;
    }
    
    public Persegi(double sisi) {
        super();
        this.sisi = sisi;
    }
    
    public Persegi(double sisi, String warna, String border) {
        super(warna, border);
        this.sisi = sisi;
    }
    
    // Implementation of abstract methods
    @Override
    public double getLuas() {
        return sisi * sisi;
    }
    
    @Override
    public double getKeliling() {
        return 4 * sisi;
    }
    
    // Implementation of IResize interface methods
    @Override
    public void zoomIn() {
        sisi = sisi * 1.1;
    }
    
    @Override
    public void zoomOut() {
        sisi = sisi * 0.9;
    }
    
    @Override
    public void zoom(int percent) {
        sisi = sisi * percent/100;
    }
    
    // Getters and setters
    public double getSisi() {
        return sisi;
    }
    
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
}