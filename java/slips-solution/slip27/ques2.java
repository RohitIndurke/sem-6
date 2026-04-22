import java.util.*;

public class ques2 {
    public static void main(String[] args){
        HashMap<String,Integer> map=new HashMap<>();
        map.put("A",10);
        map.put("B",20);

        int sum=0;
        for(int v:map.values())
            sum+=v;

        System.out.println(sum);
    }
}
