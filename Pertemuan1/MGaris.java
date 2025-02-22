package PBO.pertemuan1;



public class MGaris {
    public static void main(String[] args) {
        // Membuat beberapa titik untuk pengujian
        Titik t1 = new Titik(1, 1);
        Titik t2 = new Titik(4, 5);
        Titik t3 = new Titik(2, 2);
        Titik t4 = new Titik(6, 2);

        // Membuat garis dengan constructor default
        System.out.println("\n=== Pengujian Constructor Default ===");
        Garis g1 = new Garis();
        System.out.print("Garis 1: ");
        g1.display();

        // Membuat garis dengan constructor berparameter
        System.out.println("\n=== Pengujian Constructor Berparameter ===");
        Garis g2 = new Garis(t1, t2);
        System.out.print("Garis 2: ");
        g2.display();

        // Menguji getter dan perhitungan
        System.out.println("\n=== Pengujian Getter dan Perhitungan ===");
        System.out.println("Panjang Garis 2: " + g2.getPanjang());
        System.out.println("Gradien Garis 2: " + g2.getGradien());
        System.out.println("Persamaan Garis 2: " + g2.getPersamaan());

        // Menguji titik tengah
        Titik tengah = g2.getTitikTengah();
        System.out.println("Titik Tengah Garis 2: (" + tengah.getAbsis() + 
                          "," + tengah.getOrdinat() + ")");

        // Membuat garis ketiga untuk pengujian sejajar dan tegak lurus
        Garis g3 = new Garis(t3, t4);
        System.out.println("\n=== Pengujian Sejajar dan Tegak Lurus ===");
        System.out.print("Garis 3: ");
        g3.display();
        System.out.println("Garis 2 dan 3 sejajar? " + g2.isSejajar(g3));
        System.out.println("Garis 2 dan 3 tegak lurus? " + g2.isTegakLurus(g3));

        // Menampilkan jumlah objek garis yang telah dibuat
        System.out.println("\n=== Counter Garis ===");
        System.out.println("Jumlah garis yang telah dibuat: " + Garis.getCounterGaris());
    }
}
