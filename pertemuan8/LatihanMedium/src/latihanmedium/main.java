/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanmedium;

/**
 *
 * @author ASUS
 */
public class main {
    public static void main(String[] args) {
        Senjata ak47 = new Senjata("TAR");
        Senjata m16 = new Senjata("DOR"); 
        KontrolSenjata kontrolak47 = new KontrolSenjata(ak47);
        KontrolSenjata kontrolm16 = new KontrolSenjata(m16);
        
        kontrolak47.menembak(2);
        kontrolak47.isiPeluru(3);
        kontrolak47.menembak(5);
        kontrolak47.menususk();
        
        
        System.out.println("=====================");
        
        kontrolm16.menembak(1);
        kontrolm16.isiPeluru(5);
        kontrolm16.menembak(2);
        kontrolm16.pasangBayonet();
        kontrolm16.menususk();
    }
    
}
