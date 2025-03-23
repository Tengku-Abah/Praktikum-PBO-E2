package PBO.pertemuan6;

 public interface IResize {
    // Add size by 10%
    public void zoomIn();
    
    // Reduce size by 10%
    public void zoomOut();
    
    // Scale size by given percentage
    public void zoom(int percent);
}
