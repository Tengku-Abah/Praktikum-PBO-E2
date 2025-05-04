/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generik;

/**
 *
 * @author ASUS
 */
public class main {
    public static void main(String[] args) {
        Anabul a1 = new kucing("puspus");
        Anabul a2 = new Anjing("Doggo");
        Anabul a3 = new burung("Tweety");
        
        Datum<Anabul> dataKucing = new Datum<>(a1);
        Datum<Anabul> dataAnjing = new Datum<>(a2);
        Datum<Anabul> dataBurung = new Datum<>(a3);
        
        ContohMetodeGenerik.tampilkanperilaku(dataBurung);
        ContohMetodeGenerik.tampilkanperilaku(dataAnjing);
        ContohMetodeGenerik.tampilkanperilaku(dataKucing);
        
 }
}