package PBO.pertemuan1;

public class Garis {
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    // Constructor default
    public Garis() {
        titikAwal = new Titik(0, 0);
        titikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    // Constructor dengan parameter
    public Garis(Titik awal, Titik akhir) {
        titikAwal = awal;
        titikAkhir = akhir;
        counterGaris++;
    }

    // Getter dan Setter
    public Titik getTitikAwal() {
        return titikAwal;
    }

    public Titik getTitikAkhir() {
        return titikAkhir;
    }

    public void setTitikAwal(Titik titik) {
        titikAwal = titik;
    }

    public void setTitikAkhir(Titik titik) {
        titikAkhir = titik;
    }

    public static int getCounterGaris() {
        return counterGaris;
    }

    // Mendapatkan panjang garis
    public double getPanjang() {
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Mendapatkan gradien
    public double getGradien() {
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return dy / dx;
    }

    // Mendapatkan titik tengah
    public Titik getTitikTengah() {
        double mx = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double my = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(mx, my);
    }

    // Mengecek apakah sejajar dengan garis lain
    public boolean isSejajar(Garis g) {
        return Math.abs(this.getGradien() - g.getGradien()) < 0.0001;
    }

    // Mengecek apakah tegak lurus dengan garis lain
    public boolean isTegakLurus(Garis g) {
        return Math.abs(this.getGradien() * g.getGradien() + 1) < 0.0001;
    }

    // Menampilkan garis
    public void display() {
        System.out.println("Garis dari (" + titikAwal.getAbsis() + "," + 
                          titikAwal.getOrdinat() + ") ke (" + 
                          titikAkhir.getAbsis() + "," + 
                          titikAkhir.getOrdinat() + ")");
    }

    // Mendapatkan persamaan garis (y = mx + c)
    public String getPersamaan() {
        double m = this.getGradien();
        double c = titikAwal.getOrdinat() - m * titikAwal.getAbsis();
        return String.format("y = %.2fx + %.2f", m, c);
    }
}
