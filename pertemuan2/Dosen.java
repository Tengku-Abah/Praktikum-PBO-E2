package PBO.pertemuan2;

public class Dosen {
    private String nip;
    private String nama;
    private String prodi;

    public Dosen(){

    }
    // Konstruktor
    public Dosen(String nip, String nama, String prodi){
        this.nip=nip;
        this.nama=nama;
        this.prodi=prodi;
    
    }
    //selektor
    public String getnip(){
        return this.nip;
    }
    
    public String getnama(){
        return this.nama;
    }

    public String getprodi(){
        return this.prodi;
    }

    //mutator
    public void setnip(String nip){
        this.nip = nip;
    }

    public void setnama(String nama){
        this.nama = nama;
    }

    public void setprodi(String prodi){
        this.prodi = prodi;
    }

}
