
/*  Nama File   : ArrayListTest.java
 *  Deskripsi   : Program penggunaan objek ArrayList sebagai Collection class
 *  Pembuat     : Tengku Muhamad Afif A
 *  NIM         : 24060123140165
 *  Tanggal     : 10 Mei 2025
 */
import java.util.ArrayList;

public class ArrayListTast {
    public static void main(String[] args){
        ArrayList<String>  string = new ArrayList<String>();

        string.add("praktikum");
        string.add("collection ");
        string.add("dan Generik");

        string.remove("praktikum");

        for(String s : string){
            System.out.print(s+"");
        }
    }
    
}