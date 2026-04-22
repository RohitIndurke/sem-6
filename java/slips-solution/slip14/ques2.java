import java.util.*;

public class ques2 {
    public static void main(String[] args){
        TreeMap<String,Integer> map=new TreeMap<>();

        map.put("A",1);
        map.put("C",3);
        map.put("B",2);

        System.out.println(map);
        System.out.println("First: "+map.firstKey());
    }
}
