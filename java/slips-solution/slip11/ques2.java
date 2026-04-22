import java.util.*;

public class ques2 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(3); list.add(1); list.add(5);

        Collections.sort(list);
        System.out.println("Sorted: "+list);
        System.out.println("Frequency of 1: "+Collections.frequency(list,1));
    }
}
