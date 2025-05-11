

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