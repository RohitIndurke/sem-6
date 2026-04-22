import java.util.*;

public class ques2 {
    public static void main(String[] args){
        ArrayList<String> list=new ArrayList<>();
        list.add("A"); list.add("BB"); list.add("CCC");

        list.sort(Comparator.comparingInt(String::length));
        System.out.println(list);
    }
}
