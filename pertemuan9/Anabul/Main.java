/*  Nama File   : Main.java
 *  Deskripsi   : Program kelas App merupakan kelas utama untuk menjalankan program
 *  Pembuat     : Tengku Muhamad Afif A
 *  NIM         : 24060123140165
 *  Tanggal     : 10 Mei 2025
 */

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        
        KoleksiAnabul koleksiAnabul = new KoleksiAnabul();
        
        String[] namaKucing = {"BULUL", "MOKO", "MAYU", "SINA"};
        String[] namaAnjing = {"DOLI", "SEPP", "SUZII", "PURII"};
        String[] namaBurung = {"TINI", "UUWO", "ANG", "BRID"};
        
        Random random = new Random();
        
        for (int i = 0; i < 10; i++) {
            int tipe = random.nextInt(3);
            
            Anabul anabul;
            
            switch (tipe) {
                case 0: 
                    String namaK = namaKucing[random.nextInt(namaKucing.length)];
                    anabul = new Kucing(namaK);
                    break;
                case 1: 
                    String namaA = namaAnjing[random.nextInt(namaAnjing.length)];
                    anabul = new Anjing(namaA);
                    break;
                default: 
                    String namaB = namaBurung[random.nextInt(namaBurung.length)];
                    anabul = new Burung(namaB);
                    break;
            }
            
            koleksiAnabul.add(anabul);
            System.out.println("Nambah " + anabul.getNama()  );
        }
        
        System.out.println("");
        koleksiAnabul.showAll();
    }
}