import java.util.*;

public class Maptest{
    public static void main(String[] args){
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(1,"satu");
        map.put(2,"dua");
        map.put(5,"lima");
        map.put(9,"sembilan");

        System.out.println(map.get(9));

        Set<Integer> key = map.keySet();
    }
}