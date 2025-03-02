package PBO.pertemuan2;

public class kendaraan {
    private String plat;
    private String jenis;

    public kendaraan(){

    }

    public kendaraan(String plat,String jenis){
        this.plat=plat;
        this.jenis=jenis;
    }

    //selektor
    public String getplat(){
        return this.plat;
    }

    public String getjenis(){
        return this.jenis;
    }
    
    //mutator
    public void setplat(String plat){
        this.plat=plat;
    }

    public void setjenis(String jenis){
        this.jenis=jenis;
    }
}
