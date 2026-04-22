import java.util.*;

public class ques2 {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");

        list.addLast("D");
        list.removeFirst();

        ListIterator<String> it=list.listIterator(list.size());
        while(it.hasPrevious()){
            System.out.print(it.previous()+" ");
        }
    }
}
