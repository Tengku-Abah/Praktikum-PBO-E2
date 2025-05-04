/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generik;

/**
 *
 * @author ASUS
 */
public class Datum<T>{
    private T isi;
    
    public Datum(T isi){
        this.isi = isi;
    }
    
    public T getIsi(){
        return isi;
    }
    
    public void setIsi(T isi){
        this.isi = isi;
    }
}
