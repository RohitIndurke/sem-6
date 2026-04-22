import java.util.*;

public class ques2 {
    public static void main(String[] args){
        HashMap<String,Integer> map=new HashMap<>();
        map.put("A",2);
        map.put("B",3);

        System.out.println(Collections.max(map.values()));
    }
}
