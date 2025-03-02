package PBO.pertemuan2;

public class Matakuliah {
    private String idMatkul;
    private String namaMatkul;
    private int sks;


    public Matakuliah(){

    }

    public Matakuliah(String idMatkul, String namaMatkul, int sks){
        this.idMatkul=idMatkul;
        this.namaMatkul=namaMatkul;
        this.sks=sks;
    }

    //selektor
    public String getidMatkul(){
        return this.idMatkul;
    }

    public String getnamaMatkul(){
        return this.namaMatkul;
    }

    public int getsks(){
        return this.sks;
    }

    //mutator
    public void setidMatkul(String idMatkul){
        this.idMatkul=idMatkul;
    }

    public void setnamaMatkul(String namaMatkul){
        this.namaMatkul=namaMatkul;
    }

    public void setsks(int sks){
        this.sks=sks;
    }


}
