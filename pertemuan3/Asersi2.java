package PBO.pertemuan3;

class lingkaran{
    private double jarijari;
    public lingkaran (double jarijari){
        this.jarijari = jarijari;

    }
    public double hitungkeliling(){
        double keliling = 2*Math.PI*jarijari;
        return keliling;
    }
    
}
 
public class Asersi2 {
    public static void main(String[] args){
        double jarijari = 0;
        assert (jarijari>0) : "jari jari tidak boleh nol!!!";
        lingkaran L = new lingkaran(jarijari);
        double kelilinglingkaran = L.hitungkeliling();
        System.out.println("keliling lingkaran = " + kelilinglingkaran);
    }
}
