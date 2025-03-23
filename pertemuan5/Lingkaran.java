package PBO.pertemuan6;

 public class Lingkaran extends BangunDatar implements IResize {
    // Attributes
    private double jariJari;
    
    // Constructors
    public Lingkaran() {
        super();
        this.jariJari = 1.0;
    }
    
    public Lingkaran(double jariJari) {
        super();
        this.jariJari = jariJari;
    }
    
    public Lingkaran(double jariJari, String warna, String border) {
        super(warna, border);
        this.jariJari = jariJari;
    }
    
    // Implementation of abstract methods
    @Override
    public double getLuas() {
        return Math.PI * jariJari * jariJari;
    }
    
    @Override
    public double getKeliling() {
        return 2 * Math.PI * jariJari;
    }
    
    // Implementation of IResize interface methods
    @Override
    public void zoomIn() {
        jariJari = jariJari * 1.1;
    }
    
    @Override
    public void zoomOut() {
        jariJari = jariJari * 0.9;
    }
    
    @Override
    public void zoom(int percent) {
        jariJari = jariJari * percent/100;
    }
    
    // Getters and setters
    public double getJariJari() {
        return jariJari;
    }
    
    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }
}