import java.util.*;

public class ques2 {
    public static void main(String[] args){
        HashMap<String,Integer> map=new HashMap<>();

        map.put("A",80);
        map.put("B",60);

        for(String k:map.keySet()){
            System.out.println(k+" "+map.get(k));
        }
    }
}
