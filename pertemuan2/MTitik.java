package PBO.pertemuan2;

public class MTitik{
    public static void main(String[] args) {
        // Membuat objek titik
        Titik t1 = new Titik(1,2);
        Titik t2 = new Titik(3, 4);

        // Menampilkan nilai awal
        System.out.println("Titik t1: (" + t1.getAbsis() + "," + t1.getOrdinat() + ")");
        System.out.println("Titik t2: (" + t2.getAbsis() + "," + t2.getOrdinat() + ")");
        
        // Mengubah nilai t1
        t1.setAbsis(5);
        t1.setOrdinat(6);
        System.out.println("\nSetelah mengubah t1:");
        System.out.println("Titik t1: (" + t1.getAbsis() + "," + t1.getOrdinat() + ")");
        
        // Menampilkan jumlah titik yang telah dibuat
        System.out.println("\nJumlah objek titik: " + Titik.getCounterTitik());
        
        // Mencoba refleksi
        t2.refleksiX();
        System.out.println("\nTitik t2 setelah refleksi X: (" + t2.getAbsis() + "," + t2.getOrdinat() + ")");
        
        // Mencoba get refleksi
        Titik t3 = t1.getRefleksiY();
        System.out.println("Refleksi Y dari t1: (" + t3.getAbsis() + "," + t3.getOrdinat() + ")");

        
    }
}
