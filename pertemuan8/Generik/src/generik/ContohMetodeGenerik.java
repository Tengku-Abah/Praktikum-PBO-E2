/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generik;

/**
 *
 * @author ASUS
 */
public class ContohMetodeGenerik {
  public static <T extends Anabul> void tampilkanperilaku(Datum<T> data){
      T anabul = data.getIsi();
      anabul.gerak();
      anabul.bersuara();
  }  
}
