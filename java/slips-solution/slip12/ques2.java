import java.util.*;

public class ques2 {
    public static void main(String[] args){
        ArrayDeque<String> dq=new ArrayDeque<>();

        dq.addFirst("A");
        dq.addLast("B");

        System.out.println(dq);
        dq.removeFirst();
        System.out.println(dq);
    }
}
