import java.util.*;

public class ques2 {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();

        map.put("Pune",20);
        map.put("Mumbai",22);

        map.remove("Mumbai");

        System.out.println(map.get("Pune"));
    }
}
