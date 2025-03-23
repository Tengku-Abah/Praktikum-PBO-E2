package PBO.pertemuan6;

/**
 * File: Main.java
 * Description: Main class to test BangunDatar implementations
 * Date: March 23, 2025
 */

public class Main {
    public static void main(String[] args) {
        // Part 1 - Testing Abstract Classes
        System.out.println("=== TESTING ABSTRACT CLASSES ===");
        
        // Following line will cause an error since BangunDatar is abstract
        // BangunDatar B1 = new BangunDatar();
        
        BangunDatar P1 = new Persegi(10);
        Persegi P2 = new Persegi(5);
        BangunDatar L1 = new Lingkaran(7);
        Lingkaran L2 = new Lingkaran(14);
        
        System.out.println("Luas Persegi P1: " + P1.getLuas());
        System.out.println("Keliling Persegi P1: " + P1.getKeliling());
        System.out.println("Luas Persegi P2: " + P2.getLuas());
        System.out.println("Keliling Persegi P2: " + P2.getKeliling());
        
        System.out.println("Luas Lingkaran L1: " + L1.getLuas());
        System.out.println("Keliling Lingkaran L1: " + L1.getKeliling());
        System.out.println("Luas Lingkaran L2: " + L2.getLuas());
        System.out.println("Keliling Lingkaran L2: " + L2.getKeliling());
        
        // Testing equality methods
        System.out.println("P1 has equal area to L1? " + P1.isEqualLuas(L1));
        System.out.println("P2 has equal perimeter to L2? " + P2.isEqualKeliling(L2));
        
        // Creating another square with the same area as P1
        double sideLength = Math.sqrt(P1.getLuas());
        Persegi P3 = new Persegi(sideLength);
        System.out.println("P1 has equal area to P3? " + P1.isEqualLuas(P3));
        
        // Part 2 - Testing Interface
        System.out.println("\n=== TESTING INTERFACE ===");
        
        // Test zoomIn for Persegi
        System.out.println("Persegi P2 sisi before zoomIn: " + ((Persegi)P2).getSisi());
        P2.zoomIn();
        System.out.println("Persegi P2 sisi after zoomIn: " + P2.getSisi());
        
        // Test zoomOut for Lingkaran
        System.out.println("Lingkaran L2 jariJari before zoomOut: " + L2.getJariJari());
        L2.zoomOut();
        System.out.println("Lingkaran L2 jariJari after zoomOut: " + L2.getJariJari());
        
        // Test zoom for Persegi
        System.out.println("Persegi P2 sisi before zoom(200): " + P2.getSisi());
        P2.zoom(200);
        System.out.println("Persegi P2 sisi after zoom(200): " + P2.getSisi());
        
        // Test interface polymorphism
        IResize[] shapes = new IResize[2];
        shapes[0] = P2;
        shapes[1] = L2;
        
        System.out.println("\nTesting interface polymorphism:");
        for (IResize shape : shapes) {
            if (shape instanceof Persegi) {
                System.out.println("Persegi before zoomIn: " + ((Persegi)shape).getSisi());
                shape.zoomIn();
                System.out.println("Persegi after zoomIn: " + ((Persegi)shape).getSisi());
            } else if (shape instanceof Lingkaran) {
                System.out.println("Lingkaran before zoomIn: " + ((Lingkaran)shape).getJariJari());
                shape.zoomIn();
                System.out.println("Lingkaran after zoomIn: " + ((Lingkaran)shape).getJariJari());
            }
        }
    }
}