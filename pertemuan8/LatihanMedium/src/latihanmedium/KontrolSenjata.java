/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanmedium;

/**
 *
 * @author ASUS
 */
public class KontrolSenjata {
    private Senjata senjata;

    public KontrolSenjata(Senjata s) {
        this.senjata = s;
    }
    
    public boolean isAdaPeluru(){
        return senjata.getPeluru() > 0;
    } 
    
    public void isiPeluru(int jumlahPeluru){
        int totalPeluru = senjata.getPeluru() + jumlahPeluru;
        senjata.setPeluru(totalPeluru);
        System.out.println(">> peluru berhasil di tambahkan : " + jumlahPeluru);
    }
    
    public void menembak(int jumlah) {
    System.out.println(">> Siap menembak " + jumlah + " kali");

    if (!isAdaPeluru()) {
        System.out.println("Peluru Habis");
    } else {
        for (int i = 0; i < jumlah; i++) {
            if (isAdaPeluru()) {
                System.out.println(senjata.getBunyi());
                senjata.setPeluru(senjata.getPeluru() - 1);
            } else {
                System.out.println("Gagal tembak, Peluru Habis");
            }
        }
    }

    System.out.println(">> Peluru sisa: " + senjata.getPeluru());
}

        
    
    public void menususk(){
        if (senjata.isMenusuk()){
            System.out.println("senjata menusuk!");
        }else{
            System.out.println("senjata tidak bisa menusuk.");
        }
    }
    
    public void pasangBayonet(){
        senjata.setMenusuk(true);
    }
}
