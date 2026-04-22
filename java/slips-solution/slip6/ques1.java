import java.util.*;

public class ques1 {
    public static void main(String[] args) {
        TreeSet<Integer> set=new TreeSet<>();
        set.add(5); set.add(2); set.add(8); set.add(2);

        System.out.println("Sorted: "+set);
        System.out.println("Search 5: "+set.contains(5));
    }
}
