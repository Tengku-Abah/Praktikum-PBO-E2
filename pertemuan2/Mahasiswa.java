package PBO.pertemuan2;

import java.util.ArrayList;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    private ArrayList<Matakuliah> listmatkul;
    private Dosen doswal;
    private kendaraan kendaraan;
    
    



    public Mahasiswa(){
        this.listmatkul= new ArrayList<>();

    }

    public Mahasiswa(String nim,String nama,String prodi){
        this.nim=nim;
        this.nama=nama;
        this.prodi=prodi;
        this.listmatkul = new ArrayList<>();
    }

    //selektor 
    public String getnim(){
        return this.nim;
    }

    public String getnama(){
        return nama;
    }

    public String getprodi(){
        return this.prodi;
    }

    public Dosen getdoswal(){
        return this.doswal;
    }

    public kendaraan getkendaraan(){
        return this.kendaraan;
    }


    //mutator
    public void setnim(String nim){
        this.nim=nim;
    }
    
    public void setnama(String nama){
        this.nama=nama;
    }

    public void setprodi(String prodi){
        this.prodi=prodi;
    }

    public void setdoswal(Dosen doswal){
        this.doswal=doswal;
    }

    public void setkendaraan(kendaraan kendaraan){
        this.kendaraan=kendaraan;
    }


    //Method
    public void addmatkul(Matakuliah matkul){
        if(this.listmatkul.size() < 50){
            this.listmatkul.add(matkul);
        }else{
            System.err.println("list Matakuliah penuh");
        }
    }

    public int getjumlahsks(){
        int jumlah=0;
        for(Matakuliah matkul : this.listmatkul){
            jumlah += matkul.getsks();
        }
        return jumlah;
    }

    public int  getjumlahmatkul(){
        return this.listmatkul.size();
    }

    public void printMhs(){
        System.out.println( "NIM : " + nim + ", Nama : " + nama + ", prodi : " + prodi);
      }
   
      //menampilkan detail mahasiswa 
      public void printDetailMhs(){
         System.out.println( "NIM : " + nim + ", Nama : " + nama + ", prodi : " + prodi);
         System.out.println("Mata Kuliah Yang Diambil : ");
         for (int i = 0; i < listmatkul.size();i++){
            System.out.println("- " + listmatkul.get(i).getnamaMatkul() + " (" + listmatkul.get(i).getsks() + " SKS)");
         }
         System.out.println("Dosen Wali: " + (doswal != null ? doswal.getnama() : "Belum ditentukan"));
         System.out.println("Kendaraan: " + (kendaraan != null ? kendaraan.getjenis() : "Belum ditentukan"));
   
      }



}   
