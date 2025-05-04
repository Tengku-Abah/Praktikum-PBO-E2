/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generik;

/**
 *
 * @author ASUS
 */
public class kucing extends Anabul{
    public kucing(String nama){
        super(nama);
    }
    
    @Override
    public void gerak(){
        System.out.println(getNama() + "bergeraknya dengan cara melata");
    }
    
    @Override
    public void bersuara(){
        System.out.println(getNama() + "bersuara : meong");
    }
}
